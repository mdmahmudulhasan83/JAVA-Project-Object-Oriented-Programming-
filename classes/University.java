package classes;

import java.lang.*;
import interfaces.*;

public class University implements CourseOperations, StudentOperations
{
	private String name;
	private String branchName;
	private Course courses [] = new Course [10];
	private Student students [] = new Student [500];
	
	public University()
	{
		
	}
	public University(String name, String branchName)
	{
		this.name = name;
		this.branchName = branchName;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setBranchName(String branchName)
	{
		this.branchName = branchName;
	}
	
	public String getName()
	{
		return name;
	}
	public String getBranchName()
	{
		return branchName;
	}
	
	public boolean insertCourse(Course c)
	{
		for(int i=0; i<courses.length; i++)
		{
			if(courses[i] == null)
			{
				courses[i] = c;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeCourse(Course c)
	{
		for(int i=0; i<courses.length; i++)
		{
			if(courses[i] == c)
			{
				courses[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Course searchCourse(int courseCode)
	{
		for(int i=0; i<courses.length; i++)
		{
			if(courses[i] != null)
			{
				if(courses[i].getCourseCode() == courseCode)
				{
					return courses[i];
				}
			}
		}
		return null;
	}
	
	public void showAllCourses()
	{
		for(int i=0; i<courses.length; i++)
		{
			if(courses[i] != null)
			{
				courses[i].showDetails();
			}
		}
	}
	
	
	public boolean insertStudent(Student s)
	{
		for(int i=0; i<students.length; i++)
		{
			if(students[i] == null)
			{
				students[i] = s;
				return true;
			}
		}
		return false;
	}
	
	public void showAllStudents()
	{
		for(int i=0; i<students.length; i++)
		{
			if(students[i] != null)
			{
				students[i].showDetails();
			}
		}
	}
	
	
	public void showDetails()
	{
		System.out.println("**** University Info ****");
		System.out.println("University Name: " + name);
		System.out.println("University Branch: " + branchName);
		System.out.println();
		System.out.println("//////////////////////////////////");
		System.out.println("### Student Info ###");
		this.showAllStudents();
		System.out.println("//////////////////////////////////");
		System.out.println();
		System.out.println("### List of Courses ###");
		this.showAllCourses();
		System.out.println("//////////////////////////////////");
		
	}	
}


