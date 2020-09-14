package org.entity;

import java.util.List;

public class Course {
	
	private Integer cid;
	
	private String cname;
	
	private List<Stu> stus;

	private Score score;

	public Course(Integer cid, String cname, List<Stu> stus, Score score) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.stus = stus;
		this.score = score;
	}

	public Course() {
		super();
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", stus=" + stus + ", score=" + score + "]";
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

	public List<Stu> getStus() {
		return stus;
	}

	public void setStus(List<Stu> stus) {
		this.stus = stus;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}
 
}
