package org.entity;

import java.util.Date;

public class Employee {

    private int id;

    private String name;

    private String location;

    private int ismale;

    private Date joinDate;

    private Double salary;

    private Department dep;

	public Employee(int id, String name, String location, int ismale, Date joinDate, Double salary, Department dep) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.ismale = ismale;
		this.joinDate = joinDate;
		this.salary = salary;
		this.dep = dep;
	}

	public Employee() {
		super();
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getIsmale() {
		return ismale;
	}

	public void setIsmale(int ismale) {
		this.ismale = ismale;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", location=" + location + ", ismale=" + ismale + ", joinDate="
				+ joinDate + ", salary=" + salary + ", dep=" + dep + "]";
	}   
}
