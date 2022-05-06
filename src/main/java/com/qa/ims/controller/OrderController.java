package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {

	public static final Logger LOGGER = LogManager.getLogger();

	private OrderDAO orderDAO;
	private Utils utils;

	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}

	// Reads all orders to the logger
	
	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(order);
		}
		return orders;
	}

	// Creates a order by taking in user input

	@Override
	public Order create() {
		LOGGER.info("Please enter a customer id");
		Long customerID = utils.getLong();
		Order order = orderDAO.create(new Order(customerID));
		LOGGER.info("Order created");
		return order;
	}

	// Updates an existing order by taking in user input
	 
	@Override
	public Order update() {
		LOGGER.info("Please enter the order id you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please set customer id");
		Long customerID = utils.getLong();
		Order order = orderDAO.update(new Order(id, customerID));
		LOGGER.info("Order Updated");
		return order;
	}

//	 Deletes an existing order by the id of the order
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long id = utils.getLong();
		LOGGER.info("Order deleted");
		return orderDAO.delete(id);
	}

}
