package com.xworkz.gym.dto;

public class EquipmentDto {

	private int equipmentId;
	private String equipmentName;
	
	public int getEquipmentId() {
		return equipmentId;
	}
	public void setEquipmentId(int equipmentId) {
		this.equipmentId = equipmentId;
	}
	
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	@Override
	public String toString() {
		return "EquipmentDto={equipmentId="+this.equipmentId+",equipmentName="+this.equipmentName+"}";
	}
	
	
	
}
