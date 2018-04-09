package com.onlinefoodstore.model;

/**
 * Order details
 * @author minh
 *
 */
public class OrderDetails {
	private long orderDetailsId;
	private long orderId;
	private Product product;
	private double price;
	
	public long getOrderDetailsId() {
		return orderDetailsId;
	}
	public void setOrderDetailsId(long orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
