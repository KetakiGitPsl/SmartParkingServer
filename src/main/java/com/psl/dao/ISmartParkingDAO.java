package com.psl.dao;

import java.util.List;

import com.psl.entity.ParkingSlot;

public interface ISmartParkingDAO {
	
	void createParkingSlot(ParkingSlot s);
	void updateParkingSlot(int slotId, int available);
	List<ParkingSlot> getAllParkingSlots();

}
