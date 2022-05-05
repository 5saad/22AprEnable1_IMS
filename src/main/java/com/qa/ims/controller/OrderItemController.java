package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderItemDAO;
import com.qa.ims.persistence.domain.OrderItem;
import com.qa.ims.utils.Utils;

public class OrderItemController implements CrudController<OrderItem> {

	public static final Logger LOGGER = LogManager.getLogger();

	private OrderItemDAO orderOrderItemDAO;
	private Utils utils;

	public OrderItemController(OrderItemDAO orderOrderItemDAO, Utils utils) {
		super();
		this.orderOrderItemDAO = orderOrderItemDAO;
		this.utils = utils;
	}

	// Read orderOrderItems to logger

	@Override
	public List<OrderItem> readAll() {
		List<OrderItem> orderOrderItems = orderOrderItemDAO.readAll();
		for (OrderItem orderOrderItem : orderOrderItems) {
			LOGGER.info(orderOrderItem);
		}
		return orderOrderItems;
	}

	// create an orderOrderItem from user input

	@Override
	public OrderItem create() {
		LOGGER.info("Please enter the order id");
		Long order_id = utils.getLong();
		LOGGER.info("Please enter the item id");
		Long item_id = utils.getLong();
		LOGGER.info("Please enter the quantity");
		Long quantity = utils.getLong();
		OrderItem orderOrderItem = orderOrderItemDAO.create(new OrderItem(order_id, item_id, quantity));
		LOGGER.info("Order item created");
		return orderOrderItem;
	}

	// update an existing orderOrderItem from the users input

	@Override
	public OrderItem update() {
		LOGGER.info("Please enter the id you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter the order_id");
		Long order_id = utils.getLong();
		LOGGER.info("Please enter the item_id");
		Long item_id = utils.getLong();
		LOGGER.info("Please enter the quantity");
		Long quantity = utils.getLong();
		OrderItem orderOrderItem = orderOrderItemDAO.update(new OrderItem(id,order_id, item_id, quantity));
		LOGGER.info("Order item Updated");
		return orderOrderItem;
	}

	// delete an existing orderOrderItem
	@Override
	public int delete() {
		LOGGER.info("Please enter the id you would like to delete");
		Long id = utils.getLong();
		LOGGER.info("Item deleted form order");
		return orderOrderItemDAO.delete(id);
	}

}

