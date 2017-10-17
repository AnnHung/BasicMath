package me.ejb.alphaservices.orm.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer businessentityid;

	@Temporal(TemporalType.DATE)
	private Date birthdate;

	private Object currentflag;

	private String gender;

	@Temporal(TemporalType.DATE)
	private Date hiredate;

	private String jobtitle;

	private String loginid;

	private String maritalstatus;

	private Timestamp modifieddate;

	private String nationalidnumber;

	private String organizationnode;

	private Object rowguid;

	private Object salariedflag;

	private Integer sickleavehours;

	private Integer vacationhours;

	//bi-directional many-to-one association to Employeedepartmenthistory
	@OneToMany(mappedBy="employee")
	private List<Employeedepartmenthistory> employeedepartmenthistories;

	//bi-directional many-to-one association to Employeepayhistory
	@OneToMany(mappedBy="employee")
	private List<Employeepayhistory> employeepayhistories;

	//bi-directional many-to-one association to Jobcandidate
	@OneToMany(mappedBy="employee")
	private List<Jobcandidate> jobcandidates;

	public Employee() {
	}

	public Integer getBusinessentityid() {
		return this.businessentityid;
	}

	public void setBusinessentityid(Integer businessentityid) {
		this.businessentityid = businessentityid;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Object getCurrentflag() {
		return this.currentflag;
	}

	public void setCurrentflag(Object currentflag) {
		this.currentflag = currentflag;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getHiredate() {
		return this.hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public String getJobtitle() {
		return this.jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public String getLoginid() {
		return this.loginid;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public String getMaritalstatus() {
		return this.maritalstatus;
	}

	public void setMaritalstatus(String maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}

	public String getNationalidnumber() {
		return this.nationalidnumber;
	}

	public void setNationalidnumber(String nationalidnumber) {
		this.nationalidnumber = nationalidnumber;
	}

	public String getOrganizationnode() {
		return this.organizationnode;
	}

	public void setOrganizationnode(String organizationnode) {
		this.organizationnode = organizationnode;
	}

	public Object getRowguid() {
		return this.rowguid;
	}

	public void setRowguid(Object rowguid) {
		this.rowguid = rowguid;
	}

	public Object getSalariedflag() {
		return this.salariedflag;
	}

	public void setSalariedflag(Object salariedflag) {
		this.salariedflag = salariedflag;
	}

	public Integer getSickleavehours() {
		return this.sickleavehours;
	}

	public void setSickleavehours(Integer sickleavehours) {
		this.sickleavehours = sickleavehours;
	}

	public Integer getVacationhours() {
		return this.vacationhours;
	}

	public void setVacationhours(Integer vacationhours) {
		this.vacationhours = vacationhours;
	}

	public List<Employeedepartmenthistory> getEmployeedepartmenthistories() {
		return this.employeedepartmenthistories;
	}

	public void setEmployeedepartmenthistories(List<Employeedepartmenthistory> employeedepartmenthistories) {
		this.employeedepartmenthistories = employeedepartmenthistories;
	}

	public Employeedepartmenthistory addEmployeedepartmenthistory(Employeedepartmenthistory employeedepartmenthistory) {
		getEmployeedepartmenthistories().add(employeedepartmenthistory);
		employeedepartmenthistory.setEmployee(this);

		return employeedepartmenthistory;
	}

	public Employeedepartmenthistory removeEmployeedepartmenthistory(Employeedepartmenthistory employeedepartmenthistory) {
		getEmployeedepartmenthistories().remove(employeedepartmenthistory);
		employeedepartmenthistory.setEmployee(null);

		return employeedepartmenthistory;
	}

	public List<Employeepayhistory> getEmployeepayhistories() {
		return this.employeepayhistories;
	}

	public void setEmployeepayhistories(List<Employeepayhistory> employeepayhistories) {
		this.employeepayhistories = employeepayhistories;
	}

	public Employeepayhistory addEmployeepayhistory(Employeepayhistory employeepayhistory) {
		getEmployeepayhistories().add(employeepayhistory);
		employeepayhistory.setEmployee(this);

		return employeepayhistory;
	}

	public Employeepayhistory removeEmployeepayhistory(Employeepayhistory employeepayhistory) {
		getEmployeepayhistories().remove(employeepayhistory);
		employeepayhistory.setEmployee(null);

		return employeepayhistory;
	}

	public List<Jobcandidate> getJobcandidates() {
		return this.jobcandidates;
	}

	public void setJobcandidates(List<Jobcandidate> jobcandidates) {
		this.jobcandidates = jobcandidates;
	}

	public Jobcandidate addJobcandidate(Jobcandidate jobcandidate) {
		getJobcandidates().add(jobcandidate);
		jobcandidate.setEmployee(this);

		return jobcandidate;
	}

	public Jobcandidate removeJobcandidate(Jobcandidate jobcandidate) {
		getJobcandidates().remove(jobcandidate);
		jobcandidate.setEmployee(null);

		return jobcandidate;
	}

}