package barcodescannersapplication;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

// Class for Course Schedule
public class CourseSchedule {
	private String date_Current;
	private String courseTime;
	private String coursename;
	private String [] student_ID;
	private String teacher_name;
	
	// getter and setter
	public String getDate_Current() {
		return date_Current;
	}
	public void setDate_Current() {
		date_Current = "dd-MM-yyyy";
		// set current date using "SimpleDateFormat Utilities"
		Date date = new Date ();
		SimpleDateFormat ft =  new SimpleDateFormat(date_Current);
		this.date_Current = ft.format(date);
	}
	public String getCourseTime() {
		return courseTime;
	}
	public void setCourseTime() {
		 Date date = new Date ();
		 SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss");
		 ft.setTimeZone(TimeZone.getTimeZone("GMT+8"));
		
		this.courseTime = ft.format(date);
	}
	
	// testing different time
	public void differenttime(String time1, String time2){
		 Date date1 = new Date ();
		 Date date2 = new Date ();
		 SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss");
		 try {
			 date1 = ft.parse(time1);
			 date2 = ft.parse(time2);
			 
			 double diff = date2.getTime() - date1.getTime();
			 double diffhour = diff/(60 * 60 * 1000);
			 System.out.println("Total Hour is " + diffhour);
			 
			 
		 }catch (Exception e){
			 e.printStackTrace();
		 }
		 
		 
	}
	
	public String getcoursename (){
		return coursename;
	}
	
	public void setcoursename (String coursename){
		this.coursename = coursename;
	}
	
	public String[] getStudent_ID() {
		return student_ID;
	}
	public void setStudent_ID(String[] student_ID) {
		this.student_ID = student_ID;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_ID(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	
	public void printcoursedetails (){
		System.out.println("Course Date: " + getDate_Current() );
		System.out.println("Course Time: " + getCourseTime() );
		
		/*
		System.out.println("Teacher teach for this class is: " + getTeacher_name() );
		System.out.println("Student Study in this class with following ID's: ");
		for (String eachid: getStudent_ID()) {
			System.out.println(eachid);
		}
		*/
	}
	
	public static void main(String[] args) {
		
		CourseSchedule cs = new CourseSchedule ();
		cs.setDate_Current();
		cs.setCourseTime();
		cs.printcoursedetails();
		cs.differenttime("08:30:00", "18:00:00");
	}
	
}
