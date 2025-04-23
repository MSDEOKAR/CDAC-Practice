package com.acts.db.dao;
import java.util.List;
import java.util.Optional;

import com.acts.pojo.Student;

public interface StudentDao {

	//select * from student where rollno = ?
	Optional<Student> getStudentByRollNo(Integer rollNo);

	//select * from student
	List<Student> getAllStudents();

	//insert into student values(?, ?, ?, ?, ?)
	void saveStudent(Student student);

	//update student set course = ? where rollNo = ?
	void updateStudent(String newCourse, Integer rollNo);

	//delete from student where rollNo = ?
	void deleteStudent(Integer rollNo);
}
