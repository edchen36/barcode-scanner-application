package barcodescannersapplication;

/* Class of Students: to create getter, setter and parameterized constructor of students with its attributes
 * 
 */
public class Students {
	private String studentName;
	private int studentAge;
	private String studentID;
	private String [] courseTaken;
	
	/* default Constructor*/
	public Students (){
		
	}

	/* Parameterized Constructor */
	public Students(String studentName, int studentAge,  String studentID,
			String[] courseTaken) {
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentID = studentID;
		this.courseTaken = courseTaken;
	}
	


	/* Getter and setter*/
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String[] getCourseTaken() {
		return courseTaken;
	}

	public void setCourseTaken(String[] courseTaken) {
		this.courseTaken = courseTaken;
	}
	

	public void printStudent (){
		System.out.println("Student Name: " + getStudentName() );
		System.out.println("Student Age: " + getStudentAge() );
		System.out.println("Student ID : " + getStudentID() );
		System.out.println("Course Taken as follows : ");
		for (String eachcourse:getCourseTaken() ){
			System.out.println("\t" + eachcourse);
		}
	
		
		
		
		
		
	}
	

}
