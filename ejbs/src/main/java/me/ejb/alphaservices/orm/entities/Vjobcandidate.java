package me.ejb.alphaservices.orm.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the vjobcandidate database table.
 * 
 */
@Entity
@NamedQuery(name="Vjobcandidate.findAll", query="SELECT v FROM Vjobcandidate v")
public class Vjobcandidate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"Addr.Loc.City\"")
	private String addr_Loc_City;

	@Column(name="\"Addr.Loc.CountryRegion\"")
	private String addr_Loc_CountryRegion;

	@Column(name="\"Addr.Loc.State\"")
	private String addr_Loc_State;

	@Column(name="\"Addr.PostalCode\"")
	private String addr_PostalCode;

	@Column(name="\"Addr.Type\"")
	private String addr_Type;

	private Integer businessentityid;

	@Column(name="\"EMail\"")
	private String EMail;

	private Integer jobcandidateid;

	private Timestamp modifieddate;

	@Column(name="\"Name.First\"")
	private String name_First;

	@Column(name="\"Name.Last\"")
	private String name_Last;

	@Column(name="\"Name.Middle\"")
	private String name_Middle;

	@Column(name="\"Name.Prefix\"")
	private String name_Prefix;

	@Column(name="\"Name.Suffix\"")
	private String name_Suffix;

	@Column(name="\"Skills\"")
	private String skills;

	@Column(name="\"WebSite\"")
	private String webSite;

	public Vjobcandidate() {
	}

	public String getAddr_Loc_City() {
		return this.addr_Loc_City;
	}

	public void setAddr_Loc_City(String addr_Loc_City) {
		this.addr_Loc_City = addr_Loc_City;
	}

	public String getAddr_Loc_CountryRegion() {
		return this.addr_Loc_CountryRegion;
	}

	public void setAddr_Loc_CountryRegion(String addr_Loc_CountryRegion) {
		this.addr_Loc_CountryRegion = addr_Loc_CountryRegion;
	}

	public String getAddr_Loc_State() {
		return this.addr_Loc_State;
	}

	public void setAddr_Loc_State(String addr_Loc_State) {
		this.addr_Loc_State = addr_Loc_State;
	}

	public String getAddr_PostalCode() {
		return this.addr_PostalCode;
	}

	public void setAddr_PostalCode(String addr_PostalCode) {
		this.addr_PostalCode = addr_PostalCode;
	}

	public String getAddr_Type() {
		return this.addr_Type;
	}

	public void setAddr_Type(String addr_Type) {
		this.addr_Type = addr_Type;
	}

	public Integer getBusinessentityid() {
		return this.businessentityid;
	}

	public void setBusinessentityid(Integer businessentityid) {
		this.businessentityid = businessentityid;
	}

	public String getEMail() {
		return this.EMail;
	}

	public void setEMail(String EMail) {
		this.EMail = EMail;
	}

	public Integer getJobcandidateid() {
		return this.jobcandidateid;
	}

	public void setJobcandidateid(Integer jobcandidateid) {
		this.jobcandidateid = jobcandidateid;
	}

	public Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}

	public String getName_First() {
		return this.name_First;
	}

	public void setName_First(String name_First) {
		this.name_First = name_First;
	}

	public String getName_Last() {
		return this.name_Last;
	}

	public void setName_Last(String name_Last) {
		this.name_Last = name_Last;
	}

	public String getName_Middle() {
		return this.name_Middle;
	}

	public void setName_Middle(String name_Middle) {
		this.name_Middle = name_Middle;
	}

	public String getName_Prefix() {
		return this.name_Prefix;
	}

	public void setName_Prefix(String name_Prefix) {
		this.name_Prefix = name_Prefix;
	}

	public String getName_Suffix() {
		return this.name_Suffix;
	}

	public void setName_Suffix(String name_Suffix) {
		this.name_Suffix = name_Suffix;
	}

	public String getSkills() {
		return this.skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getWebSite() {
		return this.webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

}