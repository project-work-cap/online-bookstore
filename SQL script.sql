DROP DATABASE IF EXISTS onlinebookstore;
CREATE DATABASE onlinebookstore;
USE onlinebookstore;

CREATE TABLE user_bookstore(
	user_id INT PRIMARY KEY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	email_id VARCHAR(50),
	user_password VARCHAR(50),
	phone_number INT,
	user_gender VARCHAR(50),
	profile_picture VARCHAR(30)
	role_id,
	cart_id,
	payment_id,
	order_id,
	FOREIGN KEY (role_id) REFERENCES role_bookstore(role_id),
	FOREIGN KEY (cart_id) REFERENCES cart(cart_id),
	FOREIGN KEY (payment_id) REFERENCES payment(payment_id),
	FOREIGN KEY (order_id) REFERENCES order(order_id)

);

CREATE TABLE role_bookstore(
	role_id INT PRIMARY KEY,
	user_role VARCHAR(50),
	user_id,
	FOREIGN KEY (user_id) REFERENCES user_bookstore(user_id)

);

CREATE TABLE book(
	book_id INT PRIMARY KEY,
	book_price DECIMAL(10,2),
	book_title VARCHAR(50),
	book_author VARCHAR(50),
	book_language VARCHAR(50),
	publication_date DATETIME,
	publisher VARCHAR(50),
	book_image MEDIUMBLOB,
	isbn  INT,
	category_id,
	FOREIGN KEY (category_id) REFERENCES category(category_id)

);

CREATE TABLE category(
	category_id INT PRIMARY KEY,
	category_name VARCHAR(50),
	rating VARCHAR(50),
	book_description VARCHAR(50),
	book_id,
	FOREIGN KEY (book_id) REFERENCES book(book_id)

	
);

CREATE TABLE user_address(
	address_id INT PRIMARY KEY,
	door_number VARCHAR(30),
	address_street VARCHAR(50),
	address_city VARCHAR(50),
	address_state VARCHAR(50),
	address_pincode INT

);

CREATE TABLE payment(
	payment_id INT PRIMARY KEY,
	payment_method VARCHAR(50),

);

CREATE TABLE paymentMethod(
	cashOnDelivery VARCHAR(30),
	upi VARCHAR(30),
	card_method VARCHAR(30),

);

CREATE TABLE cart(
	cart_id INT PRIMARY KEY,
	quantity INT,
	total_price  DECIMAL(10,2),
	book_id,
	order_id,
	FOREIGN KEY (book_id) REFERENCES book(book_id),
	FOREIGN KEY (order_id) REFERENCES order(order_id)

);

CREATE TABLE order(
	order_id INT PRIMARY KEY,
	order_date DATETIME,
    user_id,
	address_id,
	payment_id,
	cart_id,
	FOREIGN KEY (payment_id) REFERENCES payment(payment_id),
	FOREIGN KEY (cart_id) REFERENCES cart(book_cart_idid),
	FOREIGN KEY (address_id) REFERENCES user_address(address_id),
	FOREIGN KEY (user_id) REFERENCES user_bookstore(user_id),

);

CREATE TABLE bill( 
	bill_id INT PRIMARY KEY,
	order_id FOREIGN KEY
	product_id FOREIGN KEY
	user_id FOREIGN KEY
	user_address FOREIGN KEY
	FOREIGN KEY (order_id) REFERENCES order(order_id),
	FOREIGN KEY (product_id) REFERENCES product(product_id),
	FOREIGN KEY (user_id) REFERENCES user_bookstore(user_id),
	FOREIGN KEY (address_id) REFERENCES user_address(address_id),

);

