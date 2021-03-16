package com.ctt.productpayments.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ctt.productpayments.entity.OrderStatus;
import com.ctt.productpayments.entity.PaymentStatus;

@Repository
public interface OrderStatusRepository extends JpaRepository<OrderStatus, Long>{
	
	Optional<OrderStatus> findByPaymentStatus(PaymentStatus paymentStatus);
	

}
