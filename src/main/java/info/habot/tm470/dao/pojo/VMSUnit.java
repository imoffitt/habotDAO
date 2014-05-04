package info.habot.tm470.dao.pojo;

/**
* VMSUnit - A setting on a VMS on the strategic road network (SRN)
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public class VMSUnit {

	private String equipmentId;
	private String description;
	private float speedAttribute;
	private String descriptionUK;
	private int pictureCode;
	private String messageSetBy;
	private String reasonForSetting;
	private String vmsMessage;
	private int working;
	private String status;
	private String timeReceived;

	public String getEquipmentId() {
		return equipmentId;
	}

	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getSpeedAttribute() {
		return speedAttribute;
	}

	public void setSpeedAttribute(float speedAttribute) {
		this.speedAttribute = speedAttribute;
	}

	public String getDescriptionUK() {
		return descriptionUK;
	}

	public void setDescriptionUK(String descriptionUK) {
		this.descriptionUK = descriptionUK;
	}

	public int getPictureCode() {
		return pictureCode;
	}

	public void setPictureCode(int pictureCode) {
		this.pictureCode = pictureCode;
	}

	public String getMessageSetBy() {
		return messageSetBy;
	}

	public void setMessageSetBy(String messageSetBy) {
		this.messageSetBy = messageSetBy;
	}

	public String getReasonForSetting() {
		return reasonForSetting;
	}

	public void setReasonForSetting(String reasonForSetting) {
		this.reasonForSetting = reasonForSetting;
	}

	public String getVmsMessage() {
		return vmsMessage;
	}

	public void setVmsMessage(String vmsMessage) {
		this.vmsMessage = vmsMessage;
	}

	public int getWorking() {
		return working;
	}

	public void setWorking(int working) {
		this.working = working;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTimeReceived() {
		return timeReceived;
	}

	public void setTimeReceived(String timeReceived) {
		this.timeReceived = timeReceived;
	}
}
