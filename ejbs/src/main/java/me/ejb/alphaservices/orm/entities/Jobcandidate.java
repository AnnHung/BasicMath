package me.ejb.alphaservices.orm.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the jobcandidate database table.
 * 
 */
@Entity
@NamedQuery(name="Jobcandidate.findAll", query="SELECT j FROM Jobcandidate j")
public class Jobcandidate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer jobcandidateid;

	private Timestamp modifieddate;

	private Object resume;

	//bi-directional many-to-one association to Employee
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="businessentityid")
	private Employee employee;

	public Jobcandidate() {
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

	public Object getResume() {
		return this.resume;
	}

	public void setResume(Object resume) {
		this.resume = resume;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}