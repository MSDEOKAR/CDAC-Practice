create schema test;
show schemas;
use test;


CREATE TABLE Student (
  RollNo INT NOT NULL,
  Name VARCHAR(500) NULL,
  DOB DATE NULL,
  Course VARCHAR(50) NULL,
  CenterName VARCHAR(100) NULL,
  PRIMARY KEY (RollNo));
  
show tables;
  
  
INSERT INTO student(RollNo,Name,DOB,Course,CenterName) VALUES(100,'Deepak Joshi','2000-01-01','DAC','ACTS');
INSERT INTO student(RollNo,Name,DOB,Course,CenterName) VALUES(101,'Ramesh Rao','2001-01-01','DESD','SUNBEAM');
INSERT INTO student(RollNo,Name,DOB,Course,CenterName) VALUES(102,'Deepali Kale','2004-01-01','DAC','ACTS');
INSERT INTO student(RollNo,Name,DOB,Course,CenterName) VALUES(103,'Ganesh Zope','2005-01-01','VLSI','IACSD');
INSERT INTO student(RollNo,Name,DOB,Course,CenterName) VALUES(104,'Raj Kundra','1984-01-01','DAC','ACTS');
INSERT INTO student(RollNo,Name,DOB,Course,CenterName) VALUES(105,'Ajay Kale','1984-01-01','DESD','IACSD');
INSERT INTO student(RollNo,Name,DOB,Course,CenterName) VALUES(106,'Manoj Attal','1999-01-01','VLSI','ACTS');

commit;

select * from student;

DELIMITER //

CREATE PROCEDURE GetAllStudents()
BEGIN
	SELECT *  FROM student;
END //


show procedure status where db='test';

DELIMITER //
CREATE FUNCTION getStudentAge(  
    RNO INT  
)   
RETURNS INT(20)  
DETERMINISTIC  
BEGIN  
    DECLARE AGE INT;  
    SET AGE := (SELECT FLOOR((CURDATE() - dob) / 10000) FROM student where rollNo = RNO);
    RETURN (AGE);  
END //

show function status where db='test';

