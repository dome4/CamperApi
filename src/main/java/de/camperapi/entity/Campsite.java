package de.camperapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name = "campsites")
public class Campsite implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "campsite_no", nullable = false)
	private Integer campsiteNo;

	@Column(name = "country")
	private String country;

	@Column(name = "state")
	private String state;

	@Column(name = "zip")
	private String zip;

	@Column(name = "street")
	private String street;

	@Column(name = "street_no")
	private Integer streetNo = 0;

	@Column(name = "city", nullable = false)
	private String city;

	@Column(name = "name")
	private String name;

	@Column(name = "h_region")
	private String h_region;

	@Column(name = "stars")
	private Integer stars = 0;

	@Column(name = "r_stars")
	private Integer r_stars = 0;

	@Column(name = "description")
	private String description;

	@Column(name = "website")
	private String website;

	@Column(name = "mail")
	private String mail;

	@Column(name = "phone")
	private Integer phone = 0;

	@Column(name = "fax")
	private Integer fax = 0;

	// Getters and Setters

	public String getCountry() {
		return country;
	}

	public Integer getCampsiteNo() {
		return campsiteNo;
	}

	public void setCampsiteNo(Integer campsiteNo) {
		this.campsiteNo = campsiteNo;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(Integer streetNo) {
		this.streetNo = streetNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getH_region() {
		return h_region;
	}

	public void setH_region(String h_region) {
		this.h_region = h_region;
	}

	public Integer getStars() {
		return stars;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
	}

	public Integer getR_stars() {
		return r_stars;
	}

	public void setR_stars(Integer r_stars) {
		this.r_stars = r_stars;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Integer getFax() {
		return fax;
	}

	public void setFax(Integer fax) {
		this.fax = fax;
	}

	// toString
	@Override
	public String toString() {
		return "Campsite [campsiteNo=" + campsiteNo + ", country=" + country + ", state=" + state + ", zip=" + zip
				+ ", street=" + street + ", streetNo=" + streetNo + ", city=" + city + ", name=" + name + ", h_region="
				+ h_region + ", stars=" + stars + ", r_stars=" + r_stars + ", description=" + description + ", website="
				+ website + ", mail=" + mail + ", phone=" + phone + ", fax=" + fax + ", getCountry()=" + getCountry()
				+ ", getCampsiteNo()=" + getCampsiteNo() + ", getState()=" + getState() + ", getZip()=" + getZip()
				+ ", getStreet()=" + getStreet() + ", getStreetNo()=" + getStreetNo() + ", getCity()=" + getCity()
				+ ", getName()=" + getName() + ", getH_region()=" + getH_region() + ", getStars()=" + getStars()
				+ ", getR_stars()=" + getR_stars() + ", getDescription()=" + getDescription() + ", getWebsite()="
				+ getWebsite() + ", getMail()=" + getMail() + ", getPhone()=" + getPhone() + ", getFax()=" + getFax()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
