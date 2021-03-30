DROP DATABASE IF EXISTS onlinebookstore;
CREATE DATABASE onlinebookstore;
USE onlinebookstore;

CREATE TABLE user_book_store(
	user_id INT PRIMARY KEY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
    user_name varchar(30),
	email_id VARCHAR(50),
	user_password VARCHAR(50),
	mobile_number VARCHAR(30),
	user_gender VARCHAR(50),
	profile_picture BLOB,
	cart_id INT,
	payment_id INT 
);

CREATE TABLE role_bookstore(
	role_id INT PRIMARY KEY,
	user_role VARCHAR(50),
    user_id INT
);

CREATE TABLE book(
	book_id INT PRIMARY KEY,
	book_price DECIMAL(10,2),
	book_title VARCHAR(50),
	book_author VARCHAR(50),
	book_language VARCHAR(50),
	publication_date DATETIME,
	publisher VARCHAR(50),
	book_image BLOB,
	isbn  INT,
    book_quantity INT,
    category_id INT
);

CREATE TABLE category(
	category_id INT PRIMARY KEY,
	category_name VARCHAR(50),
	rating VARCHAR(50),
	description VARCHAR(50)
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
	payment_method_id INT
);

CREATE TABLE payment_method(
	payment_method_id INT PRIMARY KEY,
	payment_type VARCHAR(30)
);

CREATE TABLE cart(
	cart_id INT PRIMARY KEY,
	quantity INT,
	total_price  DECIMAL(10,2),
	book_id INT
);

CREATE TABLE book_order(
	book_order_id INT PRIMARY KEY,
	book_order_date DATETIME,
	address_id INT,
	payment_id INT,
	cart_id INT,
	book_id INT
);

CREATE TABLE invoice( 
	invoice_id INT PRIMARY KEY,
	book_order_id  INT,
	user_id  INT,
	address_id  INT
);


ALTER TABLE user_book_store
ADD FOREIGN KEY (cart_id) REFERENCES cart(cart_id),
ADD FOREIGN KEY (payment_id) REFERENCES payment(payment_id);

ALTER TABLE role_bookstore
ADD FOREIGN KEY (user_id) REFERENCES user_book_store(user_id);

ALTER TABLE book
ADD	FOREIGN KEY (category_id) REFERENCES category(category_id);

ALTER TABLE payment
ADD FOREIGN KEY (payment_method_id) REFERENCES payment_method(payment_method_id);

ALTER TABLE cart
ADD FOREIGN KEY (book_id) REFERENCES book(book_id);

ALTER TABLE book_order
ADD FOREIGN KEY (payment_id) REFERENCES payment(payment_id),
ADD	FOREIGN KEY (cart_id) REFERENCES cart(cart_id),
ADD	FOREIGN KEY (address_id) REFERENCES user_address(address_id),
ADD FOREIGN KEY (book_id) REFERENCES book(book_id);

ALTER TABLE invoice
ADD FOREIGN KEY (book_order_id) REFERENCES book_order(book_order_id),
ADD FOREIGN KEY (user_id) REFERENCES user_book_store(user_id),
ADD FOREIGN KEY (address_id) REFERENCES user_address(address_id);

USE onlinebookstore;
INSERT INTO category VALUES (1,'thriller','good','a book containing thriller story');
INSERT INTO category VALUES (2,'horror','best','a book containing horror story');
INSERT INTO category VALUES (3,'scifi','worst','a book containing scifi story');
INSERT INTO category VALUES (4,'thriller','average','a book containing thriller story');
INSERT INTO category VALUES (5,'devotional','best','a book containing devotional story');

INSERT INTO book VALUES (1, 33.30,'aaa','ajith','tamil','2012-06-18 10:34:09','ajith','',11111,10,1);
INSERT INTO book VALUES (2, 43.30,'bbb','vijay','english','2013-06-18 11:34:09','vijay','',22222,20,2);
INSERT INTO book VALUES (3, 53.30,'ccc','surya','telugu','2014-06-18 12:34:09','surya','',33333,10,3);
INSERT INTO book VALUES (4, 63.30,'ddd','karthi','hindi','2015-06-18 01:34:09','karthi','',44444,40,4);
INSERT INTO book VALUES (5, 73.30,'eee','kumar','tamil','2016-06-18 09:34:09','kumar','',55555,88,5);

INSERT INTO cart VALUES (1,10,300.00,1);
INSERT INTO cart VALUES (2,10,400.00,2);
INSERT INTO cart VALUES (3,10,500.00,3);
INSERT INTO cart VALUES (4,10,600.00,4);
INSERT INTO cart VALUES (5,10,700.00,5);

INSERT INTO payment_method VALUES (1,'cash on delivery');
INSERT INTO payment_method VALUES (2,'upi');
INSERT INTO payment_method VALUES (3,'cash on delivery');
INSERT INTO payment_method VALUES (4,'card');
INSERT INTO payment_method VALUES (5,'cash on delivery');

INSERT INTO payment VALUES (1,1);
INSERT INTO payment VALUES (2,2);
INSERT INTO payment VALUES (3,3);
INSERT INTO payment VALUES (4,4);
INSERT INTO payment VALUES (5,5);

INSERT INTO user_address VALUES (1,'m04','collin street','chennai','tamilnadu',600096);
INSERT INTO user_address VALUES (2,'k04','st pius street','chennai','tamilnadu',700094);
INSERT INTO user_address VALUES (3,'l09','kamaraj 3rd street','nellore','hyderabad',100099);
INSERT INTO user_address VALUES (4,'w01','gandhi street','mumbai','maharashtra',300000);
INSERT INTO user_address VALUES (5,'t08','nehru 2nd street','pune','maharashtra',500091);

INSERT INTO book_order VALUES (1,'2021-01-01 10:34:09',1,1,1,1);
INSERT INTO book_order VALUES (2,'2021-02-18 11:34:09',2,2,2,2);
INSERT INTO book_order VALUES (3,'2021-03-02 08:34:09',3,3,3,3);
INSERT INTO book_order VALUES (4,'2021-01-17 04:34:09',4,4,4,4);
INSERT INTO book_order VALUES (5,'2021-02-28 03:34:09',5,5,5,5);


INSERT INTO user_book_store VALUES (1,'vijay', 'joseph','vj', 'vijay98@gmail.com', 'vijay007', '1234567890','male','',1,1);
INSERT INTO user_book_store VALUES (2, 'dhoni', 'ms','msd', 'dhoni7@gmail.com', 'dhoni007', '0987654321','male','',2,2);
INSERT INTO user_book_store VALUES (3,'virat', 'kohli','vk', 'kohli18@gmail.com', 'virat007', '1111111111','male','',3,3);
INSERT INTO user_book_store VALUES (4,'mithali', 'raj','mj', 'mithali3@gmail.com', 'mithali007', '2222222222','female','',4,4);
INSERT INTO user_book_store VALUES (5,'ravi', 'ashwin', 'ash','ashwin99@gmail.com', 'ashwin007', '3333333333','male','',5,5);

INSERT INTO role_bookstore VALUES (1, 'customer', 1);
INSERT INTO role_bookstore VALUES (2, 'customer', 2);
INSERT INTO role_bookstore VALUES (3, 'customer', 3);
INSERT INTO role_bookstore VALUES (4, 'customer', 4);
INSERT INTO role_bookstore VALUES (5, 'customer', 5);

INSERT INTO invoice VALUES (1,1,1,1);
INSERT INTO invoice VALUES (2,2,2,2);
INSERT INTO invoice VALUES (3,3,3,3);
INSERT INTO invoice VALUES (4,4,4,4);
INSERT INTO invoice VALUES (5,5,5,5);

<<<<<<< HEAD
select * from category;
=======
-- select * from user_book_store;
>>>>>>> 958e8f933525ccf3118d27291af6e67b505dd3e6









