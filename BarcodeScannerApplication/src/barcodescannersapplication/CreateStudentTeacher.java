package barcodescannersapplication;

import java.util.ArrayList;

public class CreateStudentTeacher {
		
	// to Create array of Students from student class
	public static ArrayList <Students> AllStudents (){
		
		ArrayList <Students> AllStud = new ArrayList <Students> (); 
//		Students stu = new Students ();
		
		/* Create Three (3) Student */
		//Student 1
		String [] stu1_Courseenrolled = {"Java","Linux","Oracle Data Base","J2EE","JEE"};
//		stu.setCourseTaken(stu1_Courseenrolled );
		Students stu1 = new Students("Edy Tan",33,"ST001",stu1_Courseenrolled);
		
		//Student 2
		String [] stu2_Courseenrolled = {"Java","Linux","Oracle Data Base","J2EE","JEE"};
//		stu.setCourseTaken(stu2_Courseenrolled);
		Students stu2 = new Students("Amit",26,"ST002",stu2_Courseenrolled);
		
		//Student 3
		String [] stu3_Courseenrolled = {"Java","Linux","Oracle Data Base","J2EE","JEE"};
//		stu.setCourseTaken(stu3_Courseenrolled);
		Students stu3 = new Students("Dinesh",29,"ST003",stu3_Courseenrolled);
			
		AllStud.add(stu1);
		AllStud.add(stu2);
	    AllStud.add(stu3);
		
	    /* Print the student information
	    for (int i = 0; i< AllStud.size();i++){
	    	AllStud.get(i).printStudent();
	    }
		*/
	    return AllStud;
		
	}
	

	public static ArrayList  <Teachers> AllTeacher (){
		
		ArrayList <Teachers> AllTeachers = new ArrayList <Teachers> ();
		
		String [] teach1_course = {"Java","J2EE","JEE"};
		Teachers teacher1 = new Teachers("Radhika", "TC001",30,teach1_course);
		String [] teach2_course = {"Linux","Data Infastructure","Advanced Linux"};
		Teachers teacher2 = new Teachers("Raj", "TC002",40,teach2_course);
		String [] teach3_course = {"Oracle Database"};
		Teachers teacher3 = new Teachers("Sriram", "TC003",38,teach3_course);
		String [] teach4_course = {"Dot Net Frameworks"};
		
		AllTeachers.add(teacher1);
		AllTeachers.add(teacher2);
		AllTeachers.add(teacher3);	
		
		return AllTeachers;
		
	}
		

	public static void main(String[] args) {
		

		

	

		
		
		
	}

}
