package info.habot.tm470.dao.wrapper;

import info.habot.tm470.dao.pojo.VMSUnitEquipment;

import java.awt.geom.Point2D;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class VMSUnitEquipmentWrapper implements RowMapper<VMSUnitEquipment> {
	public VMSUnitEquipment mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		VMSUnitEquipment vMSUnitEquipment = new VMSUnitEquipment();

		vMSUnitEquipment.setEquipmentId(rs.getString("equipmentId"));
		vMSUnitEquipment
				.setVmsUnitIdentifier(rs.getString("vmsUnitIdentifier"));
		vMSUnitEquipment.setVmsUnitElectronicAddress(rs
				.getString("vmsUnitElectronicAddress"));
		vMSUnitEquipment.setVmsDescription(rs.getString("vmsDescription"));
		vMSUnitEquipment.setVmsType(rs.getString("vmsType"));
		vMSUnitEquipment.setVmsTypeCode(rs.getString("vmsTypeCode"));

		Point2D.Double point = new Point2D.Double();
		point = (Point2D.Double) rs.getObject("location");

		vMSUnitEquipment.setLocation(point);
		vMSUnitEquipment.setLinearElementReferenceModel(rs
				.getString("linearElementReferenceModel"));
		vMSUnitEquipment.setLinearElementIdentifier(rs
				.getString("linearElementIdentifier"));
		vMSUnitEquipment.setDistanceAlong(rs.getFloat("distanceAlong"));

		return vMSUnitEquipment;
	}
}