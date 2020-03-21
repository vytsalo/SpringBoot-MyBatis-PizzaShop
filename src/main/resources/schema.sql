drop table Employee;


   CREATE TABLE IF NOT EXISTS Employee (
   id int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
   name varchar(100) NOT NULL,
   surname varchar(100) NOT NULL,
   patronymic VARCHAR(100) NOT NULL,
   dateOfBirth DATE,
   phone varchar(255),
   email varchar(255)
);