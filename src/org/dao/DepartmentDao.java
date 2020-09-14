package org.dao;

import java.util.List;

import org.entity.Department;

public interface DepartmentDao {
	
	//通过部门id查询部门信息
	List<Department> selectAllDepartmentById(Integer deptId);
	
	//分步查询
	List<Department> selectAllDepartment();

	Department selectDepartmentById(Integer id);
}
