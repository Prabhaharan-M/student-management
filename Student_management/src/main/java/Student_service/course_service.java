package Student_service;

import java.util.ArrayList;
import java.util.List;

import student_details.course;

public class course_service {
	static List<course> courseList = new ArrayList<course>();
	
	public course_service() {
		courseList.add(new course(1,"java",20000,0));
		courseList.add(new course(2,"python",18000,0));
		courseList.add(new course(3,"C++",15000,0));
		courseList.add(new course(4,"SQL",10000,0));
		
		
	}
	public String addcourse(course c) {
		try{
			courseList.add(c);
			return "course added";
		}
		catch(Exception e){
			return "enter correct course details";
		}	
	}
	public static course getCourse(String courseName) {
		try {
			for(course c:courseList) {
				if(c.getCourseName().equalsIgnoreCase(courseName)) {
					return c;
				
				}
			}
		}
		catch(Exception e) {
			return null;
		}
		return null;
	}
	
	public double getcoursefees(String coursename) {
		try {
			for(course c:courseList) {
				if(c.getCourseName().equalsIgnoreCase(coursename)) {
					return c.getcoursefees();
				}
			}
		}
		catch(Exception e) {
			return 0 ;
		}
		return 0;
	}
	
	public course ViewCourse(String courseName) {
		try {
		for(course c:courseList) {
			if(c.getCourseName().equalsIgnoreCase(courseName)) {
				return c;
				}
			}	
		
		}
		catch(Exception e) {
			return null;
		}
		return null;

	}
	public List<course> ViewAllCourse(){
		try {
			return courseList;
		}
		catch(Exception e){
			return null;
		}
		
	}
	
	public String updateCourse(int courseId , String newcoursename) {
		try{
			for(course c: courseList) {
		
			if(c.getCourseId()==courseId) {
				c.setCourseName(newcoursename);
			}
		}
		}
		catch(Exception e) {
			return null;
		}
		return "invalid course Id";
	}
	
	
	
	
	
	public String deletecourse(String courseName) {
		try{
			for(course c:courseList) {
				if(c.getCourseName().equalsIgnoreCase(courseName)) {
					courseList.remove(c);
					return "course deleded";
				}
			
			}
			return "invali course name";
		}
		catch(Exception e){
			return "enter correct course details";
		}	
	}
	
	
	
	
}
