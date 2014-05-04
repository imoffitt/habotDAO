package info.habot.tm470.dao.wrapper;

import info.habot.tm470.dao.pojo.FusedSensorData;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
* FusedSensorDataWrapper implements RowMapper<FusedSensorData>
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public class FusedSensorDataWrapper implements RowMapper<FusedSensorData> {
	public FusedSensorData mapRow(ResultSet rs, int rowNum) throws SQLException {
		FusedSensorData fusedSensorData = new FusedSensorData();
		
		fusedSensorData.setNetworkLinkId(rs.getInt("networkLinkId"));
		fusedSensorData.setVehicleFlowRate(rs.getFloat("vehicleFlowRate"));
		fusedSensorData.setOccupancyPercentage(rs.getFloat("occupancyPercentage"));
		fusedSensorData.setAverageTimeHeadway(rs.getFloat("averageTimeHeadway"));
		fusedSensorData.setAverageVehicleSpeed(rs.getFloat("averageVehicleSpeed"));
		fusedSensorData.setTravelTime(rs.getFloat("travelTime"));
		fusedSensorData.setFreeFlowTravelTime(rs.getFloat("freeFlowTravelTime"));
		fusedSensorData.setNormallyExpectedTravelTime(rs.getFloat("normallyExpectedTravelTime"));
		fusedSensorData.setDerivedTime(rs.getString("derivedTime"));
		fusedSensorData.setPublishTime(rs.getString("publishTime"));
			
		return fusedSensorData;
	}
}
