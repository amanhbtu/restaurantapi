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
	private String email;
	private String address;
	private String city;
	private String country;
	private String pincode;
	private String owner;
	private double rating;
	private String website;
	private String googleMap;
	
	
	public Restaurant(String name, String email, String address, String city, String country, String pincode, String owner,
			double rating, String website, String googleMap) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
		this.owner = owner;
		this.rating = rating;
		this.website = website;
		this.googleMap = googleMap;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", city=" + city
				+ ", country=" + country + ", pincode=" + pincode + ", owner=" + owner + ", rating=" + rating + ", website="
				+ website + ", googleMap=" + googleMap + "]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
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
