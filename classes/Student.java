package classes;

import java.lang.*;

public class Student
{
	private String sId;
	private String sName;
	private String sDepartment;
	
	public Student()
	{
		
	}
	public Student(String sId, String sName, String sDepartment)
	{
		this.sId = sId;
		this.sName = sName;
		this.sDepartment = sDepartment;
	}
	
	public void setSId(String sId)
	{
		this.sId = sId;
	}
	public void setSName(String sName)
	{
		this.sName = sName;
	}
	public void setSDepartment(String sDepartment)
	{
		this.sDepartment = sDepartment;
	}
	public String getSId()
	{
		return sId;
	}
	public String getSName()
	{
		return sName;
	}
	public String getSDepartment()
	{
		return sDepartment;
	}
	
	public void showDetails()
	{
		System.out.println("Student Name: " + sName);
		System.out.println("Student ID: " + sId);
		System.out.println("Department: " + sDepartment);
	}
}