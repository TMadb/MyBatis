package org.entity;

import java.util.List;

public class Stu {
	
	private Integer sid;
	
	private String sname;
	
	private List<Course> courses;
	
	private Score score;

	public Stu(Integer sid, String sname, List<Course> courses, Score score) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.courses = courses;
		this.score = score;
	}

	public Stu() {
		super();
	}

	@Override
	public String toString() {
		return "Stu [sid=" + sid + ", sname=" + sname + ", courses=" + courses + ", score=" + score + "]";
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}
}
