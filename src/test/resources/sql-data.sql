INSERT INTO `customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison');
INSERT INTO `items` (`name`, `price`) VALUES ('bike', 50);
INSERT INTO `orders` (`customer_id`) VALUES (1);
INSERT INTO `orders_items` (`order_id`, `item_id`, `quantity`) VALUES (1, 1, 3);