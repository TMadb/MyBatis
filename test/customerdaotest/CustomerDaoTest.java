package customerdaotest;

import org.apache.ibatis.session.SqlSession;
import org.dao.CustomerDao;
import org.entity.Customers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.utils.SqlSessionUtil;

public class CustomerDaoTest {
	
	
	//创建sqlsession和Dao层对象
		 SqlSession sqlsession;
		 CustomerDao customerDao;
		 
		 @Before
		 public void setup() {
			 sqlsession = SqlSessionUtil.getSqlSession();
			 customerDao = sqlsession.getMapper(CustomerDao.class);
		 }
		 
		 @After
		 public void teardown() {
			 if(sqlsession != null ) {
				 sqlsession.close();
			 }
		 }
		
		 @Test
		 public void testselectAllCustomerGetCount() {
			Customers customers = new Customers();
			System.out.println(customerDao.selectAllCustomerGetCount(customers));
		 }

}
