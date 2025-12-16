package classes;

import java.lang.*;

public abstract class Course
{	
	private String courseName;
	private int courseCode;
	
	public Course()
	{ 
	
	}
	public Course(String courseName, int courseCode)
	{
		this.courseName = courseName;
		this.courseCode = courseCode;
	}
	
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}
	
	public void setCourseCode(int courseCode)
	{
		this.courseCode = courseCode;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public int getCourseCode()
	{
		return courseCode;
	}
	
	public abstract void showDetails();
	
}