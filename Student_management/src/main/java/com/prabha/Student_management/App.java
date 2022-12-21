package com.prabha.Student_management;

import java.util.Scanner;

import Student_service.Student_service;
import Student_service.course_service;
import student_details.Student_details;
import student_details.course;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner ip=new Scanner(System.in);
        
        
        Student_service ss=new Student_service();
        course_service cs= new course_service();
        
        int opt = 0, studid;
        
		//EmployeeService es = new EmployeeService();
		//DepartmentService ds = new DepartmentService();

		char ch;
		do{
			System.out.println("Welcome to Student Management System");
			System.out.println();
			
			
			System.out.println("What are you interested in?\n");
			System.out.println("a) Student Management \nb) course Management");
			System.out.println("Enter your choice:");
			ch = ip.next().charAt(0);
			switch (ch) {
			case 'a':

				System.out.println("Welcome to Student Management");

				do {
					System.out.println(
							" 1.Add Student \n 2.View Student \n 3.View All Student \n 4.Update Student \n 5.Delete Student \n 6.Pay Fees ");
					opt = ip.nextInt();

					switch (opt) {
					case 1:
						System.out.println("enter Student details:");
						
						System.out.println("enter Student id :");
						studid=ip.nextInt();
						
						System.out.println("enter Student name :");
						String StudName=ip.next();
						
						System.out.println("enter Student course :");
						String StudCourse=ip.next();
						
						double studfees=cs.getcoursefees(StudCourse);
						
						System.out.println(ss.addStudent(new Student_details(studid ,StudName ,StudCourse,studfees )));
						break;
					case 2:
						System.out.println("enter Student details:");
						
						System.out.println("enter Student id :");
						studid=ip.nextInt();
						
						System.out.println(ss.viewStudent(studid));
						break;
					case 3:
						System.out.println("View All Student");
						
						for(Student_details s:ss.viewAllStudent()) {
							System.out.println(s.getStudid()+" "+s.getStudname()+" "+s.getStudcourse()+" "+s.getStudfees());
						}
						break;
					case 4:
						System.out.println("enter employee details whom you wnat to change :");
						
						System.out.println("enter Student id :");
						studid=ip.nextInt();
						
						System.out.println("enter which field you want to change like studNmae or courseName :");
						String key=ip.next();
						
						System.out.println("enter the details to be modified :");
						String value=ip.next();
						
						System.out.println(ss.UpdateStudent(studid, key, value));
						break;
					case 5:
						System.out.println("enter Student id :");
						studid=ip.nextInt();
						
						ss.deleteStudent(studid);
						System.out.println("deleded successfully");
						break;
					
					case 6:
						System.out.println("welcome to fees payment section :");
						System.out.println("Enter student id : ");
						studid=ip.nextInt();
						
						System.out.println("Enter amount to pay : ");
						double amount=ip.nextDouble();
						
						System.out.println(ss.payfees(studid, amount));
					}
					
					System.out.println("Would you like to continue? \n press 'a' for student management \n press 'b' for course management");
					ch = ip.next().charAt(0);
				}while(ch == 'a');
				break;	
			
			case 'b':
				System.out.println("Welcome to course Management");

				do {
					System.out.println(
							"1. Add course \n 2. View course \n 3.View All course \n 4. Update course \n 5.Delete course ");
					System.out.println("Enter your choice: ");
					opt = ip.nextInt();

					switch (opt) {
					case 1:
						System.out.println("Enter new course :");
						System.out.println("Enter new course Id :");
						int courseId=ip.nextInt();
						
						System.out.println("Enter new course name :");
						String courseName = ip.next();
						
						System.out.println("Enter course fees : ");
						double coursefees=ip.nextDouble();
						
						System.out.println(cs.addcourse(new course(courseId,courseName,coursefees, 0)));
						
						break;
					case 2:
						System.out.println("Enter course name to view :");
						courseName=ip.next();
						
						System.out.println(cs.ViewCourse(courseName));
						
						break;
					case 3:
						System.out.println("Here is the full course :");
						System.out.println(cs.ViewAllCourse());
						break;
					case 4:
						System.out.println("Enter the course details:");
						System.out.println("Enter course ID:");
						courseId = ip.nextInt();
						System.out.println("Enter the new name of the course");
						String newcourseName = ip.next();
						
						System.out.println(cs.updateCourse(courseId,newcourseName));
						
						break;
					case 5:
						System.out.println("Enter the course name you want to delete :");
						courseName=ip.next();
						
						cs.deletecourse(courseName);
						
						break;
						
					}
					System.out.println("Would you like to continue? \n press 'a' for student management \n press 'b' for course management");
						ch = ip.next().charAt(0);
				} while (ch == 'b');
				break;
			}

		}while(ch =='a' || ch == 'b');
	}
        
    }

