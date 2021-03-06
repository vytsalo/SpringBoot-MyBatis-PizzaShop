/*Сотрудник*/
drop table IF EXISTS Employee;

   CREATE TABLE IF NOT EXISTS Employee (
   id int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
   name varchar(100) NOT NULL,
   surname varchar(100) NOT NULL,
   patronymic VARCHAR(100) NOT NULL,
   dateOfBirth DATE,
   phone varchar(255),
   email varchar(255)
);

/*Пиццы*/
drop table IF EXISTS Item;

   CREATE TABLE IF NOT EXISTS Item (
   id int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
   title varchar(100) NOT NULL,
   description varchar(255),
   price real NOT NULL,
   dateOfBirth DATE,
   picUrl varchar
);

/*Позиция, входящая в заказ
    1) Что заказали - Пицца карбонара
    2) Сколько заказали - 3 штуки
    3) К какому заказу это относится?
*/
drop table IF EXISTS OrderItems;

   CREATE TABLE IF NOT EXISTS OrderItems (
   itemId INT NOT NULL,
   quantity INT NOT NULL,
   orderId INT NOT NULL
);

/*Заказ*/
drop table IF EXISTS Order;

   CREATE TABLE IF NOT EXISTS Order (
   id int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
   orderDate DATE,
   deliveryDate timestamp,
   orderNumber varchar(100) NOT NULL,
   employeeId int,
   customerId int,
   orderItemsId int,
   deliveryAdress varchar(255),
   total real
);