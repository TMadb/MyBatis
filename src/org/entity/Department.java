package org.entity;

import java.util.Date;
import java.util.List;

public class Department {
	
	
	private Integer id;
	
	private String name;
	
	private Integer companyId;
	
	private Date buildDate;
	
	private Integer number;

	//一个部门对应多个员工
	private List<Employee> emp;

	public Department(Integer id, String name, Integer companyId, Date builDate, Integer number, List<Employee> emp) {
		super();
		this.id = id;
		this.name = name;
		this.companyId = companyId;
		this.buildDate = builDate;
		this.number = number;
		this.emp = emp;
	}

	public Department() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Date getBuilDate() {
		return buildDate;
	}

	public void setBuilDate(Date builDate) {
		this.buildDate = builDate;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", companyId=" + companyId + ", builDate=" + buildDate
				+ ", number=" + number + ", emp=" + emp + "]";
	}
}
