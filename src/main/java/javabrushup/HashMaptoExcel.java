package javabrushup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HashMaptoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	HashMap<String ,String> map = new HashMap <String, String>();
		
		map.put("101","Aarvi");
		map.put("102","Sarvin");
		map.put("103","Mitansh");
		map.put("104","Swara");
		map.put("105","Disha");
		
		
		HashMaptoExcel obj = new HashMaptoExcel();
		obj.createexcel("E:/Student.xlsx",map);
	}
	
	public void createexcel(String filepath, HashMap<String ,String> abc ) throws IOException
	{
		XSSFWorkbook xwork = new XSSFWorkbook();
		XSSFSheet sheet = xwork.createSheet("Hashmap");
		
		FileOutputStream fos =new FileOutputStream(new File(filepath));
		
	
		int rowcount=0;
		 
		for(HashMap.Entry ent: abc.entrySet())
		{
			XSSFRow row = sheet.createRow(rowcount++);
			
			row.createCell(0).setCellValue((String)ent.getKey());
			row.createCell(1).setCellValue((String)ent.getValue());
			
						
		}
				
		xwork.write(fos);
		System.out.println("Excel file created");
	}


}
