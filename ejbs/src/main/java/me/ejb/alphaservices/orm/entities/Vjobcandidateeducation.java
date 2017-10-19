package me.ejb.alphaservices.orm.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vjobcandidateeducation database table.
 * 
 */
@Entity
@NamedQuery(name="Vjobcandidateeducation.findAll", query="SELECT v FROM Vjobcandidateeducation v")
public class Vjobcandidateeducation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"Edu.Degree\"")
	private String edu_Degree;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Edu.EndDate\"")
	private Date edu_EndDate;

	@Column(name="\"Edu.GPA\"")
	private String edu_GPA;

	@Column(name="\"Edu.GPAScale\"")
	private String edu_GPAScale;

	@Column(name="\"Edu.Level\"")
	private String edu_Level;

	@Column(name="\"Edu.Loc.City\"")
	private String edu_Loc_City;

	@Column(name="\"Edu.Loc.CountryRegion\"")
	private String edu_Loc_CountryRegion;

	@Column(name="\"Edu.Loc.State\"")
	private String edu_Loc_State;

	@Column(name="\"Edu.Major\"")
	private String edu_Major;

	@Column(name="\"Edu.Minor\"")
	private String edu_Minor;

	@Column(name="\"Edu.School\"")
	private String edu_School;

	@Temporal(TemporalType.DATE)
	@Column(name="\"Edu.StartDate\"")
	private Date edu_StartDate;

	@Id
	private Integer jobcandidateid;
	
	public Vjobcandidateeducation() {
	}

	public String getEdu_Degree() {
		return this.edu_Degree;
	}

	public void setEdu_Degree(String edu_Degree) {
		this.edu_Degree = edu_Degree;
	}

	public Date getEdu_EndDate() {
		return this.edu_EndDate;
	}

	public void setEdu_EndDate(Date edu_EndDate) {
		this.edu_EndDate = edu_EndDate;
	}

	public String getEdu_GPA() {
		return this.edu_GPA;
	}

	public void setEdu_GPA(String edu_GPA) {
		this.edu_GPA = edu_GPA;
	}

	public String getEdu_GPAScale() {
		return this.edu_GPAScale;
	}

	public void setEdu_GPAScale(String edu_GPAScale) {
		this.edu_GPAScale = edu_GPAScale;
	}

	public String getEdu_Level() {
		return this.edu_Level;
	}

	public void setEdu_Level(String edu_Level) {
		this.edu_Level = edu_Level;
	}

	public String getEdu_Loc_City() {
		return this.edu_Loc_City;
	}

	public void setEdu_Loc_City(String edu_Loc_City) {
		this.edu_Loc_City = edu_Loc_City;
	}

	public String getEdu_Loc_CountryRegion() {
		return this.edu_Loc_CountryRegion;
	}

	public void setEdu_Loc_CountryRegion(String edu_Loc_CountryRegion) {
		this.edu_Loc_CountryRegion = edu_Loc_CountryRegion;
	}

	public String getEdu_Loc_State() {
		return this.edu_Loc_State;
	}

	public void setEdu_Loc_State(String edu_Loc_State) {
		this.edu_Loc_State = edu_Loc_State;
	}

	public String getEdu_Major() {
		return this.edu_Major;
	}

	public void setEdu_Major(String edu_Major) {
		this.edu_Major = edu_Major;
	}

	public String getEdu_Minor() {
		return this.edu_Minor;
	}

	public void setEdu_Minor(String edu_Minor) {
		this.edu_Minor = edu_Minor;
	}

	public String getEdu_School() {
		return this.edu_School;
	}

	public void setEdu_School(String edu_School) {
		this.edu_School = edu_School;
	}

	public Date getEdu_StartDate() {
		return this.edu_StartDate;
	}

	public void setEdu_StartDate(Date edu_StartDate) {
		this.edu_StartDate = edu_StartDate;
	}

	public Integer getJobcandidateid() {
		return this.jobcandidateid;
	}

	public void setJobcandidateid(Integer jobcandidateid) {
		this.jobcandidateid = jobcandidateid;
	}

}