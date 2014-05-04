package info.habot.tm470.dao;

import info.habot.tm470.dao.VMSUnitEquipmentImpl;
import info.habot.tm470.dao.interfaces.VMSUnitEquipmentDAO;
import info.habot.tm470.dao.pojo.VMSUnitEquipment;
import info.habot.tm470.dao.wrapper.VMSUnitEquipmentWrapper;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

/**
* VMSUnitEquipmentImpl implements VMSUnitEquipmentDAO
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public class VMSUnitEquipmentImpl implements VMSUnitEquipmentDAO {

	static Logger log = Logger.getLogger(VMSUnitEquipmentImpl.class.getName());

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
	public void create(VMSUnitEquipment vMSUnitEquipment) {
		String SQL = "insert into VMS_Unit_Equipment (equipmentId, "
				+ "vmsUnitIdentifier, vmsUnitElectronicAddress, vmsDescription, "
				+ "vmsType, vmsTypeCode, location, "
				+ "linearElementReferenceModel, linearElementIdentifier, distanceAlong "
				+ ") values (?, ?, ?, ?, ?, ?, POINT(?, ?), ?, ?, ?)";

		jdbcTemplateObject.update(SQL, vMSUnitEquipment.getEquipmentId(),
				vMSUnitEquipment.getVmsUnitIdentifier(),
				vMSUnitEquipment.getVmsUnitElectronicAddress(),
				vMSUnitEquipment.getVmsDescription(),
				vMSUnitEquipment.getVmsType(),
				vMSUnitEquipment.getVmsTypeCode(),
				vMSUnitEquipment.getLocation().x,
				vMSUnitEquipment.getLocation().y,
				vMSUnitEquipment.getLinearElementReferenceModel(),
				vMSUnitEquipment.getLinearElementIdentifier(),
				vMSUnitEquipment.getDistanceAlong());

		// log.debug("Created VMS_Unit_Equipment = " +
		// vMSUnitEquipment.toString());
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.habot.tm470.interfaces.NetworkNodeDAO#getNetworkNode(java.lang.Integer
	 * )
	 */
	public VMSUnitEquipment getVMSUnitEquipment(Integer id) {
		String SQL = "select * from VMS_Unit_Equipment where equipmentId = ?";
		VMSUnitEquipment vMSUnit = jdbcTemplateObject.queryForObject(SQL,
				new Object[] { id }, new VMSUnitEquipmentWrapper());
		return vMSUnit;
	}

	public void delete(Integer id) {
		String SQL = "delete from VMS_Unit_Equipment where equipmentId = ?";
		jdbcTemplateObject.update(SQL, id);
		log.debug("Deleted VMS_Unit_Equipment with equipmentId = " + id);
		return;
	}

	public List<VMSUnitEquipment> listVMSUnitEquipment() {
		String SQL = "select * from VMS_Unit_Equipment";
		List<VMSUnitEquipment> vMSUnit = jdbcTemplateObject.query(SQL,
				new VMSUnitEquipmentWrapper());
		return listVMSUnitEquipment();
	}

	public void update(VMSUnitEquipment vMSUnitEquipment) {

		String SQL = "update VMS_Unit set " + "vmsUnitIdentifier = ?,"
				+ "vmsUnitElectronicAddress = ?," + "vmsDescription = ?,"
				+ "vmsType = ?," + "vmsTypeCode = ?,"
				+ "location = POINT(?,?), "
				+ "linearElementReferenceModel = ?,"
				+ "linearElementIdentifier = ?,"
				+ "distanceAlong = ? where equipmentId = ?";
		jdbcTemplateObject.update(SQL, vMSUnitEquipment.getVmsUnitIdentifier(),
				vMSUnitEquipment.getVmsUnitElectronicAddress(),
				vMSUnitEquipment.getVmsDescription(),
				vMSUnitEquipment.getVmsType(),
				vMSUnitEquipment.getVmsTypeCode(),
				vMSUnitEquipment.getLocation().x,
				vMSUnitEquipment.getLocation().y,
				vMSUnitEquipment.getLinearElementReferenceModel(),
				vMSUnitEquipment.getLinearElementIdentifier(),
				vMSUnitEquipment.getDistanceAlong());

		log.debug("Updated vMSUnitEquipment with equipmentId = "
				+ vMSUnitEquipment.getEquipmentId());
		return;
	}
}
