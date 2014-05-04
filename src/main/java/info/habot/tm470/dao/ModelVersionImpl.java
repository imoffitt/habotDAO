package info.habot.tm470.dao;

import info.habot.tm470.dao.ModelVersionImpl;
import info.habot.tm470.dao.interfaces.ModelVersionDAO;
import info.habot.tm470.dao.pojo.ModelVersion;
import info.habot.tm470.dao.wrapper.ModelVersionWrapper;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

/**
* ModelVersionImpl
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public class ModelVersionImpl implements ModelVersionDAO {

	static Logger log = Logger.getLogger(ModelVersionImpl.class.getName());
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.habot.tm470.interfaces.NetworkNodeDAO#create(int,
	 * java.lang.String, java.lang.String)
	 */
	public void create(ModelVersion modelVersion) {
		String SQL = "insert into Model_Version (NtisModelVersionInformation, modelVersion, modelPublicationTime, modelFilename) " +
				" values (?, ?, ?, ?)";

		jdbcTemplateObject.update(SQL, modelVersion.getNtisModelVersionInformation(), modelVersion.getModelVersion(),
				modelVersion.getModelPublicationTime(), modelVersion.getModelFilename());
			
		log.debug("Created NtisModelVersionInformation = " + modelVersion.getNtisModelVersionInformation() + " modelVersion = "
				+ modelVersion.getModelVersion() );
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.habot.tm470.interfaces.NetworkNodeDAO#getNetworkNode(java.lang.Integer
	 * )
	 */
	public ModelVersion getModelVersion(String id) {
		String SQL = "select * from Model_Version where modelVersion = ?";
		ModelVersion modelVersion = jdbcTemplateObject.queryForObject(SQL,
				new Object[] { id }, new ModelVersionWrapper());
		return modelVersion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.habot.tm470.interfaces.NetworkNodeDAO#listNetworkNode()
	 */
	public List<ModelVersion> listModelVersion() {
		String SQL = "select * from Model_Version";
		List<ModelVersion> modelVersion = jdbcTemplateObject.query(SQL,
				new ModelVersionWrapper());
		return modelVersion;
	}

	public void delete(String id) {
		String SQL = "delete from Model_Version where modelVersion = ?";
		jdbcTemplateObject.update(SQL, id);
		log.debug("Deleted Network_Nodes with modelVersion = " + id);
		return;
	}

	public void update(ModelVersion modelVersion) {
		String SQL = "update Model_Version set NtisModelVersionInformation = ?, modelPublicationTime = ?, modelFilename = ? where modelVersion = ?";
		jdbcTemplateObject.update(SQL, modelVersion.getNtisModelVersionInformation(), 
				modelVersion.getModelPublicationTime(), modelVersion.getModelFilename());
		log.debug("Updated Model_Version with ID = " + modelVersion.getModelVersion());
		return;
	}
}
