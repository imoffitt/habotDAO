package info.habot.tm470.dao.interfaces;

import info.habot.tm470.dao.pojo.NetworkLink;

import java.util.List;

import javax.sql.DataSource;

/**
* NetworkLinkDAO interface
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public interface NetworkLinkDAO {

	   /** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	   public void setDataSource(DataSource ds);
	   
	   /** 
	    * This is the method to be used to create
	    * a record in the table.
	    */
	   public void create(NetworkLink networkLink);
	   
	   /** 
	    * This is the method to be used to list down
	    * a record from the table corresponding
	    * to a passed id.
	    */
	   public NetworkLink getNetworkLink(Integer id);
	   
	   /** 
	    * This is the method to be used to list down
	    * all the records from the NetworkNode table.
	    */
	   public List<NetworkLink> listNetworkLink();
	   
	   /** 
	    * This is the method to be used to delete
	    * a record from the NetworkNode table corresponding
	    * to a passed  id.
	    */
	   public void delete(Integer id);
	   
	   /** 
	    * This is the method to be used to update
	    * a record into the table.
	    */
	   public void update(NetworkLink networkLink);
	
}
