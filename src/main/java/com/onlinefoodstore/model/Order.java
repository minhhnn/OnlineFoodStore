package com.onlinefoodstore.model;

import java.time.Instant;
import java.util.List;

/**
 * Order
 * @author minh
 *
 */
public class Order {
	private long orderId;
	private Customer customer;
	private List<OrderDetails> orderDetails;
	private Instant orderTime;
	private double totalPrice;
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<OrderDetails> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
	public Instant getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Instant orderTime) {
		this.orderTime = orderTime;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
