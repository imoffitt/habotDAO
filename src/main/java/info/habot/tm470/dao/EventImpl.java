package info.habot.tm470.dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import info.habot.tm470.dao.interfaces.EventDAO;
import info.habot.tm470.dao.pojo.FusedSensorData;
import info.habot.tm470.dao.pojo.NetworkLink;
import info.habot.tm470.dao.pojo.StrategicEvent;
import info.habot.tm470.dao.wrapper.EventWrapper;
import info.habot.tm470.dao.wrapper.NetworkLinkWrapper;


/**
* EventImpl interface
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
@Repository
public class EventImpl implements EventDAO {

	private static final Logger log = Logger.getLogger(EventImpl.class.getName());

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	

	/* (non-Javadoc)
	 * @see info.habot.tm470.dao.interfaces.EventDAO#getActiveEvents()
	 */
	public List<StrategicEvent> getActiveEvents() {

		String SQL = "select * from Event where active = 1 order by dateCreated desc";
		
		List<StrategicEvent> strategicEventList = jdbcTemplateObject.query(SQL, new Object[] {},
				new EventWrapper());
		return strategicEventList;
	}
	
	/**
	 * @param eventId - Strategic Event Identifier
	 * @return Strategic Event
	 */
	public StrategicEvent getStrategicEvent(int eventId) {
		
		String SQL = "select * from Event where event_id = ?";
		
		StrategicEvent strategicEvent = jdbcTemplateObject.queryForObject(SQL,
				new Object[] { eventId }, new EventWrapper());
		
		return strategicEvent;
	}
}
