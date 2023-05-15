CREATE DATABASE IF NOT EXISTS dev;

use dev;
CREATE TABLE employee(
    empId int not null auto_increment, 
    firstName varchar(300),
    lastName varchar(300),
    primary key (empId)
);

insert into employee(firstName, lastName) values
('John', 'Doe'),
('John', 'Smith');

