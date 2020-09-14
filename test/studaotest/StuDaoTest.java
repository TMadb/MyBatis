package studaotest;

import org.apache.ibatis.session.SqlSession;
import org.dao.StuDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.utils.SqlSessionUtil;

public class StuDaoTest {
	
	
	//创建sqlsession和Dao层对象
		 SqlSession sqlsession;
		 StuDao stuDao;
		 
		 @Before
		 public void setup() {
			 sqlsession = SqlSessionUtil.getSqlSession();
			 stuDao = sqlsession.getMapper(StuDao.class);
		 }
		 
		 @After
		 public void teardown() {
			 if(sqlsession != null ) {
				 sqlsession.close();
			 }
		 }
		
		 @Test
		 public void testselectAllCourseBySid() {
			System.out.println(stuDao.selectAllCourseBySid(2));
		 }
		 
		 @Test
		 public void testselectAllCourse() {
			 System.out.println(stuDao.selectAllCourse());
		 }
		 
}
