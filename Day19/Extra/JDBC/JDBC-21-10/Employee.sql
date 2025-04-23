create table employee (
  empid int NOT NULL,
  name varchar(500) NULL,
  doj date NULL,
  dept varchar(50) NULL,
  salary double NULL,
  PRIMARY KEY (empid));
  
show tables;

set autocommit = 0;
  
INSERT INTO employee(empid,name,doj,dept,salary) VALUES(2157,'Deepak Joshi','2020-01-01','HR',65000);
INSERT INTO employee(empid,name,doj,dept,salary) VALUES(2158,'Ramesh Rao','2021-01-01','IT',90000);
INSERT INTO employee(empid,name,doj,dept,salary) VALUES(2159,'Deepali Kale','2022-01-01','HR',55000);
INSERT INTO employee(empid,name,doj,dept,salary) VALUES(2160,'Ganesh Zope','2020-01-01','ADMIN',45000);
INSERT INTO employee(empid,name,doj,dept,salary) VALUES(2161,'Rajesh Tambe','2019-01-01','IT',95000);
INSERT INTO employee(empid,name,doj,dept,salary) VALUES(2162,'Ajay Kale','2018-01-01','IT',100000);
INSERT INTO employee(empid,name,doj,dept,salary) VALUES(2163,'Manoj Attal','2015-01-01','IT',125000);

commit;

select * from employee;

DELIMITER //
create procedure employee_count(IN department varchar(50), OUT total int)
BEGIN
  SELECT count(*)
  INTO total
  FROM employee
  WHERE dept = department;
END //
DELIMITER ;


show procedure status where db='test';
drop procedure employee_count;

