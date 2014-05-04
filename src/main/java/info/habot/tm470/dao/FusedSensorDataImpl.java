package info.habot.tm470.dao;

import info.habot.tm470.dao.FusedSensorDataImpl;
import info.habot.tm470.dao.interfaces.FusedSensorDataDAO;
import info.habot.tm470.dao.pojo.FusedSensorData;
import info.habot.tm470.dao.wrapper.FusedSensorDataWrapper;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
* FusedSensorDataImpl implements FusedSensorDataDAO
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
@Repository
public class FusedSensorDataImpl implements FusedSensorDataDAO {
	
	private static final Logger log = Logger.getLogger(FusedSensorDataImpl.class.getName());

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public void createUpdate(FusedSensorData fusedSensorData) {
		
		String SQL = "insert into Fused_Sensor_Data (networkLinkId, vehicleFlowRate, occupancyPercentage, "
				+ "averageTimeHeadway, averageVehicleSpeed, travelTime,"
				+ "freeFlowTravelTime, normallyExpectedTravelTime, derivedTime, publishTime"
				+ ") values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE "
				+ "vehicleFlowRate = ?, occupancyPercentage = ?, "
				+ "averageTimeHeadway = ?, averageVehicleSpeed = ?, travelTime = ?,"
				+ "freeFlowTravelTime = ?, normallyExpectedTravelTime = ?, derivedTime = ?, publishTime = ?";

		jdbcTemplateObject.update(SQL, fusedSensorData.getNetworkLinkId(),
				fusedSensorData.getVehicleFlowRate(),
				fusedSensorData.getOccupancyPercentage(),
				fusedSensorData.getAverageTimeHeadway(),
				fusedSensorData.getAverageVehicleSpeed(),
				fusedSensorData.getTravelTime(),
				fusedSensorData.getFreeFlowTravelTime(),
				fusedSensorData.getNormallyExpectedTravelTime(),
				fusedSensorData.getDerivedTime(),
				fusedSensorData.getPublishTime(),
				fusedSensorData.getVehicleFlowRate(),
				fusedSensorData.getOccupancyPercentage(),
				fusedSensorData.getAverageTimeHeadway(),
				fusedSensorData.getAverageVehicleSpeed(),
				fusedSensorData.getTravelTime(),
				fusedSensorData.getFreeFlowTravelTime(),
				fusedSensorData.getNormallyExpectedTravelTime(),
				fusedSensorData.getDerivedTime(),
				fusedSensorData.getPublishTime());
		
		log.debug("Created/Updated Fused_Sensor_Data = " + fusedSensorData.toString() );
		
		return;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.habot.tm470.interfaces.NetworkNodeDAO#create(int,
	 * java.lang.String, java.lang.String)
	 */
	public void create(FusedSensorData fusedSensorData) {
		String SQL = "insert into Fused_Sensor_Data (networkLinkId, vehicleFlowRate, occupancyPercentage, "
				+ "averageTimeHeadway, averageVehicleSpeed, travelTime,"
				+ "freeFlowTravelTime, normallyExpectedTravelTime, derivedTime, publishTime"
				+ ") values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		jdbcTemplateObject.update(SQL, fusedSensorData.getNetworkLinkId(),
				fusedSensorData.getVehicleFlowRate(),
				fusedSensorData.getOccupancyPercentage(),
				fusedSensorData.getAverageTimeHeadway(),
				fusedSensorData.getAverageVehicleSpeed(),
				fusedSensorData.getTravelTime(),
				fusedSensorData.getFreeFlowTravelTime(),
				fusedSensorData.getNormallyExpectedTravelTime(),
				fusedSensorData.getDerivedTime(),
				fusedSensorData.getPublishTime());
		
//		log.debug("Created Fused_Sensor_Data = " + fusedSensorData.toString() );
		
		return;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.habot.tm470.interfaces.NetworkNodeDAO#getNetworkNode(java.lang.Integer
	 * )
	 */
	public List<FusedSensorData> getFusedSensorData (Integer id, String currentDateTime) {
		String SQL = "select * from Fused_Sensor_Data where networkLinkId = ? and derivedTime > ? order by derivedTime limit 1";
		List<FusedSensorData> fusedSensorDataList = jdbcTemplateObject.query(SQL, new Object[] { id, currentDateTime},
				new FusedSensorDataWrapper());
		return fusedSensorDataList;
	}

	public void delete(Integer id) {
		String SQL = "delete from Fused_Sensor_Data where networkLinkId = ?";
		jdbcTemplateObject.update(SQL, id);
		
		log.debug("Deleted Fused_Sensor_Data with networkLinkId = " + id);
		return;
	}

	public List<FusedSensorData> getFusedSensorData (Integer id) {
		String SQL = "select * from Fused_Sensor_Data where networkLinkId = ?";
		List<FusedSensorData> fusedSensorDataList = jdbcTemplateObject.query(SQL, new Object[] { id },
				new FusedSensorDataWrapper());
		return fusedSensorDataList;
	}

	public void update(FusedSensorData fusedSensorData) {
		String SQL = "update Fused_Sensor_Data set "
				+ "vehicleFlowRate = ?, "
				+ "occupancyPercentage = ?, "
				+ "averageTimeHeadway = ?, "
				+ "averageVehicleSpeed = ?, "
				+ "travelTime = ?, "
				+ "freeFlowTravelTime = ?, "
				+ "normallyExpectedTravelTime = ?, "
				+ "derivedTime = ?, "
				+ "publishTime = ?, "
				+ "where networkLinkId = ?";
		jdbcTemplateObject.update(SQL, fusedSensorData.getVehicleFlowRate(),
				fusedSensorData.getOccupancyPercentage(),
				fusedSensorData.getAverageTimeHeadway(),
				fusedSensorData.getAverageVehicleSpeed(),
				fusedSensorData.getTravelTime(),
				fusedSensorData.getFreeFlowTravelTime(),
				fusedSensorData.getNormallyExpectedTravelTime(),
				fusedSensorData.getDerivedTime(),
				fusedSensorData.getPublishTime(),
				fusedSensorData.getNetworkLinkId());
		
		log.debug("Updated Network_Nodes with NetworkLinkId = " + fusedSensorData.getNetworkLinkId());
		
		return;
	}
}
