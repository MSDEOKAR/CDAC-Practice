package com.acts.db.dao;
import java.util.List;
import java.util.Optional;

import com.acts.pojo.Student;

public interface StudentDao {

	Optional<Student> getStudentByRollNo(Integer rollNo);

	List<Student> getAllStudents();

	void saveStudent(Student student);

	void updateStudentCourse(String newCourse, Integer rollNo);

	void deleteStudent(Integer rollNo);
	
	int getStudentAge(Integer rollNo);
}
