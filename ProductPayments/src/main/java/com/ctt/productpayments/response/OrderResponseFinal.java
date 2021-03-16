package com.ctt.productpayments.response;

import java.util.List;

import com.ctt.productpayments.entity.Order;
import com.ctt.productpayments.entity.OrderStatus;
import com.ctt.productpayments.entity.Product;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderResponseFinal {
	
	public OrderResponseFinal(Order order) {
		this.setProductsIds(order.getProducts());
		this.setCodeOrder(order.getCode());
		this.setOrderStatus(order.getOrderStatus());
		this.setOrder(order);
	}

	
	private Order order;
	
	private List<Product> productsIds;
	
	private OrderStatus orderStatus;
	
	private String codeOrder;	
	

}
