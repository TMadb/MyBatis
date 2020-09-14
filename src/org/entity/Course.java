package org.entity;

public class Course {
	
	private Integer cid;
	
	private String cname;
	
	private Stu stu;

	public Course(Integer cid, String cname, Stu stu) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.stu = stu;
	}

	public Course() {
		super();
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Stu getStu() {
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", stu=" + stu + "]";
	}
}
