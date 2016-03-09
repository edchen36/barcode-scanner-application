package barcodescannersapplication;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteObjectToFiles {
	
	File studentfile = new File("BarcodeStorage_demo.xlsx"); 
	// create workbook
	XSSFWorkbook workbook = new XSSFWorkbook(); 
			
	// create sheet
	XSSFSheet sheet = workbook.createSheet("Student Data");
	
	
	public void writetoExcel (){

		Map <String, Object []> data = new TreeMap<String, Object[]>();
		data.put("1", new Object []{"ID","Students Name", "Teacher Name","Date","Class","Time Start","Time End"});

		Set<String> keyset = data.keySet();
		int rownum = 0;
		for (String key:keyset){
			Row row = sheet.createRow(rownum++);
			Object [] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj: objArr){
				
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof String){
					cell.setCellValue((String)obj);
					
				} else if (obj instanceof Integer){
					cell.setCellValue((Integer)obj);
				}
			}
			
			
			try {
				FileOutputStream fos = new FileOutputStream(studentfile);
				workbook.write(fos);
				fos.close();
				System.out.println("BarcodeStorage_demo written successfully on disk");
			} catch (Exception e){
				e.printStackTrace();
				
			}
			
		}
		
		
		
	}
	
	public void writetoExcel_1 (int rowno,String studentID, String studentname, String teachername,
			String datenow, String classtaken, String timeNow,String timeEnd){
		
				
		Map <String, Object []> data = new TreeMap<String, Object[]>();
		data.put("2", new Object [] {studentID,studentname,teachername,datenow, classtaken,timeNow,timeEnd});

		Set<String> keyset = data.keySet();
		int rownum = rowno;
		for (String key:keyset){
			Row row = Sheet("Student Data").createRow(rownum);
			Object [] objArr = data.get(key);
			int cellnum = 0;
			for (Object obj: objArr){
				
				Cell cell = row.createCell(cellnum++);
				if (obj instanceof String){
					cell.setCellValue((String)obj);
					
				} else if (obj instanceof Integer){
					cell.setCellValue((Integer)obj);
				}
			}
			
			
			try {
				FileOutputStream fos = new FileOutputStream(studentfile);
				this.workbook.write(fos);
				fos.close();
				System.out.println("BarcodeStorage_demo written successfully on disk");
			} catch (Exception e){
				e.printStackTrace();
				
			}
			
		}
		
		
		
	}
	private XSSFSheet Sheet(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		
		WriteObjectToFiles wof1 = new WriteObjectToFiles();
//	    wof1.writetoExcel();
		wof1.writetoExcel_1(1,"ST001", "EDY", "Radhika", "27-10-2014", "Java", "19:35:00", "22:15:35");
//		wof1.writetoExcel_1(2,"ST001", "Dinesh", "Radhika", "27-10-2014", "Java", "19:35:00", "22:15:35");
		
		
	}
	
	

}
