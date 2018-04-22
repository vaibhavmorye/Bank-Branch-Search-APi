package com.fylebank.model.DTO;

public class BranchDTO {
	
	
	private Long bank_id;
	
	private String ifsc;

	private String branch;

	private String address;
	
	private String city;

	private String district;
	
	private String State;
	
	private String Bank;

	public BranchDTO() {
		super();
	}

	public BranchDTO(Long bank_id, String ifsc, String branch, String address, String city, String district,
			String state, String bank) {
		super();
		this.bank_id = bank_id;
		this.ifsc = ifsc;
		this.branch = branch;
		this.address = address;
		this.city = city;
		this.district = district;
		this.State = state;
		this.Bank = bank;
	}

	public Long getBank_id() {
		return bank_id;
	}

	public void setBank_id(Long bank_id) {
		this.bank_id = bank_id;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getBank() {
		return Bank;
	}

	public void setBank(String bank) {
		Bank = bank;
	}
	
	

	
}
