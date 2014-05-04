package info.habot.tm470.dao.wrapper;

import info.habot.tm470.dao.pojo.VMSUnit;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class VMSUnitWrapper implements RowMapper<VMSUnit> {
	public VMSUnit mapRow(ResultSet rs, int rowNum) throws SQLException {
		VMSUnit vMSUnit = new VMSUnit();
		vMSUnit.setEquipmentId(rs.getString("equipmentId"));
		vMSUnit.setDescription(rs.getString("description"));
		vMSUnit.setSpeedAttribute(rs.getFloat("speedAttribute"));
		vMSUnit.setDescriptionUK(rs.getString("descriptionUK"));
		vMSUnit.setPictureCode(rs.getInt("pictureCode"));
		vMSUnit.setMessageSetBy(rs.getString("messageSetBy"));
		vMSUnit.setReasonForSetting(rs.getString("reasonForSetting"));
		vMSUnit.setVmsMessage(rs.getString("vmsMessage"));
		vMSUnit.setWorking(rs.getInt("working"));
		vMSUnit.setStatus(rs.getString("status"));
		vMSUnit.setTimeReceived(rs.getString("timeReceived"));
		
		return vMSUnit;
	}
}