package com.ctt.productpayments.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ctt.productpayments.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
	
	List<Order> findOrderByIdIn(List<Order> ordersId);
	
	List<Order> findOrderById(Long Id);
		
	@Query (value = "SELECT * FROM orders WHERE id_order_status = 2", nativeQuery=true)	
	List<Order> findOrdersWaiting();	
	
	

}
