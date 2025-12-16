package classes;

import java.lang.*;

public class Theory extends Course
{
	private int theoryCredit;
	
	public Theory()
	{
		
	}
	public Theory(String courseName, int courseCode, int theoryCredit)
	{
		super(courseName, courseCode);
		this.theoryCredit = theoryCredit;
	}
	
	public void setTheoryCredit(int theoryCredit)
	{
		this.theoryCredit = theoryCredit;
	}
	public int getTheoryCredit()
	{
		return theoryCredit;
	}
	
	public void showDetails()
	{
		System.out.println("**** Theory Course Information ****");
		System.out.println("Course Name: " + getCourseName());
		System.out.println("Course Code: " + getCourseCode());
		System.out.println("Theory Course Credit: " + theoryCredit);
		System.out.println();
	}
	
}