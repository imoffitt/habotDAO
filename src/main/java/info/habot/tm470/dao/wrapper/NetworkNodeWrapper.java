package info.habot.tm470.dao.wrapper;

import info.habot.tm470.dao.pojo.NetworkNode;

import java.awt.Point;
import java.awt.geom.Point2D;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author Ian
 *
 */
public class NetworkNodeWrapper implements RowMapper<NetworkNode> {
	public NetworkNode mapRow(ResultSet rs, int rowNum) throws SQLException {
		NetworkNode networkNode = new NetworkNode();
		networkNode.setNodeId(rs.getString("nodeId"));
		
		Point2D.Double point = null;
		
		try {
			
			Double latitude = rs.getDouble("x");
			Double longtitude = rs.getDouble("y");
			point = new Point2D.Double(latitude, longtitude);

		} catch (ClassCastException ex) {
			point = null;
		}
		
		networkNode.setLocation (point);
		
		return networkNode;
	}
}