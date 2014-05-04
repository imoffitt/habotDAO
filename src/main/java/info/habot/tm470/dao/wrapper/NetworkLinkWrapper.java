package info.habot.tm470.dao.wrapper;

import info.habot.tm470.dao.pojo.NetworkLink;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class NetworkLinkWrapper implements RowMapper<NetworkLink> {
	public NetworkLink mapRow(ResultSet rs, int rowNum) throws SQLException {
		NetworkLink networkLink = new NetworkLink();
		networkLink.setLinkId(rs.getInt("linkId"));
		networkLink.setLocationName(rs.getString("locationName"));
		networkLink.setCarriageway(rs.getString("carriageway"));
		networkLink.setLane(rs.getString("lane"));
		networkLink.setLengthAffected(rs.getInt("lengthAffected"));
		networkLink.setDirectionBound(rs.getString("directionBound"));
		networkLink.setRoadNumber(rs.getString("roadNumber"));
		networkLink.setLinearElementNature(rs.getString("linearElementNature"));
		networkLink.setFromDistanceAlong(rs.getInt("fromDistanceAlong"));
		networkLink.setFromNodeIdentifier(rs.getString("fromNodeIdentifier"));
		networkLink.setFromNodeType(rs.getString("fromNodeType"));
		networkLink.setToDistanceAlong(rs.getInt("toDistanceAlong"));
		networkLink.setToNodeIdentifier(rs.getString("toNodeIdentifier"));
		networkLink.setToNodeType(rs.getString("toNodeType"));

		return networkLink;
	}
}
