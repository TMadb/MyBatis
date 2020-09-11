package org.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.entity.Customers;

public interface CustomerDao {
	
	/**
	 * MyBatis框架只能查询并返回数据库中存在的表，无法返回Page
	 * 只能把page的两个条件查询出来后在service中拼接
	 * 为了使通用的代码能够复用，只传一个参数的方法也加上@param标志进行区分
	 */
	
	//查询数据的总条数
	Integer selectAllCustomerGetCount(@Param("customer") Customers customers);
	
	//按分页的条件查询所有数据
	List<Customers> selectAllCustomerByCondition(
			@Param("customer") Customers customers,
			@Param("pageIndex") Integer pageIndex,
			@Param("pageSize") Integer pageSize);

}
