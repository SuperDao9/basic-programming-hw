package com.udomsin.review.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
// @Table(name = "Address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String addressNumber;
	private String road;
	private String province;
	
	
	public Integer getId() {
	return id;
	}
	public void setId(Integer id) {
	this.id = id;
	}
	public String getAddressNumber() {
	return addressNumber;
	}
	public void setAddressNumber(String addressNumber) {
	this.addressNumber = addressNumber;
	}
	public String getRoad() {
	return road;
	}
	public void setRoad(String road) {
	this.road = road;
	}
	public String getProvince() {
	return province;
	}
	public void setProvince(String province) {
	this.province = province;
	}


}


