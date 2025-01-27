package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

public class ItemController implements CrudController<Item> {

	public static final Logger LOGGER = LogManager.getLogger();

	private ItemDAO itemDAO;
	private Utils utils;

	public ItemController(ItemDAO itemDAO, Utils utils) {
		super();
		this.itemDAO = itemDAO;
		this.utils = utils;
	}

	// Read items to logger

	@Override
	public List<Item> readAll() {
		List<Item> items = itemDAO.readAll();
		for (Item item : items) {
			LOGGER.info(item);
		}
		return items;
	}

	// create an item from user input

	@Override
	public Item create() {
		LOGGER.info("Please enter the product name");
		String name = utils.getString();
		LOGGER.info("Please enter the price of the item");
		Double price = utils.getDouble();
		Item item = itemDAO.create(new Item(name, price));
		LOGGER.info("Item created");
		return item;
	}

	// update an existing item from the users input

	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long id = utils.getLong();
		LOGGER.info("Please enter the name of the item");
		String name = utils.getString();
		LOGGER.info("Please enter the price of the item");
		Double price = utils.getDouble();
		Item item = itemDAO.update(new Item(id, name, price));
		LOGGER.info("Item Updated");
		return item;
	}

	// delete an existing item
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the item you would like to delete");
		Long id = utils.getLong();
		LOGGER.info("item deleted");
		return itemDAO.delete(id);
	}

}
