package coursedaotest;

import org.apache.ibatis.session.SqlSession;
import org.dao.CourseDao;
import org.dao.StuDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.utils.SqlSessionUtil;

public class CourseDaoTest {
	
	
	//创建sqlsession和Dao层对象
		 SqlSession sqlsession;
		 CourseDao courseDao;
		 
		 @Before
		 public void setup() {
			 sqlsession = SqlSessionUtil.getSqlSession();
			 courseDao = sqlsession.getMapper(CourseDao.class);
		 }
		 
		 @After
		 public void teardown() {
			 if(sqlsession != null ) {
				 sqlsession.close();
			 }
		 }
		
		 @Test
		 public void testselectAllStuByCid() {
			System.out.println(courseDao.selectAllCourseBySid(2));
		 }
		 
		 @Test
		 public void testselectAllStu() {
			 System.out.println(courseDao.selectAllStu());
		 }
		 
}
