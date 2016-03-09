package barcodescannersapplication;

public class Teachers {
	private String teacherName;
	private String teacherID;
	private int teacherAge;
	private String [] classTeach;
	
	/* Parameterized Constructor */
	public Teachers(String teacherName, String teacherID, int teacherAge,
			String[] classTeach) {
		this.teacherName = teacherName;
		this.teacherID = teacherID;
		this.teacherAge = teacherAge;
		this.classTeach = classTeach;
	}

	/* Getter and setter*/
	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public int getTeacherAge() {
		return teacherAge;
	}

	public void setTeacherAge(int teacherAge) {
		this.teacherAge = teacherAge;
	}

	public String[] getClassTeach() {
		return classTeach;
	}

	public void setClassTeach(String[] classTeach) {
		this.classTeach = classTeach;
	}
	
	public void printTeacher (){
		System.out.println("Teacher Name: " + getTeacherName());
		System.out.println("Teacher Age: " + getTeacherAge());
		System.out.println("Teacher ID: " + getTeacherID());
		System.out.println(getTeacherName() + " teaches following courses:");
		for (String eachcourse: getClassTeach() ){
			System.out.println(eachcourse);
		}
		
		
		
	}
	
	

}
