package student_details;

public class course {
	private int courseId;
	private String courseName;
	private double coursefees;
	private int noOfStudent;
	public course(int courseId, String courseName, double coursefees, int noOfStudent) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.coursefees = coursefees;
		this.noOfStudent = noOfStudent;
		
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getNoOfStudent() {
		return noOfStudent;
	}
	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}
	public double getcoursefees() {
		return coursefees;
	}
	public void setcoursefees(double coursefees) {
		this.coursefees = coursefees;
	}
	@Override
	public String toString() {
		return "course [courseId=" + courseId + ", courseName=" + courseName + ",coursefees="+coursefees+", noOfStudent=" + noOfStudent + "]";
	}
	
}
