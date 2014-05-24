package info.habot.tm470.dao.pojo;

import java.util.ArrayList;

/**
* Route - Holds alternative routes that avoid the road where the event is located.
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public class Route {
	private int route_id;
	private int event_id;
	private ArrayList<Integer> link_list;
	private int is_valid;
	private String dateCreated;
	
	
	public int getRoute_id() {
		return route_id;
	}
	public void setRoute_id(int route_id) {
		this.route_id = route_id;
	}
		public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public ArrayList<Integer> getLink_list() {
		return link_list;
	}
	public void setLink_list(ArrayList<Integer> link_list) {
		this.link_list = link_list;
	}
	public int getIs_valid() {
		return is_valid;
	}
	public void setIs_valid(int is_valid) {
		this.is_valid = is_valid;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	@Override
	public String toString() {
		return "Route [route_id=" + route_id + ", link_list=" + link_list
				+ ", is_valid=" + is_valid + ", dateCreated=" + dateCreated
				+ "]";
	}	
}
