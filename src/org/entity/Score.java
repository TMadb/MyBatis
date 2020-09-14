package org.entity;

public class Score {
	
	private Integer scid;
	
	private Integer score;
	
	private Stu stu;
	
	private Course course;
	

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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Score(Integer scid, Stu stu, Course course, Integer score) {
		super();
		this.scid = scid;
		this.stu = stu;
		this.course = course;
		this.score = score;
	}

	public Score() {
		super();
	}

	@Override
	public String toString() {
		return "Score [scid=" + scid + ", stu=" + stu + ", course=" + course + ", score=" + score + "]";
	}

	
	
}
