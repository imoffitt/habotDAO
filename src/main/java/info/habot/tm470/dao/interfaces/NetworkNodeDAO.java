package info.habot.tm470.dao.interfaces;

import info.habot.tm470.dao.pojo.NetworkNode;

import java.util.List;

import javax.sql.DataSource;

public interface NetworkNodeDAO {
	   /** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	   public void setDataSource(DataSource ds);
	   
	   /** 
	    * This is the method to be used to create
	    * a record in the NetworkNode table.
	    */
	   public void create(NetworkNode networkNode);
	   
	   /** 
	    * This is the method to be used to list down
	    * a record from the NetworkNode table corresponding
	    * to a passed id.
	    */
	   public NetworkNode getNetworkNode(Integer id);
	   
	   /** 
	    * This is the method to be used to list down
	    * all the records from the NetworkNode table.
	    */
	   public List<NetworkNode> listNetworkNode();
	   
	   /** 
	    * This is the method to be used to delete
	    * a record from the NetworkNode table corresponding
	    * to a passed NetworkNode id.
	    */
	   public void delete(Integer id);
	   
	   /** 
	    * This is the method to be used to update
	    * a record into the NetworkNode table.
	    */
	   public void update(NetworkNode networkNode);
	}