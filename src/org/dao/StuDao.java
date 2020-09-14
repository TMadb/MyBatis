package org.dao;

import java.util.List;

import org.entity.Stu;

public interface StuDao {
	
	Stu selectAllCourseBySid(Integer sid);
	
	List<Stu> selectAllCourse();

}
