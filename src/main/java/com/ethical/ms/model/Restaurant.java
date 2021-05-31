package com.ethical.ms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Restaurant")
public class Restaurant {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String address;
	private String city;
	private String country;
	private String pincode;
	private String owner;
	private double rate;
	private String website;
	private String googleMap;
	
	public Restaurant(String name, String address, String city, String country, String pincode, String owner,
			double rate, String website, String googleMap) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
		this.owner = owner;
		this.rate = rate;
		this.website = website;
		this.googleMap = googleMap;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getGoogleMap() {
		return googleMap;
	}

	public void setGoogleMap(String googleMap) {
		this.googleMap = googleMap;
	}

	public Restaurant() {
		super();
	}
}
