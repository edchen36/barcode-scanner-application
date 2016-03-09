package barcodescannersapplication;

import java.io.File;
import java.util.ArrayList;

public class TestBarcodeScanner {

	public static void main(String[] args) {
		
		CreateStudentTeacher create = new CreateStudentTeacher ();
		CourseSchedule cs = new CourseSchedule ();
		CourseChecker cc = new CourseChecker ();
		CreateCourse cc2 = new CreateCourse ();
		BarcodeApplication cr = new BarcodeApplication ();
		
		/*
		String [] studentid = {"ST001","ST002"};
		cs.setStudent_ID(studentid);
		cs.setcoursename("Java");
		cs.studentteachercheck("ST002", "Radhika", allStudents);
		*/
		
		
		// Step 1: Create Student/teacher Information List
		ArrayList <Students> allStudents = CreateStudentTeacher.AllStudents(); // AllStudents is static method or create.AllStudents()
		ArrayList <Teachers> allTeachers = CreateStudentTeacher.AllTeacher(); // AllTeachers us Static method or create.AllTeacher()
		
		// Step 2: Create Barcode File which will be store in directory c:
		File [] Filename1 = cr.createFileStudent ();
		File [] Filename2 = cr.createFileTeacher ();
		// Step 3: Start to write the barcode file with required content (in this case is student id)
		cr.WriteBarcode(Filename1,Filename2);
		
		// Step 4: Student/Teacher to input their barcode files
		File barcodeStudent1 = cr.student_2;
//		File barcodeTeacher1 = cr.teacher_1;
		
		// Step 5: Method to read the input barcode file above
		String contentStudent1 = cr.ReadBarcode(barcodeStudent1);
//		String contentTeacher1 = cr.ReadBarcode(barcodeTeacher1);
	
		System.out.println("------------------- Begin Checking if student is having class or not -------------------\n");
		
		// Step 6: Method to check whether student/teacher who has input their barcode files is having class or not
		cc.studentteachercheck(allStudents,contentStudent1 );
		
		System.out.println("------------------- Begin Checking if teacher is having teaching schedule or not -------------------\n");
//		cc.teachercheck(allTeachers, contentTeacher1);
		
		
		
		
	}

}
