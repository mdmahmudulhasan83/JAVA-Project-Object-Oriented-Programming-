

import java.lang.*;
import classes.*;
import fileio.*;
import java.util.Scanner;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		University u = new University();
		u.setName("AIUB");
		u.setBranchName("Kuratoli");
		
		System.out.println("------------------------------------");
		System.out.println("Welcome to AIUB Portal");
		System.out.println("------------------------------------\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("Do you want to log in?\n");
		
			System.out.println("\t1. Yes");
			System.out.println("\t2. No");
			
			System.out.println("\n---------------------------");
			System.out.print("Enter your choice: ");
			int choice1 = sc.nextInt();
			System.out.println("---------------------------\n");
			
			switch(choice1)
			{
				//Option: Log in
				case 1:
					System.out.print("Enter Your Name: ");
					String name1 = sc.next();
					System.out.print("Enter Your Student ID: ");
					String sid1 = sc.next();
					System.out.print("Enter Your Department: ");
					String sdepartment1 = sc.next();
							
					Student s1 = new Student();
					s1.setSName(name1);
					s1.setSId(sid1);
					s1.setSDepartment(sdepartment1);
							
					if(u.insertStudent(s1))
					{
						System.out.println("***  Student Info Inserted Successfully  ***");
						
						//File Write........................................
						frwd.writeInFile("### Student Info ###");
						frwd.writeInFile("Student Name: " + s1.getSName());
						frwd.writeInFile("Student ID: " + s1.getSId());
						frwd.writeInFile("Department: " + s1.getSDepartment());
						frwd.writeInFile("\n");
					}
					else
					{
						System.out.println("***  Student Not Inserted" + "  ***");
					}
					System.out.println("#####################################");
					System.out.println("........You are now logged in........");
					System.out.println("#####################################");
				
					for(int i=0; i<100; i++)
					{
						System.out.println("What do you want to do?\n");
					
						System.out.println("\t1. Add Course");
						System.out.println("\t2. Drop Course");
						System.out.println("\t3. Search Course");
						System.out.println("\t4. Registered Courses");
						System.out.println("\t5. Log out");
						
						System.out.println("\n---------------------------");
						System.out.print("Enter your option: ");
						int option1 = sc.nextInt();
						System.out.println("---------------------------\n");
						
						switch(option1)
						{
							//Option: Add Course 
							case 1:
								
								System.out.println("#####################################");
								System.out.println("You have selected Add Course");
								System.out.println("#####################################");
								
								for(int j=0; j<3; j++)
								{
									
									System.out.println(".....Which Course Do You Want to Add.....\n");
									
									System.out.println("\t1. Add Theory Courses");
									System.out.println("\t2. Add Lab Courses");
									System.out.println("\t3. Back to Add Course");
									
									System.out.println("\n---------------------------");
									System.out.print("Enter your choice: ");
									int type1 = sc.nextInt();
									System.out.println("---------------------------\n");
									
									switch(type1)
									{
										case 1:
											for(int k=0; k<5; k++)
											{
												System.out.println(".....Choose Theory Courses.....\n");
											
												System.out.println("\t1. Introduction to Programming");
												System.out.println("\t2. OOP1");
												System.out.println("\t3. OOP2");
												System.out.println("\t4. Data Structure");
												System.out.println("\t5. Algorithm");
												System.out.println("\t6. Exit");
												
												System.out.println("\n---------------------------");
												System.out.print("Enter your choice: ");
												int choice2 = sc.nextInt();
												System.out.println("---------------------------\n");
												
													switch(choice2)
													{
														//Options for theory course starts here...	
														case 1:
															Course c1 = null;
															Theory th1 = new Theory("Introduction to Programming", 1001, 3);
															c1 = th1;
															
															if (u.insertCourse(c1))
															{
																System.out.println("***  Course Added, Course Code : " + c1.getCourseCode() + "  ***");
															}
															else
															{
																System.out.println("***  Course Not Added, Course Code : " + c1.getCourseCode() + "  ***");
															}
													
															break;
															
														case 2:
															Course c2 = null;
															Theory th2 = new Theory("OOP1", 1002, 3);
															c2 = th2;
															
															if (u.insertCourse(c2))
															{
																System.out.println("***  Course Added, Course Code : " + c2.getCourseCode() + "  ***");
															}
															else
															{
																System.out.println("***  Course Not Added, Course Code : " + c2.getCourseCode() + "  ***");
															}
																	
															break;
															
														case 3:
															Course c3 = null;
															Theory th3 = new Theory("OOP2", 1003, 3);
															c3 = th3;
															
															if (u.insertCourse(c3))
															{
																System.out.println("***  Course Added, Course Code : " + c3.getCourseCode() + "  ***");
															}
															else
															{
																System.out.println("***  Course Not Added, Course Code : " + c3.getCourseCode() + "  ***");
															}
																
															break;
															
														case 4:
															Course c4 = null;
															Theory th4 = new Theory("Data Structure", 1004, 3);
															c4 = th4;
															
															if (u.insertCourse(c4))
															{
																System.out.println("***  Course Added, Course Code : " + c4.getCourseCode() + "  ***");
															}
															else
															{
																System.out.println("***  Course Not Added, Course Code : " + c4.getCourseCode() + "  ***");
															}
																
															break;
															
														case 5:
															Course c5 = null;
															Theory th5 = new Theory("Algorithm", 1005, 3);
															c5 = th5;
															
															if (u.insertCourse(c5))
															{
																System.out.println("***  Course Added, Course Code : " + c5.getCourseCode() + "  ***");
															}
															else
															{
																System.out.println("***  Course Not Added, Course Code : " + c5.getCourseCode() + "  ***");
															}	
															
															break;
															
														case 6:
										
															k = 5;
															System.out.println("#####################################");
															System.out.println("You are done with adding theoruy courses");
															System.out.println("#####################################");
															
															break;
									
														default:
															
															System.out.println("###############################");
															System.out.println("Invalid Choice... Try Again....");
															System.out.println("###############################");
															
															break;
													}	
											}		
											break;
											
										//Options for LAB Course Starts Here...	
										case 2:
											for(int l=0; l<4; l++)
											{
												System.out.println(".....Choose Lab Courses.....\n");
											
												System.out.println("\t1. Introduction to Programming Lab");
												System.out.println("\t2. OOP2 Lab");
												System.out.println("\t3. Data Structure Lab");
												System.out.println("\t4. Algorithm Lab");
												System.out.println("\t5. Exit");
												
												System.out.println("\n---------------------------");
												System.out.print("Enter your choice: ");
												int choice3 = sc.nextInt();
												System.out.println("---------------------------\n");
												
													switch(choice3)
													{
														case 1:
															Course c6 = null;
															Lab lb1 = new Lab("Introduction to Programming Lab", 1011, 1);
															c6 = lb1;
															
															if (u.insertCourse(c6))
															{
																System.out.println("***  Course Added, Course Code : " + c6.getCourseCode() + "  ***");
															}
															else
															{
																System.out.println("***  Course Not Added, Course Code : " + c6.getCourseCode() + "  ***");
															}
															break;
															
														case 2:
															Course c7 = null;
															Lab lb2 = new Lab("OOP2 Lab", 1022, 1);
															c7 = lb2;
															
															if (u.insertCourse(c7))
															{
																System.out.println("***  Course Added, Course Code : " + c7.getCourseCode() + "  ***");
															}
															else
															{
																System.out.println("***  Course Not Added, Course Code : " + c7.getCourseCode() + "  ***");
															}
															break;
															
														case 3:
															Course c8 = null;
															Lab lb3 = new Lab("Data Structure Lab", 1033, 1);
															c8 = lb3;
															
															if (u.insertCourse(c8))
															{
																System.out.println("***  Course Added, Course Code : " + c8.getCourseCode() + "  ***");
															}
															else
															{
																System.out.println("***  Course Not Added, Course Code : " + c8.getCourseCode() + "  ***");
															}
															break;
															
														case 4:
															Course c9 = null;
															Lab lb4 = new Lab("Algorithm Lab", 1044, 1);
															c9 = lb4;
															
															if (u.insertCourse(c9))
															{
																System.out.println("***  Course Added, Course Code : " + c9.getCourseCode() + "  ***");
															}
															else
															{
																System.out.println("***  Course Not Added, Course Code : " + c9.getCourseCode() + "  ***");
															}
															break;
															
														case 5:
														
															l=4;
															System.out.println("#####################################");
															System.out.println("You are done with Adding LAB Courses");
															System.out.println("#####################################");
															break;
															
														default:
														
															System.out.println("###############################");
															System.out.println("Invalid Choice... Try Again....");
															System.out.println("###############################");
															break;
													}
													
											}
											break;
										
										//Back to Add Course
										case 3:
										
											j = 3;
											System.out.println("#####################################");
											System.out.println("You have selected to Go Back....");
											System.out.println("#####################################");
											break;
											
										default:
											System.out.println("###############################");
											System.out.println("Invalid Choice... Try Again....");
											System.out.println("###############################");
											break;
									}
								}
								break;
									
							//Option: Remove Course 
							case 2:
								
								System.out.println("#####################################");
								System.out.println("You have selected Drop Course");
								System.out.println("#####################################");
								
								System.out.print("Enter Course Code to Drop a Course: ");
								int coursecode1 = sc.nextInt();
								
								Course c10 = u.searchCourse(coursecode1);
								
								if(c10 != null)
								{
									System.out.println("***  Course Found  ***");
									
									if(u.removeCourse(c10))
									{
										System.out.println("***  Course Removed, Code : " + c10.getCourseCode() + "  ***");
									}
								}
								else
								{
									System.out.println("***  Course NOT Found and NOT Removed  ***");
								}
									
								break;
							
							//Option: Search Course 						
							case 3:
								
								System.out.println("#####################################");
								System.out.println("You have selected Search Course");
								System.out.println("#####################################");
								
								System.out.print("Enter the Course Code to search a Course: ");
								int coursecode2 = sc.nextInt();
								
								Course c11 = u.searchCourse(coursecode2);
								
								if(c11 != null)
								{
									System.out.println("***  Course Found  ***");
									c11.showDetails();
								}
								else
								{
									System.out.println("***  Course NOT Found  ***");
								}
								break;
								
							//Option: Show All Registered Courses
							case 4:
							
								System.out.println("#####################################");
								System.out.println("You have selected Registered Courses");
								System.out.println("#####################################");
								
								u.showDetails();
								
								break;
							
							//Option: Go Back							
							case 5:
								i = 100;
								System.out.println("#####################################");
								System.out.println("You have selected to Go Back....");
								System.out.println("#####################################");
								
								break;
								
							default:
								
								System.out.println("#####################################");
								System.out.println("Invalid Option... Going Back...");
								System.out.println("#####################################");
								break;
						}
					}
					break;
				
				//Option: Exit
				case 2:
				
					repeat = false;
					System.out.println("#####################################");
					System.out.println("Thank You for using our Application");
					System.out.println("#####################################");
					break;
								
				default:
					System.out.println("Invalid Option... Going Back...");
					break;
			}
						
		}
		
	}	
}