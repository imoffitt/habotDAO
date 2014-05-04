package info.habot.tm470.dao;

import info.habot.tm470.dao.NetworkLinkImpl;
import info.habot.tm470.dao.interfaces.NetworkLinkDAO;
import info.habot.tm470.dao.pojo.NetworkLink;
import info.habot.tm470.dao.wrapper.NetworkLinkWrapper;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

/**
* NetworkLinkImpl implements NetworkLinkDAO
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public class NetworkLinkImpl implements NetworkLinkDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	/* Get actual class name to be printed on */
	static Logger log = Logger.getLogger(NetworkLinkImpl.class.getName());

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.habot.tm470.interfaces.NetworkNodeDAO#create(int,
	 * java.lang.String, java.lang.String)
	 */
	public void create(NetworkLink networkLink) {
		String SQL = "insert into Network_Links (linkId," + "locationName,"
				+ "carriageway," + "lane," + "lengthAffected,"
				+ "directionBound," + "roadNumber," + "linearElementNature,"
				+ "fromDistanceAlong," + "fromNodeIdentifier,"
				+ "fromNodeType," + "toDistanceAlong," + "toNodeIdentifier,"
				+ "toNodeType) "
				+ " values (?, ?, ?, ?,?, ?, ?, ?,?, ?, ?, ?,?, ?)";

		jdbcTemplateObject.update(SQL, networkLink.getLinkId(),
				networkLink.getLocationName(), networkLink.getCarriageway(),
				networkLink.getLane(), networkLink.getLengthAffected(),
				networkLink.getDirectionBound(), networkLink.getRoadNumber(),
				networkLink.getLinearElementNature(),
				networkLink.getFromDistanceAlong(),
				networkLink.getFromNodeIdentifier(),
				networkLink.getFromNodeType(),
				networkLink.getToDistanceAlong(),
				networkLink.getToNodeIdentifier(), networkLink.getToNodeType());

		log.debug("Created networkLink = " + networkLink.getLinkId()
				+ " LocationName = " + networkLink.getLocationName());
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.habot.tm470.interfaces.NetworkNodeDAO#getNetworkNode(java.lang.Integer
	 * )
	 */
	public NetworkLink getNetworkLink(Integer id) {
		String SQL = "select * from Network_Links where linkId = ?";
		NetworkLink modelVersion = jdbcTemplateObject.queryForObject(SQL,
				new Object[] { id }, new NetworkLinkWrapper());
		return modelVersion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.habot.tm470.interfaces.NetworkNodeDAO#listNetworkNode()
	 */
	public List<NetworkLink> listNetworkLink() {
		String SQL = "select * from Network_Links";
		List<NetworkLink> networkLink = jdbcTemplateObject.query(SQL,
				new NetworkLinkWrapper());
		return networkLink;
	}

	public void delete(Integer id) {
		String SQL = "delete from Network_Links where linkId = ?";
		jdbcTemplateObject.update(SQL, id);
		log.debug("Deleted Network_Link with linkId = " + id);
		return;
	}

	public void update(NetworkLink networkLink) {
		String SQL = "update Network_Links set locationName = ?,"
				+ "carriagewa = ?y," + "lane = ?," + "lengthAffected = ?,"
				+ "directionBound = ?," + "roadNumber = ?,"
				+ "linearElementNature = ?," + "fromDistanceAlong = ?,"
				+ "fromNodeIdentifier = ?," + "fromNodeType = ?,"
				+ "toDistanceAlong = ?," + "toNodeIdentifier = ?,"
				+ "toNodeType = ? where linkId = ?";
		jdbcTemplateObject.update(SQL, networkLink.getLocationName(),
				networkLink.getCarriageway(), networkLink.getLane(),
				networkLink.getLengthAffected(),
				networkLink.getDirectionBound(), networkLink.getRoadNumber(),
				networkLink.getLinearElementNature(),
				networkLink.getFromDistanceAlong(),
				networkLink.getFromNodeIdentifier(),
				networkLink.getFromNodeType(),
				networkLink.getToDistanceAlong(),
				networkLink.getToNodeIdentifier(), networkLink.getToNodeType(),
				networkLink.getLinkId());

		log.debug("Updated networkLink = " + networkLink.getLinkId()
				+ " LocationName = " + networkLink.getLocationName());
		return;
	}
}
