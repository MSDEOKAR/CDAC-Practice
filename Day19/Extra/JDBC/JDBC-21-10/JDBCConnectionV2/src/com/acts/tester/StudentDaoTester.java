package com.acts.tester;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.acts.db.dao.StudentDao;
import com.acts.db.dao.impl.StudentDaoImpl;
import com.acts.pojo.Student;

public class StudentDaoTester {

	public static void main(String[] args) {
		//Create DAO Object
		StudentDao studentDao = new StudentDaoImpl();
//		//Get all Students
//		List<Student> studentsList = studentDao.getAllStudents();
//		studentsList.forEach(System.out::println);
//
//		//Create new student and save in DB		
//		Date date = Date.valueOf("2000-01-06");
//		Student student = new Student(107, "Raj Kundra", date, "DAC", "ACTS");
//		studentDao.saveStudent(student);
//		
//		Optional<Student> student1 = studentDao.getStudentByRollNo(100);
//		System.out.println(student1.get());
//
//		//Update Student
//		studentDao.updateStudentCourse("VLSI", 107);
//		//Get all Students
//		studentDao.getAllStudents().forEach(System.out::println);
//
//		//Delete Student
//		studentDao.deleteStudent(107);

		//Get all Students
		studentDao.getAllStudents().forEach(System.out::println);
		int age = studentDao.getStudentAge(104);
		System.out.println(age);

	}
}

