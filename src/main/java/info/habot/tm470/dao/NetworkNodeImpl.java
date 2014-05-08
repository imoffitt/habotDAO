package info.habot.tm470.dao;

import info.habot.tm470.dao.NetworkNodeImpl;
import info.habot.tm470.dao.interfaces.NetworkNodeDAO;
import info.habot.tm470.dao.pojo.NetworkNode;
import info.habot.tm470.dao.wrapper.NetworkNodeWrapper;

import java.util.HashMap;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

/**
* NetworkNodeImpl implements NetworkNodeDAO
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public class NetworkNodeImpl implements NetworkNodeDAO {
	
	static Logger log = Logger.getLogger(NetworkNodeImpl.class.getName());

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

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
	public void create(NetworkNode networkNode) {
		String SQL = "insert into Network_Nodes (nodeId, location) values (?, POINT(?, ?))";

		jdbcTemplateObject.update(SQL, networkNode.getNodeId(), networkNode.getLocation().x, networkNode.getLocation().y);
		
		log.debug("Created Network Node = " + networkNode.getNodeId() + " point = "
				+ networkNode.getLocation().toString() );
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.habot.tm470.interfaces.NetworkNodeDAO#getNetworkNode(java.lang.Integer
	 * )
	 */
	public NetworkNode getNetworkNode(Integer id) {
		String SQL = "select * from Network_Nodes where nodeId = ?";
		NetworkNode networkNode = jdbcTemplateObject.queryForObject(SQL,
				new Object[] { id }, new NetworkNodeWrapper());
		return networkNode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.habot.tm470.interfaces.NetworkNodeDAO#listNetworkNode()
	 */
	public List<NetworkNode> listNetworkNode() {
		String SQL = "select * from Network_Nodes";
		List<NetworkNode> networkNodes = jdbcTemplateObject.query(SQL,
				new NetworkNodeWrapper());
		return networkNodes;
	}
	
	/**
	 * @return HashMap<String, NetworkNode>
	 */
	public HashMap<String, NetworkNode> getNetworkNodes() {
		String SQL = "select * from Network_Nodes";
		List<NetworkNode> networkNodeList = jdbcTemplateObject.query(SQL,
				new NetworkNodeWrapper());
		
		HashMap<String, NetworkNode> networkNodeMap = new HashMap<String, NetworkNode> (networkNodeList.size());
		for (NetworkNode networkNode : networkNodeList) {
			networkNodeMap.put(networkNode.getNodeId(), networkNode);
		}
		
		return networkNodeMap;
	}

	public void delete(Integer id) {
		String SQL = "delete from Network_Nodes where nodeId = ?";
		jdbcTemplateObject.update(SQL, id);
		log.debug("Deleted Network_Nodes with ID = " + id);
		return;
	}

	public void update(NetworkNode networkNode) {
		String SQL = "update Network_Nodes set location = POINT(?, ?) where id = ?";
		jdbcTemplateObject.update(SQL, networkNode.getLocation().x, networkNode.getLocation().y, networkNode.getNodeId());
		log.debug("Updated Network_Nodes with ID = " + networkNode.getNodeId());
		return;
	}
}
