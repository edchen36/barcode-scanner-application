package barcodescannersapplication;

import java.util.Scanner;

public class CreateCourse {
	
	/* Input manually course package for the day class 
	 * (this will be need to be change everyday unless course schedule is fix)
	 * for method createCourse, you will need to add more student/teacher name in case there is additional students/teacher 
	 * that also attend/teaching the class
	 */
	
	// Course for students
	static String [] course1 = {"Java","Oracle","Linux"}; // for student Edy Tan
	static String [] course2 = {"Oracle","Linux"}; // for student Amit
	static String [] course3 = {"Java","Linux"}; // For Student Dinesh
	static String [] course4 = {"DotNet","Java"}; // For Student Shankar Saranya
	static String [] course5; // Reserve
	static String [] course;
	
	// Class which teacher will Teach
	static String [] class1 = {"Java","Beginner Linux"}; // For Teacher Radhika
	static String [] class2 = {"Oracle"}; // For Teacher Sriram
	static String [] class3 = {"Intermediate Linux"}; // For Teacher Raj
	static String [] classteach;
	
	
	// Create arrangement for each student who will attend which class 
	public static void createCourse (String studentname){

		switch (studentname){
		case "Edy Tan":
			course = course1;
			printcourse (studentname, course);
			break;
		case "Amit":
			course = course1;
			printcourse (studentname, course);
			break;
		case "Dinesh":
			course = course3;
			printcourse (studentname, course);
			break;
		case "Shankar Saranya":
			course = course4;
			printcourse (studentname, course);
			break;	
		default :
			System.out.println("Hi " + studentname + " Today you dont have any class");
			
		}
	}
	// Create arrangement for teacher who will teach class 
	public static void createClass (String teachername){

		switch (teachername){
		case "Radhika":
			classteach = class1;
			printclass(teachername, classteach);
			break;
		case "Sriram":
			classteach = class2;
			printclass (teachername, classteach);
			break;
		case "Raj":
			classteach = class3;
			printclass (teachername, classteach);
			break;

		default :
			System.out.println("Hi " + teachername + " Today you dont have any teaching schedule");
			
		}
	}
	
	
	public static void printcourse (String studentteachername, String [] coursetaken){
		CourseSchedule cs = new CourseSchedule ();
		cs.setDate_Current();
		String date = cs.getDate_Current();
		
		System.out.println("Hi " + studentteachername + " You have following class today: ");
		for (String eachcourse:coursetaken){
			System.out.println("\t" + eachcourse);
		}
		System.out.println("Date of class is " + date);
		
	}
	
	public static void printclass (String teachername, String [] classtaken){
		
		Scanner scn = new Scanner(System.in);
		CourseSchedule cs = new CourseSchedule ();
		cs.setDate_Current();
		cs.setCourseTime();
		String date = cs.getDate_Current();
		String time = cs.getCourseTime();
		
		System.out.println("Hi " + teachername + " You have following teaching class today: ");
		for (int i = 0; i< classtaken.length;i++){
			System.out.println("class: "  + (i + 1) + " --> "+ classtaken[i] );
		}
			System.out.println("Please choose which class is going to Start now ?");
			
			int chooseclass = (scn.nextInt())-1;
			for (int i = 0; i< classtaken.length;i++){
				if (chooseclass == i){
					int iget = i;
					System.out.println("Enjoy your " + classtaken[i] + " Class ");
				}
			}
			System.out.println("Date of Class is " + date);
			System.out.println("Starting Time is " + time);
			
		
	}
	
	
	
}
