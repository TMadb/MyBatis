package org.dao;

import java.util.List;

import org.entity.Order;

public interface OrderDao {
	
	List<Order> selectOrderByUserId(Integer user_id);

}
