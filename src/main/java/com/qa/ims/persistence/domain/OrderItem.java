package com.qa.ims.persistence.domain;

public class OrderItem {

	private Long id;
	private Long order_id;
	private Long item_id;
	private Long quantity;

	public OrderItem(Long order_id, Long item_id, Long quantity) {
		super();
		this.order_id = order_id;
		this.item_id = item_id;
		this.quantity = quantity;
	}

	public OrderItem(Long id, Long order_id, Long item_id, Long quantity) {
		super();
		this.id = id;
		this.order_id = order_id;
		this.item_id = item_id;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public Long getItem_id() {
		return item_id;
	}

	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "id: " + id + ", order_id: " + order_id + ", item_id: " + item_id + ", quantity: " + quantity;
	}

}
