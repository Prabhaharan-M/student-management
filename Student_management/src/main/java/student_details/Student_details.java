package student_details;

public class Student_details {
	private int studid;
	private String studname;
	private String studcourse;
	private double studfees;
	
	public Student_details(int studid, String studname, String studcourse,double studfees) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.studcourse = studcourse;
		this.studfees = studfees;
	}
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public String getStudcourse() {
		return studcourse;
	}
	public void setStudcourse(String studcourse) {
		this.studcourse = studcourse;
	}
	public double getStudfees() {
		return studfees;
	}
	public void setStudfees(double amount) {
		this.studfees = studfees-amount;
	}
	@Override
	public String toString() {
		return "Student_details [studid=" + studid + ", studname=" + studname + ", studcourse=" + studcourse + ",studfees="+studfees+"]";
	}
	
	
}
