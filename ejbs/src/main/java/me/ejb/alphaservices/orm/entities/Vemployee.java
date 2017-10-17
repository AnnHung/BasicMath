package me.ejb.alphaservices.orm.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vemployee database table.
 * 
 */
@Entity
@NamedQuery(name="Vemployee.findAll", query="SELECT v FROM Vemployee v")
public class Vemployee implements Serializable {
	private static final long serialVersionUID = 1L;

	private Object additionalcontactinfo;

	private String addressline1;

	private String addressline2;

	private Integer businessentityid;

	private String city;

	private Object countryregionname;

	private String emailaddress;

	private Integer emailpromotion;

	private Object firstname;

	private String jobtitle;

	private Object lastname;

	private Object middlename;

	private Object phonenumber;

	private Object phonenumbertype;

	private String postalcode;

	private Object stateprovincename;

	private String suffix;

	private String title;

	public Vemployee() {
	}

	public Object getAdditionalcontactinfo() {
		return this.additionalcontactinfo;
	}

	public void setAdditionalcontactinfo(Object additionalcontactinfo) {
		this.additionalcontactinfo = additionalcontactinfo;
	}

	public String getAddressline1() {
		return this.addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return this.addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public Integer getBusinessentityid() {
		return this.businessentityid;
	}

	public void setBusinessentityid(Integer businessentityid) {
		this.businessentityid = businessentityid;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Object getCountryregionname() {
		return this.countryregionname;
	}

	public void setCountryregionname(Object countryregionname) {
		this.countryregionname = countryregionname;
	}

	public String getEmailaddress() {
		return this.emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public Integer getEmailpromotion() {
		return this.emailpromotion;
	}

	public void setEmailpromotion(Integer emailpromotion) {
		this.emailpromotion = emailpromotion;
	}

	public Object getFirstname() {
		return this.firstname;
	}

	public void setFirstname(Object firstname) {
		this.firstname = firstname;
	}

	public String getJobtitle() {
		return this.jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public Object getLastname() {
		return this.lastname;
	}

	public void setLastname(Object lastname) {
		this.lastname = lastname;
	}

	public Object getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(Object middlename) {
		this.middlename = middlename;
	}

	public Object getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(Object phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Object getPhonenumbertype() {
		return this.phonenumbertype;
	}

	public void setPhonenumbertype(Object phonenumbertype) {
		this.phonenumbertype = phonenumbertype;
	}

	public String getPostalcode() {
		return this.postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public Object getStateprovincename() {
		return this.stateprovincename;
	}

	public void setStateprovincename(Object stateprovincename) {
		this.stateprovincename = stateprovincename;
	}

	public String getSuffix() {
		return this.suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}