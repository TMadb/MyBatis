package orderdaotest;

import org.apache.ibatis.session.SqlSession;
import org.dao.OrderDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.utils.SqlSessionUtil;

public class OrderDaoTest {
	
	
	//创建sqlsession和Dao层对象
		 SqlSession sqlsession;
		 OrderDao orederDao;
		 
		 @Before
		 public void setup() {
			 sqlsession = SqlSessionUtil.getSqlSession();
			 orederDao = sqlsession.getMapper(OrderDao.class);
		 }
		 
		 @After
		 public void teardown() {
			 if(sqlsession != null ) {
				 sqlsession.close();
			 }
		 }
		
		 @Test
		 public void testselectAllCourseBySid() {
			System.out.println(orederDao.selectOrderByUserId(16));
		 }
		 
//		 @Test
//		 public void testselectAllCourse() {
//			 System.out.println(orederDao.selectAllCourse());
//		 }
		 
}
