package barcodescannersapplication;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import com.google.zxing.BarcodeFormat;

import eg.com.tm.barcode.processor.BarcodeEngine;
import eg.com.tm.barcode.processor.BarcodeEngine.DecodeResults;
import eg.com.tm.barcode.processor.config.DecodeConfig;

public class CourseChecker {
	
	/* Validation check if Students having class and what class on the day
	 * 
	 */
	
		public void studentteachercheck (ArrayList <Students> students,String studentid){
			
			CourseSchedule cs = new CourseSchedule ();
			int iget = 0;
			int check = 0;
		
				for (int i = 0; i< students.size(); i++ ){
					if (students.get(i).getStudentID().equals(studentid)  ){ // instead of ==, using arg1.equals(arg0)
						check = 1;
						iget = i;
						System.out.println("Welcome " + students.get(i).getStudentName());
						CreateCourse.createCourse (students.get(i).getStudentName());
					} 
					
				}
				
				if (check != 1){
					System.out.println("We can't find your name, Please Talk to us");
				}
		}
				
				
	public void teachercheck (ArrayList <Teachers> teachers,String teacherid){
				int iget;
				int check = 0;
		
				for (int i = 0; i<teachers.size(); i++){
					if (teachers.get(i).getTeacherID().equals(teacherid)){
						check = 1;
						iget = i;
						CreateCourse.createClass(teachers.get(i).getTeacherName());
					}
					
				}
				if (check != 1){
					System.out.println("We can't find your name, Please Talk to us");
				}
				
				
			}
	
		
		




}
