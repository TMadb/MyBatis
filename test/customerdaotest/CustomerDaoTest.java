package customerdaotest;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.dao.CustomerDao;
import org.entity.Customers;
import org.entity.Page;
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
		 
		 @Test
		 public void testselectAllCustomerByCondition() {
			 Customers customer = new Customers();
			 customer.setGender("男");
			 Integer pageIndex = 1;
			 Integer pageSize = 10;
			 Integer count = customerDao.selectAllCustomerGetCount(customer);
			 List<Customers> customers = customerDao.selectAllCustomerByCondition
					(customer,(pageIndex-1)*pageSize,pageSize);
			 Page<Customers> pb = new Page<>();
			 pb.setList(customers);
			 pb.setPageIndex(pageIndex);
			 pb.setPageSize(pageSize);
			 pb.setCount(count); 
			 pb.setPageBegin();
		 }

}
