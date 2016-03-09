package barcodescannersapplication;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;

import eg.com.tm.barcode.processor.BarcodeEngine;
import eg.com.tm.barcode.processor.config.DecodeConfig;
import eg.com.tm.barcode.processor.config.EncodeConfig;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;


public class BarcodeApplication {
	
	File student_1;
	File student_2;
	File student_3;
	File teacher_1;
	File teacher_2;
	File teacher_3;
	String [] contentStudent;
	String [] contentTeacher;
	
	/* Method to create file of product Barcode*/
	public File [] createFileStudent (){
		/*
		 *  File will be used for creating the Product Barcode type.
		 *  Create as many as required of product Barcode for student
		 *  file created will be stored in c: drive
		 */
		
		this.student_1 = new File("C:\\barcode\\Student-1.png"); // student 1
		this.student_2 = new File("C:\\barcode\\Student-2.png"); // student 2
		this.student_3 = new File("C:\\barcode\\Student-3.png"); // student 3
		
		
		File [] allfile = new File[3];
		allfile[0] = student_1;
		allfile[1] = student_2;
		allfile[2] = student_3;
	
		return allfile;
		
	}
	
	public File [] createFileTeacher (){
		/*
		 *  File will be used for creating the Product Barcode type.
		 *  Create as many as required of product Barcode for student
		 *  file created will be stored in c: drive
		 */
		
		this.teacher_1 = new File("C:\\barcode\\teacher-1.png"); // teacher 1
		this.teacher_2 = new File("C:\\barcode\\teacher-2.png"); // teacher 2
		this.teacher_3 = new File("C:\\barcode\\teacher-3.png"); // teacher 3
		
		File [] allfile = new File[3];
		allfile[0] = teacher_1;
		allfile[1] = teacher_2;
		allfile[2] = teacher_3;
		
		return allfile;
		
	}
	
	/* This method is to Write the Barcode created above with content*/
	public void WriteBarcode (File [] barcodefile1,File [] barcodefile2){
	 
		ArrayList <Students> students = CreateStudentTeacher.AllStudents();
		ArrayList <Teachers> teachers= CreateStudentTeacher.AllTeacher();
		
	// Building the encoding configurations - using builder pattern
	   
		EncodeConfig encodeConfig =
	              new EncodeConfig.Builder().createDirectories(Boolean.TRUE).
	              withCharactersMode(Mode.ALPHANUMERIC).build();
	
   // Generating the PDF_417 Barcode
	      
		// to create a content of Barcode for Students
	      this.contentStudent = new String [students.size()];
	      
	      System.out.println("------------------- Begins Writing barcodes -------------------\n");
	      for (int i = 0;i<contentStudent.length;i++){
	    	  // content of Barcode will be student ID which already create at createStudentTeacher Class
	    	  contentStudent[i] = students.get(i).getStudentID();
	    	  BarcodeEngine.encode(barcodefile1[i], contentStudent[i], BarcodeFormat.PDF_417, 10, 40, encodeConfig);
		      System.out.println("Is PDF_417 barcode Created? " + (barcodefile1[i].exists() ? "Yes " : "Not not ") + "Created");
		      System.out.println("\n------------------- Finished Writing barcodes -------------------" + " For Student " + (i+1));
	      
	      }
	   // to create a content of Barcode for teacher
	      this.contentTeacher = new String [teachers.size()];
	      for (int i = 0;i<contentTeacher.length;i++){
	    	  // content of Barcode will be teacher ID which already create at createStudentTeacher Class
	    	  contentTeacher[i] = teachers.get(i).getTeacherID();
	    	  BarcodeEngine.encode(barcodefile2[i], contentTeacher[i], BarcodeFormat.PDF_417, 10, 40, encodeConfig);
		      System.out.println("Is PDF_417 barcode Created? " + (barcodefile2[i].exists() ? "Yes " : "Not not ") + "Created");
		      System.out.println("\n------------------- Finished Writing barcodes -------------------" + " For Teacher " + (i+1));
	      
	      }
	      
	      
	}
	
	
	
	// This method is to decode (read) back contents of created Barcodes
	public String ReadBarcode (File barcodefile){
		 
	      // Building the decoding configurations - using builder pattern
		
		DecodeConfig decodeConfig = new DecodeConfig.Builder().withHumanBarcodes(true).build();
	 
	    System.out.println("\n------------------- Begins reading barcodes -------------------\n");  
	    Map<BarcodeEngine.DecodeResults, Object> results = BarcodeEngine.decode(barcodefile, decodeConfig);
	    String decodeText = (String) results.get(BarcodeEngine.DecodeResults.RESULT);
	    String barcodeType = ((BarcodeFormat) results.get(BarcodeEngine.DecodeResults.BARCODE_FORMATE)).name();
	    System.out.println("The decoded contents is: \"" + decodeText + "\", Barcode type is: " + barcodeType);
	    System.out.println("\n------------------- Finished reading barcodes -------------------" );
	     
	    return decodeText;
	      
	}
	

}