package me.ejb.alphaservices.orm.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vjobcandidateemployment database table.
 * 
 */
@Entity
@NamedQuery(name="Vjobcandidateemployment.findAll", query="SELECT v FROM Vjobcandidateemployment v")
public class Vjobcandidateemployment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Emp.EndDate\"")
	private Date emp_EndDate;

	@Column(name="\"Emp.FunctionCategory\"")
	private String emp_FunctionCategory;

	@Column(name="\"Emp.IndustryCategory\"")
	private String emp_IndustryCategory;

	@Column(name="\"Emp.JobTitle\"")
	private String emp_JobTitle;

	@Column(name="\"Emp.Loc.City\"")
	private String emp_Loc_City;

	@Column(name="\"Emp.Loc.CountryRegion\"")
	private String emp_Loc_CountryRegion;

	@Column(name="\"Emp.Loc.State\"")
	private String emp_Loc_State;

	@Column(name="\"Emp.OrgName\"")
	private String emp_OrgName;

	@Column(name="\"Emp.Responsibility\"")
	private String emp_Responsibility;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Emp.StartDate\"")
	private Date emp_StartDate;

	@Id
	private Integer jobcandidateid;

	public Vjobcandidateemployment() {
	}

	public Date getEmp_EndDate() {
		return this.emp_EndDate;
	}

	public void setEmp_EndDate(Date emp_EndDate) {
		this.emp_EndDate = emp_EndDate;
	}

	public String getEmp_FunctionCategory() {
		return this.emp_FunctionCategory;
	}

	public void setEmp_FunctionCategory(String emp_FunctionCategory) {
		this.emp_FunctionCategory = emp_FunctionCategory;
	}

	public String getEmp_IndustryCategory() {
		return this.emp_IndustryCategory;
	}

	public void setEmp_IndustryCategory(String emp_IndustryCategory) {
		this.emp_IndustryCategory = emp_IndustryCategory;
	}

	public String getEmp_JobTitle() {
		return this.emp_JobTitle;
	}

	public void setEmp_JobTitle(String emp_JobTitle) {
		this.emp_JobTitle = emp_JobTitle;
	}

	public String getEmp_Loc_City() {
		return this.emp_Loc_City;
	}

	public void setEmp_Loc_City(String emp_Loc_City) {
		this.emp_Loc_City = emp_Loc_City;
	}

	public String getEmp_Loc_CountryRegion() {
		return this.emp_Loc_CountryRegion;
	}

	public void setEmp_Loc_CountryRegion(String emp_Loc_CountryRegion) {
		this.emp_Loc_CountryRegion = emp_Loc_CountryRegion;
	}

	public String getEmp_Loc_State() {
		return this.emp_Loc_State;
	}

	public void setEmp_Loc_State(String emp_Loc_State) {
		this.emp_Loc_State = emp_Loc_State;
	}

	public String getEmp_OrgName() {
		return this.emp_OrgName;
	}

	public void setEmp_OrgName(String emp_OrgName) {
		this.emp_OrgName = emp_OrgName;
	}

	public String getEmp_Responsibility() {
		return this.emp_Responsibility;
	}

	public void setEmp_Responsibility(String emp_Responsibility) {
		this.emp_Responsibility = emp_Responsibility;
	}

	public Date getEmp_StartDate() {
		return this.emp_StartDate;
	}

	public void setEmp_StartDate(Date emp_StartDate) {
		this.emp_StartDate = emp_StartDate;
	}

	public Integer getJobcandidateid() {
		return this.jobcandidateid;
	}

	public void setJobcandidateid(Integer jobcandidateid) {
		this.jobcandidateid = jobcandidateid;
	}

}