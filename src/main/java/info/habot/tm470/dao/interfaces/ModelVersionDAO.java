package info.habot.tm470.dao.interfaces;

import info.habot.tm470.dao.pojo.ModelVersion;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public interface ModelVersionDAO {

	   /** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	   public void setDataSource(DataSource ds);
	   
	   /** 
	    * This is the method to be used to create
	    * a record in the table.
	    */
	   public void create(ModelVersion modelVersion);
	   
	   /** 
	    * This is the method to be used to list down
	    * a record from the table corresponding
	    * to a passed id.
	    */
	   public ModelVersion getModelVersion(String id);
	   
	   /** 
	    * This is the method to be used to list down
	    * all the records from the NetworkNode table.
	    */
	   public List<ModelVersion> listModelVersion();
	   
	   /** 
	    * This is the method to be used to delete
	    * a record from the NetworkNode table corresponding
	    * to a passed  id.
	    */
	   public void delete(String id);
	   
	   /** 
	    * This is the method to be used to update
	    * a record into the table.
	    */
	   public void update(ModelVersion vmsUnit);
	
}
