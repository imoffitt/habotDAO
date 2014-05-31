package info.habot.tm470.dao.pojo;

/**
 * StrategicEvent - An event that has occured on the strategic road network
 * (SRN)
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

	private String event_sub_type;
	public static final String SUBTYPE_NORMAL = "Normal";
	public static final String SUBTYPE_INFORMATION = "Information";
	public static final String SUBTYPE_DIVERSION = "Diversion";
	
	private Route defaultRoute;
	private Route alternativeRoute;
	private VMSUnitEquipment vMSUnitEquipment;

	public StrategicEvent() {
		this.capacity_reduction = 0;
		this.type_suitable = false;
		this.location_suitable = false;
		this.severity_suitable = false;
		this.consider_alternative_route = false;
	}

	/**
	 * @param event_type
	 * @param dateCreated
	 * @param dateCancelled
	 * @param capacity_reduction
	 * @param type_suitable
	 * @param location_suitable
	 * @param severity_suitable
	 * @param consider_alternative_route
	 * @param active
	 */
	public StrategicEvent(String event_type, String dateCreated,
			String dateCancelled, float capacity_reduction,
			boolean type_suitable, boolean location_suitable,
			boolean severity_suitable, boolean consider_alternative_route,
			boolean active) {
		
		this.event_type = event_type;
		this.dateCreated = dateCreated;
		this.dateCancelled = dateCancelled;
		this.capacity_reduction = capacity_reduction;
		this.type_suitable = type_suitable;
		this.location_suitable = location_suitable;
		this.severity_suitable = severity_suitable;
		this.consider_alternative_route = consider_alternative_route;
		this.active = active;
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

	public String getEvent_sub_type() {
		return event_sub_type;
	}

	public void setEvent_sub_type(String event_sub_type) {
		this.event_sub_type = event_sub_type;
	}

	public Route getDefaultRoute() {
		return defaultRoute;
	}

	public void setDefaultRoute(Route defaultRoute) {
		this.defaultRoute = defaultRoute;
	}

	public Route getAlternativeRoute() {
		return alternativeRoute;
	}

	public void setAlternativeRoute(Route alternativeRoute) {
		this.alternativeRoute = alternativeRoute;
	}

	public VMSUnitEquipment getvMSUnitEquipment() {
		return vMSUnitEquipment;
	}

	public void setvMSUnitEquipment(VMSUnitEquipment vMSUnitEquipment) {
		this.vMSUnitEquipment = vMSUnitEquipment;
	}

	@Override
	public String toString() {
		return "StrategicEvent [event_id=" + event_id + ", link_id=" + link_id
				+ ", event_type=" + event_type + ", dateCreated=" + dateCreated
				+ ", dateCancelled=" + dateCancelled + ", capacity_reduction="
				+ capacity_reduction + ", type_suitable=" + type_suitable
				+ ", location_suitable=" + location_suitable
				+ ", severity_suitable=" + severity_suitable
				+ ", consider_alternative_route=" + consider_alternative_route
				+ ", active=" + active + ", event_sub_type=" + event_sub_type
				+ ", defaultRoute=" + defaultRoute + ", alternativeRoute="
				+ alternativeRoute + ", vMSUnitEquipment=" + vMSUnitEquipment
				+ "]";
	}
}
