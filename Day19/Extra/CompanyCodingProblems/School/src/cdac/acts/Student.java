package cdac.acts;

import cdac.acts.constants.Constants;

public class Student 
{
	int iRollNo;
	String strName;
	String strCourse;
	
	
	public Student()
	{
		iRollNo = 0;
		strName = Constants.EMPTY_STRING;
		strCourse = Constants.EMPTY_STRING;
	}
	
	public Student(int iRollNo ,String strName,String strCourse)
	{
		this.iRollNo = iRollNo;
		this.strName = strName;
		this.strCourse = strCourse;
	}
	
	@Override
	public String toString() 
	{
		 
		return "\nRoll No:="+iRollNo+" Name:="+ strName+" Course:="+strCourse;
	}
	
//	public static void main(String[] args) 
//	{
//		Student objStudent = new Student(1,"Praphul","DAC");
//		System.out.println(objStudent);
//		
//	}
	
	
}
