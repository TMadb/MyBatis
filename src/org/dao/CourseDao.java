package org.dao;

import java.util.List;

import org.entity.Course;

public interface CourseDao {
	
	Course selectAllCourseBySid(Integer cid);
	
	List<Course> selectAllStu();

}
