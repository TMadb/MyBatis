package departmentdaotest;

import org.apache.ibatis.session.SqlSession;
import org.dao.DepartmentDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.utils.SqlSessionUtil;

public class CustomerDaoTest {
	
	
	//创建sqlsession和Dao层对象
		 SqlSession sqlsession;
		 DepartmentDao deptDao;
		 
		 @Before
		 public void setup() {
			 sqlsession = SqlSessionUtil.getSqlSession();
			 deptDao = sqlsession.getMapper(DepartmentDao.class);
		 }
		 
		 @After
		 public void teardown() {
			 if(sqlsession != null ) {
				 sqlsession.close();
			 }
		 }
		
		 @Test
		 public void testselectAllDepartmentById() {
			 deptDao.selectAllDepartmentById(2);
		 }
		 
		 @Test
		 public void testselectAllDepartment() {
			 deptDao.selectAllDepartment();
		 }
		 
		 @Test
		 public void testselectDepartmentById() {
			 deptDao.selectDepartmentById(4);
		 }
		 
		 

}
