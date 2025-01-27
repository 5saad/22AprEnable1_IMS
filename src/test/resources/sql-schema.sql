DROP TABLE IF EXISTS `orders_items`;
DROP TABLE IF EXISTS `orders`;
DROP TABLE IF EXISTS `items`;
DROP TABLE IF EXISTS `customers`;

CREATE TABLE IF NOT EXISTS `customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `items` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(40) DEFAULT NULL,
    `price` DEC(10,2) DEFAULT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `orders` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    customer_id INT NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customers(id) ON DELETE CASCADE,
    PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `orders_items` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    order_id INT NOT NULL,
    item_id INT NOT NULL,
    quantity INT NOT NULL,
    FOREIGN KEY (order_id) REFERENCES orders(id) ON DELETE CASCADE,
    FOREIGN KEY (item_id) REFERENCES items(id) ON DELETE CASCADE,
    PRIMARY KEY (`id`)
);