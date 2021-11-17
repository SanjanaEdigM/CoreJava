package com.xworkz.hospitalapp.dto;

public class StateDTO {

	
	private int stateId;
	private String stateName;
	private DistrictDTO district;
	
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	public DistrictDTO getDistrict() {
		return district;
	}
	public void setDistrictDTO(DistrictDTO district) {
		this.district=district;
	}
	
	@Override
	   public String toString() {
		   return "State={stateId="+this.stateId+",stateName="+this.stateName+",district="+this.district+"}";
	   }
	
}
