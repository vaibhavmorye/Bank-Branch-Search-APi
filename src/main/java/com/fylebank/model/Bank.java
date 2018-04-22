package com.fylebank.model;

/*CREATE TABLE banks (
	    name character varying(49),
	    id bigint NOT NULL
	);*/

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "banks")
public class Bank {
	@Id
	@Column(unique = true, name = "id")
	private Long id;

	@Column(unique = true, name = "name")
	String name;

	
	@OneToMany(mappedBy="bank", cascade = CascadeType.ALL,  fetch = FetchType.EAGER)
	private Set<Branches> branches;
	
	public Bank() {
		
	}
	
	public Bank(Long id, String name ) {
		this.id = id;
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Set<Branches> getBranches() {
		return branches;
	}

	public void setBranches(Set<Branches> branches) {
		this.branches = branches;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", branches=" + branches + "]";
	}
	
	
	
	

}
