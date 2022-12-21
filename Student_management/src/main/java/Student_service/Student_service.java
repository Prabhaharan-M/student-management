package Student_service;

import java.util.ArrayList;
import java.util.List;



import student_details.Student_details;
import student_details.course;


public class Student_service {

	
		List<Student_details> studList = new ArrayList<Student_details>();
		
		public String addStudent(Student_details stud) {
			try {
			course c=course_service.getCourse(stud.getStudcourse());
			c.setNoOfStudent(c.getNoOfStudent()+1);
			studList.add(stud);
				return "Student added";
				
			}
			catch(Exception e) {
				return "enter correct details"+e;
			}
			
		}
		
		
		public  Student_details viewStudent(int studid ) {
			try {
				for (Student_details s:studList) {
					if(s.getStudid()==studid) {
						return s;
					}
					
				}
				
			}
			catch(Exception e) {
				return null;
			}
			return null;
		
			
		}
		
		public List<Student_details> viewAllStudent(){
			try {
				return studList;
			}
			catch(Exception e) {
				return null;
			}
		}
		
		public String deleteStudent(int studid) {
			try {
				for(Student_details s:studList) {
					if(s.getStudid()==studid) {
						course c=course_service.getCourse(s.getStudcourse());
						c.setNoOfStudent(c.getNoOfStudent()-1);
						studList.remove(s);
						return "Student got dismissed";
					}
				}
				return "invalid Student id";
			}
			catch(Exception e) {
				return "check the details which is correct or not";
			}
			
		}
		public String UpdateStudent(int studid ,String key,String value ) {
			try {
				for(Student_details s:studList) {
					if(s.getStudid()==studid) {
						if(s.getStudname().equalsIgnoreCase(key)) {
							s.setStudname(value);
						}
						else if(s.getStudcourse().equalsIgnoreCase(key)) {
							
							course c=course_service.getCourse(s.getStudcourse());
							c.setNoOfStudent(c.getNoOfStudent()-1);
							
							s.setStudcourse(value);
							
							c=course_service.getCourse(s.getStudcourse());
							c.setNoOfStudent(c.getNoOfStudent()+1);
						}
					}
				}
				
			}
			catch(Exception e) {
				return "invalid Student id"+e;
			}
			return "student details is updated";
		}
		
		public  double payfees(int studid, double amount) {
			try {
				for(Student_details s:studList) {
					if(s.getStudid()==studid) {
						System.out.println("the amount is "+amount);
						System.out.println("the balance is ");
						 s.setStudfees(amount);
						return s.getStudfees();
						
						
					}
				}
				
				
			}
			catch(Exception e) {
				return 0;
			}
			return 0;
			
		}
		
		
		
		public  double getbalance(int studid) {
			try {
				for(Student_details s:studList) {
					if(s.getStudid()==studid) {
						return s.getStudfees();
					}
				}
				
				
			}
			catch(Exception e) {
				return 0;
			}
			return 0;
		}
		
		
		
	}


