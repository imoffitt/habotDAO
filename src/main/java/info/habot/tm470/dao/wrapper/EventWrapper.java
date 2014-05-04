package info.habot.tm470.dao.wrapper;

import info.habot.tm470.dao.pojo.StrategicEvent;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
* EventWrapper implements RowMapper<StrategicEvent>
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public class EventWrapper implements RowMapper<StrategicEvent> {
	public StrategicEvent mapRow(ResultSet rs, int rowNum) throws SQLException {
		StrategicEvent strategicEvent = new StrategicEvent();
		
		strategicEvent.setDateCancelled(rs.getString("dateCancelled"));
		strategicEvent.setDateCreated(rs.getString("dateCreated"));
		strategicEvent.setEvent_id(rs.getInt("event_id"));
		strategicEvent.setEvent_type(rs.getString("event_type"));
		strategicEvent.setLink_id(rs.getInt("link_id"));
		strategicEvent.setActive(rs.getBoolean("active"));

		return strategicEvent;
	}
}
