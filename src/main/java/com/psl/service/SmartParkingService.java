package com.psl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.dao.ISmartParkingDAO;
import com.psl.entity.ParkingSlot;

@Service
public class SmartParkingService {
	
	@Autowired
	private ISmartParkingDAO dao;
	

	public void createParkingSlot(ParkingSlot s) {
		dao.createParkingSlot(s);
	}

	public void updateParkingSlot(int slotId, int available) {
		dao.updateParkingSlot(slotId, available);
	}

	public List<ParkingSlot> getAllParkingSlots() {
		return dao.getAllParkingSlots();
	}

	
}
