package org.entity;

import java.util.List;

public class Score {
	
	private Integer scid;
	
	private Stu stu;
	
	private List<Course> courses;
	
	private Integer score;

	public Score(Integer scid, Stu stu, List<Course> courses, Integer score) {
		super();
		this.scid = scid;
		this.stu = stu;
		this.courses = courses;
		this.score = score;
	}

	public Score() {
		super();
	}

	public Integer getScid() {
		return scid;
	}

	public void setScid(Integer scid) {
		this.scid = scid;
	}

	public Stu getStu() {
		return stu;
	}

	public void setStu(Stu stu) {
		this.stu = stu;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Score [scid=" + scid + ", stu=" + stu + ", courses=" + courses + ", score=" + score + "]";
	}
	
}
