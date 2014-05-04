package info.habot.tm470.dao.pojo;

/**
* FusedSensorData basic data structure for fused sensor data
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public class FusedSensorData {
	
	private int networkLinkId;
	private float vehicleFlowRate;
	private float occupancyPercentage;
	private float averageTimeHeadway;
	private float averageVehicleSpeed;
	private float travelTime;
	private float freeFlowTravelTime;
	private float normallyExpectedTravelTime;
	private String derivedTime;
	private String publishTime;
	
	public int getNetworkLinkId() {
		return networkLinkId;
	}
	public void setNetworkLinkId(int networkLinkId) {
		this.networkLinkId = networkLinkId;
	}
	public float getVehicleFlowRate() {
		return vehicleFlowRate;
	}
	public void setVehicleFlowRate(float vehicleFlowRate) {
		this.vehicleFlowRate = vehicleFlowRate;
	}
	public float getOccupancyPercentage() {
		return occupancyPercentage;
	}
	public void setOccupancyPercentage(float occupancyPercentage) {
		this.occupancyPercentage = occupancyPercentage;
	}
	public float getAverageTimeHeadway() {
		return averageTimeHeadway;
	}
	public void setAverageTimeHeadway(float averageTimeHeadway) {
		this.averageTimeHeadway = averageTimeHeadway;
	}
	public float getAverageVehicleSpeed() {
		return averageVehicleSpeed;
	}
	public void setAverageVehicleSpeed(float averageVehicleSpeed) {
		this.averageVehicleSpeed = averageVehicleSpeed;
	}
	public float getTravelTime() {
		return travelTime;
	}
	public void setTravelTime(float travelTime) {
		this.travelTime = travelTime;
	}
	public float getFreeFlowTravelTime() {
		return freeFlowTravelTime;
	}
	public void setFreeFlowTravelTime(float freeFlowTravelTime) {
		this.freeFlowTravelTime = freeFlowTravelTime;
	}
	public float getNormallyExpectedTravelTime() {
		return normallyExpectedTravelTime;
	}
	public void setNormallyExpectedTravelTime(float normallyExpectedTravelTime) {
		this.normallyExpectedTravelTime = normallyExpectedTravelTime;
	}
	public String getDerivedTime() {
		return derivedTime;
	}
	public void setDerivedTime(String derivedTime) {
		this.derivedTime = derivedTime;
	}
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(averageTimeHeadway);
		result = prime * result + Float.floatToIntBits(averageVehicleSpeed);
		result = prime * result
				+ ((derivedTime == null) ? 0 : derivedTime.hashCode());
		result = prime * result + Float.floatToIntBits(freeFlowTravelTime);
		result = prime * result + networkLinkId;
		result = prime * result
				+ Float.floatToIntBits(normallyExpectedTravelTime);
		result = prime * result + Float.floatToIntBits(occupancyPercentage);
		result = prime * result
				+ ((publishTime == null) ? 0 : publishTime.hashCode());
		result = prime * result + Float.floatToIntBits(travelTime);
		result = prime * result + Float.floatToIntBits(vehicleFlowRate);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FusedSensorData other = (FusedSensorData) obj;
		if (Float.floatToIntBits(averageTimeHeadway) != Float
				.floatToIntBits(other.averageTimeHeadway))
			return false;
		if (Float.floatToIntBits(averageVehicleSpeed) != Float
				.floatToIntBits(other.averageVehicleSpeed))
			return false;
		if (derivedTime == null) {
			if (other.derivedTime != null)
				return false;
		} else if (!derivedTime.equals(other.derivedTime))
			return false;
		if (Float.floatToIntBits(freeFlowTravelTime) != Float
				.floatToIntBits(other.freeFlowTravelTime))
			return false;
		if (networkLinkId != other.networkLinkId)
			return false;
		if (Float.floatToIntBits(normallyExpectedTravelTime) != Float
				.floatToIntBits(other.normallyExpectedTravelTime))
			return false;
		if (Float.floatToIntBits(occupancyPercentage) != Float
				.floatToIntBits(other.occupancyPercentage))
			return false;
		if (publishTime == null) {
			if (other.publishTime != null)
				return false;
		} else if (!publishTime.equals(other.publishTime))
			return false;
		if (Float.floatToIntBits(travelTime) != Float
				.floatToIntBits(other.travelTime))
			return false;
		if (Float.floatToIntBits(vehicleFlowRate) != Float
				.floatToIntBits(other.vehicleFlowRate))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "FusedSensorData [networkLinkId=" + networkLinkId
				+ ", vehicleFlowRate=" + vehicleFlowRate
				+ ", occupancyPercentage=" + occupancyPercentage
				+ ", averageTimeHeadway=" + averageTimeHeadway
				+ ", averageVehicleSpeed=" + averageVehicleSpeed
				+ ", travelTime=" + travelTime + ", freeFlowTravelTime="
				+ freeFlowTravelTime + ", normallyExpectedTravelTime="
				+ normallyExpectedTravelTime + ", derivedTime=" + derivedTime
				+ ", publishTime=" + publishTime + "]";
	}

}
