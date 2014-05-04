package info.habot.tm470.dao.wrapper;

import info.habot.tm470.dao.pojo.ModelVersion;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ModelVersionWrapper implements RowMapper<ModelVersion> {
	public ModelVersion mapRow(ResultSet rs, int rowNum) throws SQLException {
		ModelVersion modelVersion = new ModelVersion();
		modelVersion.setModelVersion(rs.getString("NtisModelVersionInformation"));
		modelVersion.setModelVersion(rs.getString("modelVersion"));
		modelVersion.setModelVersion(rs.getString("modelPublicationTime"));
		modelVersion.setModelVersion(rs.getString("modelFilename"));
		return modelVersion;
	}
}