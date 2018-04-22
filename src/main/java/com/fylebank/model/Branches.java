package com.fylebank.model;

import javax.persistence.CascadeType;

/*CREATE TABLE branches (
	    ifsc character varying(11) NOT NULL,
	    bank_id bigint,
	    branch character varying(100),
	    address character varying(500),
	    city character varying(50),
	    district character varying(50),
	    state character varying(26)
	);*/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "branches")
public class Branches {

	@Column(name = "bank_id")
	private Long bank_id;

	@Id
	@Column(name = "ifsc")
	private String ifsc;

	@Column(name = "branch")
	private String branch;

	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;

	@Column(name = "district")
	private String district;

	@Column(name = "state")
	private String State;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private Bank bank;
	
	public Branches() {
	}

	public Branches(Long bank_id, String ifsc, String branch, String address, String city, String district, String state) {
		super();
		this.bank_id = bank_id;
		this.ifsc = ifsc;
		this.branch = branch;
		this.address = address;
		this.city = city;
		this.district = district;
		State = state;
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

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}
	

}
