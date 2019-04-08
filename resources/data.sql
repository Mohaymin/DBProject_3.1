CREATE DATABASE AIR_TICKET_MANAGEMENT;
USE AIR_TICKET_MANAGEMENT;
--DROP DATABASE AIR_TICKET_MANAGEMENT;

CREATE TABLE EMPLOYEE (
	email varchar(50) primary key not null,
	password varchar(100) not null, 
	designation varchar(50) not null
);

INSERT INTO EMPLOYEE (email, password, designation)
VALUES ('abc@abc.com', 'abc123', 'agent'),
		('pqrs@abc.com', 'hello', 'admin');

SELECT * FROM EMPLOYEE;

