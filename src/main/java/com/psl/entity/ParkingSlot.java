package com.psl.entity;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="parkingSlot")
public class ParkingSlot {
	
	private int slotId;
	private int isAvailable;
	public int getSlotId() {
		return slotId;
	}
	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}
	public int getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(int isAvailable) {
		this.isAvailable = isAvailable;
	}
	@Override
	public String toString() {
		return "ParkingSlot [slotId=" + slotId + ", isAvailable=" + isAvailable
				+ "]";
	}
	
	

}
