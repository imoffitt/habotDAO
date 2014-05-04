package info.habot.tm470.dao.interfaces;

import info.habot.tm470.dao.pojo.VMSUnitEquipment;

import java.util.List;

import javax.sql.DataSource;

public interface VMSUnitEquipmentDAO {

	   /** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	   public void setDataSource(DataSource ds);
	   
	   /** 
	    * This is the method to be used to create
	    * a record in the table.
	    */
	   public void create(VMSUnitEquipment vmsUnitEquipment);
	   
	   /** 
	    * This is the method to be used to list down
	    * a record from the table corresponding
	    * to a passed id.
	    */
	   public VMSUnitEquipment getVMSUnitEquipment(Integer id);
	   
	   /** 
	    * This is the method to be used to list down
	    * all the records from the NetworkNode table.
	    */
	   public List<VMSUnitEquipment> listVMSUnitEquipment();
	   
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
	   public void update(VMSUnitEquipment vmsUnitEquipment);
	   
}
	