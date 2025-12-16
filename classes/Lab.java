package classes;

import java.lang.*;

public class Lab extends Course
{
	private int labCredit;
	
	public Lab()
	{
		
	}
	public Lab(String courseName, int courseCode, int labCredit)
	{
		super(courseName, courseCode);
		this.labCredit = labCredit;
	}
	
	public void setLabCredit(int labCredit)
	{
		this.labCredit = labCredit;
	}
	public int getLabCredit()
	{
		return labCredit;
	}
	
	public void showDetails()
	{
		System.out.println("**** Lab Course Information ****");
		System.out.println("Course Name: " + getCourseName());
		System.out.println("Course Code: " + getCourseCode());
		System.out.println("Lab Course Credit: " + labCredit);
		System.out.println();
	}
}