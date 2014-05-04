package info.habot.tm470.dao.pojo;

/**
* ModelVersion - The asset and network version of NTIS
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public class ModelVersion {
	
	private String NtisModelVersionInformation;
	private String modelVersion;
	private String modelPublicationTime;
	private String modelFilename;
	
	public String getNtisModelVersionInformation() {
		return NtisModelVersionInformation;
	}
	public void setNtisModelVersionInformation(String ntisModelVersionInformation) {
		NtisModelVersionInformation = ntisModelVersionInformation;
	}
	public String getModelVersion() {
		return modelVersion;
	}
	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}
	public String getModelPublicationTime() {
		return modelPublicationTime;
	}
	public void setModelPublicationTime(String modelPublicationTime) {
		this.modelPublicationTime = modelPublicationTime;
	}
	public String getModelFilename() {
		return modelFilename;
	}
	public void setModelFilename(String modelFilename) {
		this.modelFilename = modelFilename;
	}
}
