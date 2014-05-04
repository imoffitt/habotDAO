package info.habot.tm470.dao.pojo;

import java.awt.geom.Point2D;

/**
* VMSUnitEquipment - A VMS asset on the strategic road network (SRN)
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public class VMSUnitEquipment {

	private String equipmentId;
	private String vmsUnitIdentifier;
	private String vmsUnitElectronicAddress;
	private String vmsDescription;
	private String vmsType;
	private String vmsTypeCode;
	private Point2D.Double location;
	private String linearElementReferenceModel;
	private String linearElementIdentifier;
	private float distanceAlong;
	
	public String getEquipmentId() {
		return equipmentId;
	}
	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}
	public String getVmsUnitIdentifier() {
		return vmsUnitIdentifier;
	}
	public void setVmsUnitIdentifier(String vmsUnitIdentifier) {
		this.vmsUnitIdentifier = vmsUnitIdentifier;
	}
	public String getVmsUnitElectronicAddress() {
		return vmsUnitElectronicAddress;
	}
	public void setVmsUnitElectronicAddress(String vmsUnitElectronicAddress) {
		this.vmsUnitElectronicAddress = vmsUnitElectronicAddress;
	}
	public String getVmsDescription() {
		return vmsDescription;
	}
	public void setVmsDescription(String vmsDescription) {
		this.vmsDescription = vmsDescription;
	}
	public String getVmsType() {
		return vmsType;
	}
	public void setVmsType(String vmsType) {
		this.vmsType = vmsType;
	}
	public String getVmsTypeCode() {
		return vmsTypeCode;
	}
	public void setVmsTypeCode(String vmsTypeCode) {
		this.vmsTypeCode = vmsTypeCode;
	}
	public String getLinearElementReferenceModel() {
		return linearElementReferenceModel;
	}
	public void setLinearElementReferenceModel(String linearElementReferenceModel) {
		this.linearElementReferenceModel = linearElementReferenceModel;
	}
	public String getLinearElementIdentifier() {
		return linearElementIdentifier;
	}
	public void setLinearElementIdentifier(String linearElementIdentifier) {
		this.linearElementIdentifier = linearElementIdentifier;
	}
	public float getDistanceAlong() {
		return distanceAlong;
	}
	public void setDistanceAlong(float distanceAlong) {
		this.distanceAlong = distanceAlong;
	}
	public Point2D.Double getLocation() {
		return location;
	}
	public void setLocation(Point2D.Double location) {
		this.location = location;
	}
}
