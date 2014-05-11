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
	public int visited;
	
	public NetworkNode(String nodeId) {
		this.nodeId = nodeId;
		visited = 0;
	}
	
	public NetworkNode() {
		visited = 0;
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

	@Override
	public String toString() {
		return "NetworkNode [nodeId=" + nodeId + ", visited=" + visited + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nodeId == null) ? 0 : nodeId.hashCode());
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
		NetworkNode other = (NetworkNode) obj;
		if (nodeId == null) {
			if (other.nodeId != null)
				return false;
		} else if (!nodeId.equals(other.nodeId))
			return false;
		return true;
	}
}
