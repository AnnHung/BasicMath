package me.ejb.alphaservices.orm.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vemployeedepartmenthistory database table.
 * 
 */
@Entity
@NamedQuery(name="Vemployeedepartmenthistory.findAll", query="SELECT v FROM Vemployeedepartmenthistory v")
public class Vemployeedepartmenthistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer businessentityid;

	private Object department;

	@Temporal(TemporalType.DATE)
	private Date enddate;

	private Object firstname;

	private Object groupname;

	private Object lastname;

	private Object middlename;

	private Object shift;

	@Temporal(TemporalType.DATE)
	private Date startdate;

	private String suffix;

	private String title;

	public Vemployeedepartmenthistory() {
	}

	public Integer getBusinessentityid() {
		return this.businessentityid;
	}

	public void setBusinessentityid(Integer businessentityid) {
		this.businessentityid = businessentityid;
	}

	public Object getDepartment() {
		return this.department;
	}

	public void setDepartment(Object department) {
		this.department = department;
	}

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public Object getFirstname() {
		return this.firstname;
	}

	public void setFirstname(Object firstname) {
		this.firstname = firstname;
	}

	public Object getGroupname() {
		return this.groupname;
	}

	public void setGroupname(Object groupname) {
		this.groupname = groupname;
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

	public Object getShift() {
		return this.shift;
	}

	public void setShift(Object shift) {
		this.shift = shift;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
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