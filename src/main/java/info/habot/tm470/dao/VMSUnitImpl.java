package info.habot.tm470.dao;

import info.habot.tm470.dao.VMSUnitImpl;
import info.habot.tm470.dao.interfaces.VMSUnitDAO;
import info.habot.tm470.dao.pojo.VMSUnit;
import info.habot.tm470.dao.wrapper.VMSUnitWrapper;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

/**
* VMSUnitImpl implements VMSUnitDAO
* 
* @author Ian Moffitt
* @version 0.1
* @see www.habot.info
*/
public class VMSUnitImpl implements VMSUnitDAO {

	static Logger log = Logger.getLogger(VMSUnitImpl.class.getName());

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
	public void create(VMSUnit vMSUnit) {
		String SQL = "insert into VMS_Unit (" + "equipmentId, "
				+ "description, " + "speedAttribute, " + "descriptionUK, "
				+ "pictureCode, " + "messageSetBy, " + "reasonForSetting, "
				+ "vmsMessage, " + "working, " + "status, timeReceived"
				+ ") values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		jdbcTemplateObject.update(SQL, vMSUnit.getEquipmentId(),
				vMSUnit.getDescription(), vMSUnit.getSpeedAttribute(),
				vMSUnit.getDescriptionUK(), vMSUnit.getPictureCode(),
				vMSUnit.getMessageSetBy(), vMSUnit.getReasonForSetting(),
				vMSUnit.getVmsMessage(), vMSUnit.getWorking(),
				vMSUnit.getStatus(), vMSUnit.getTimeReceived());

		log.debug("Created VMS_Unit Equipment = " + vMSUnit.toString());
		return;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.habot.tm470.interfaces.NetworkNodeDAO#getNetworkNode(java.lang.Integer
	 * )
	 */
	public VMSUnit getVMSUnit(Integer id) {
		String SQL = "select * from VMS_Unit where equipmentId = ?";
		VMSUnit vMSUnit = jdbcTemplateObject.queryForObject(SQL,
				new Object[] { id }, new VMSUnitWrapper());
		return vMSUnit;
	}

	public void delete(Integer id) {
		String SQL = "delete from VMS_Unit where equipmentId = ?";
		jdbcTemplateObject.update(SQL, id);
		log.debug("Deleted VMSUnit with equipmentId = " + id);
		return;
	}

	public List<VMSUnit> listVMSUnit() {
		String SQL = "select * from VMS_Unit";
		List<VMSUnit> vMSUnitList = jdbcTemplateObject.query(SQL,
				new VMSUnitWrapper());
		return vMSUnitList;
	}

	public void update(VMSUnit vMSUnit) {

		String SQL = "update VMS_Unit set " + "description = ?,"
				+ "speedAttribute = ?," + "descriptionUK = ?,"
				+ "pictureCode = ?," + "messageSetBy = ?,"
				+ "reasonForSetting = ?, " + "vmsMessage = ?," + "working = ?,"
				+ "status = ?, timeReceived =? where equipmentId = ?";
		jdbcTemplateObject.update(SQL, vMSUnit.getDescription(),
				vMSUnit.getSpeedAttribute(), vMSUnit.getDescriptionUK(),
				vMSUnit.getPictureCode(), vMSUnit.getMessageSetBy(),
				vMSUnit.getReasonForSetting(), vMSUnit.getVmsMessage(),
				vMSUnit.getWorking(), vMSUnit.getStatus(),
				vMSUnit.getTimeReceived());

		log.debug("Updated vMSUnitEquipment with equipmentId = "
				+ vMSUnit.getEquipmentId());
		return;
	}
}
