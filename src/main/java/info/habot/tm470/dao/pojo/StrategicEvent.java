package info.habot.tm470.dao.pojo;

/**
* StrategicEvent - An event that has occured on the strategic road network (SRN)
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public class StrategicEvent {
	
	private int event_id;
	private int link_id;
	private String event_type;
	private String dateCreated;
	private String dateCancelled;
	private float capacity_reduction;
	private boolean type_suitable;
	private boolean location_suitable;
	private boolean severity_suitable;
	private boolean consider_alternative_route;
	private boolean active;
	
	public StrategicEvent() {
		this.capacity_reduction = 0;
		this.type_suitable = false;
		this.location_suitable = false;
		this.severity_suitable = false;
		this.consider_alternative_route = false;
	}
	
	public static final String EVENT_TYPE_ACCIDENT = "Accident";
	
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public int getLink_id() {
		return link_id;
	}
	public void setLink_id(int link_id) {
		this.link_id = link_id;
	}
	public String getEvent_type() {
		return event_type;
	}
	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getDateCancelled() {
		return dateCancelled;
	}
	public void setDateCancelled(String dateCancelled) {
		this.dateCancelled = dateCancelled;
	}
	
	public boolean isType_suitable() {
		return type_suitable;
	}
	public void setType_suitable(boolean type_suitable) {
		this.type_suitable = type_suitable;
	}
	public boolean isLocation_suitable() {
		return location_suitable;
	}
	public void setLocation_suitable(boolean location_suitable) {
		this.location_suitable = location_suitable;
	}
	public boolean isSeverity_suitable() {
		return severity_suitable;
	}
	public void setSeverity_suitable(boolean severity_suitable) {
		this.severity_suitable = severity_suitable;
	}
	public boolean isConsider_alternative_route() {
		return consider_alternative_route;
	}
	public void setConsider_alternative_route(boolean consider_alternative_route) {
		this.consider_alternative_route = consider_alternative_route;
	}
	public float getCapacity_reduction() {
		return capacity_reduction;
	}
	public void setCapacity_reduction(float capacity_reduction) {
		this.capacity_reduction = capacity_reduction;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "StrategicEvent [event_id=" + event_id + ", link_id=" + link_id
				+ ", event_type=" + event_type + ", dateCreated=" + dateCreated
				+ ", dateCancelled=" + dateCancelled + ", type_suitable="
				+ type_suitable + ", location_suitable=" + location_suitable
				+ ", severity_suitable=" + severity_suitable
				+ ", consider_alternative_route=" + consider_alternative_route
				+ "]";
	}
}
