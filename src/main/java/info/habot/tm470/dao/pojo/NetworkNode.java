package info.habot.tm470.dao.pojo;

import java.awt.geom.Point2D;

/**
* NetworkNode - A node on the strategic road network (SRN)
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public class NetworkNode {
	
	private String nodeId;
	private Point2D.Double location;
	public boolean visited=false;
	
	public NetworkNode(String nodeId) {
		this.nodeId = nodeId;
	}
	
	public NetworkNode() {
	}
	
	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public Point2D.Double getLocation() {
		return location;
	}
	public void setLocation(Point2D.Double location) {
		this.location = location;
	}

}
