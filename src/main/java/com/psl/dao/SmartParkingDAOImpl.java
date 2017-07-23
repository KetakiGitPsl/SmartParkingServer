package com.psl.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.psl.entity.ParkingSlot;

@Repository
public class SmartParkingDAOImpl implements ISmartParkingDAO{
	
	@Autowired
	private JdbcTemplate template;

	public void createParkingSlot(ParkingSlot s) {
		// TODO Auto-generated method stub
		
	}

	public void updateParkingSlot(int slotId, int available) {
		template.update("update smart_parking set available=" + available + " where slot_id=" + slotId);
	}

	public List<ParkingSlot> getAllParkingSlots() {
		return template.query("select * from smart_parking", new RowMapper<ParkingSlot>(){

			public ParkingSlot mapRow(ResultSet rs, int rowNum)
					throws SQLException {
				ParkingSlot s = new ParkingSlot();
				s.setSlotId(rs.getInt("slot_id"));
				s.setIsAvailable(rs.getInt("available"));
				return s;
			}
			
			
		});
	}

	
	
}
