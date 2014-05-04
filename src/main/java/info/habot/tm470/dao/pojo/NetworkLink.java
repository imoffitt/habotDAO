package info.habot.tm470.dao.pojo;

/**
* NetworkLink - A link on the strategic road network (SRN)
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public class NetworkLink {

	private int linkId;
	private String locationName;
	private String carriageway;
	private String lane;
	private float lengthAffected;
	private String directionBound;
	private String roadNumber;
	private String linearElementNature;
	private float fromDistanceAlong;
	private String fromNodeIdentifier;
	private String fromNodeType;
	private float toDistanceAlong;
	private String toNodeIdentifier;
	private String toNodeType;
	
	
	public int getLinkId() {
		return linkId;
	}
	public void setLinkId(int linkId) {
		this.linkId = linkId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getCarriageway() {
		return carriageway;
	}
	public void setCarriageway(String carriageway) {
		this.carriageway = carriageway;
	}
	public String getLane() {
		return lane;
	}
	public void setLane(String lane) {
		this.lane = lane;
	}
	public float getLengthAffected() {
		return lengthAffected;
	}
	public void setLengthAffected(float lengthAffected) {
		this.lengthAffected = lengthAffected;
	}
	public String getDirectionBound() {
		return directionBound;
	}
	public void setDirectionBound(String directionBound) {
		this.directionBound = directionBound;
	}
	public String getRoadNumber() {
		return roadNumber;
	}
	public void setRoadNumber(String roadNumber) {
		this.roadNumber = roadNumber;
	}
	public String getLinearElementNature() {
		return linearElementNature;
	}
	public void setLinearElementNature(String linearElementNature) {
		this.linearElementNature = linearElementNature;
	}
	public float getFromDistanceAlong() {
		return fromDistanceAlong;
	}
	public void setFromDistanceAlong(float fromDistanceAlong) {
		this.fromDistanceAlong = fromDistanceAlong;
	}
	public String getFromNodeIdentifier() {
		return fromNodeIdentifier;
	}
	public void setFromNodeIdentifier(String fromNodeIdentifier) {
		this.fromNodeIdentifier = fromNodeIdentifier;
	}
	public String getFromNodeType() {
		return fromNodeType;
	}
	public void setFromNodeType(String fromNodeType) {
		this.fromNodeType = fromNodeType;
	}
	public float getToDistanceAlong() {
		return toDistanceAlong;
	}
	public void setToDistanceAlong(float toDistanceAlong) {
		this.toDistanceAlong = toDistanceAlong;
	}
	public String getToNodeIdentifier() {
		return toNodeIdentifier;
	}
	public void setToNodeIdentifier(String toNodeIdentifier) {
		this.toNodeIdentifier = toNodeIdentifier;
	}
	public String getToNodeType() {
		return toNodeType;
	}
	public void setToNodeType(String toNodeType) {
		this.toNodeType = toNodeType;
	}
	

}
