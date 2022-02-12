package javabrushup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class excelTohashmap {
	



	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		
		 // excelTohashmap obj = new excelTohashmap(); 
	  excelTohashmap.datastoreTomap();
		//  obj.dataDriven();
		 
		  Sheet s1=  getsheet("e:\\Aarvi1.xls",0);
		  dataDriven(s1);
	}

	public static Sheet getsheet(String filename ,int i) throws IOException {
		
		FileInputStream fis = new FileInputStream(filename);
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(i);
		return sheet;
	}
	
	public static void datastoreTomap() throws IOException {
		
		HashMap<String, String> data = new HashMap<String,String>();
		
		  File filename = new File("e:\\Aarvi1.xls"); 
		  FileInputStream fis = new FileInputStream(filename);
		  HSSFWorkbook workbook = new HSSFWorkbook( (fis));
		  
		  HSSFSheet sheet = workbook.getSheetAt(0);
		 
		
		Iterator<Row> rowit = sheet.iterator();
		while(rowit.hasNext())
		{
			Row row = rowit.next();	
			Iterator<Cell> cellIterator = row.cellIterator();
			
			String finaldata="";
			String key="";
			int counter=0;
			
			while(cellIterator.hasNext())
			{

				Cell cell = cellIterator.next();
				
				CellType type = cell.getCellType();;
				
				if (counter==0) {
					if (type == CellType.STRING) {
						key=cell.toString();	
					}else if (type == CellType.NUMERIC) {
						key= String.valueOf(cell.getNumericCellValue()) ;
					}else if (type == CellType.FORMULA) {
						key= String.valueOf(cell.getNumericCellValue()) ;

					}	
				}else
				{	
					if (type == CellType.STRING) {
						finaldata=finaldata+"," + cell.toString();	
					}else if (type == CellType.NUMERIC) {
						int d=(int)  Math.round(cell.getNumericCellValue()) ;
						finaldata=finaldata+"," + d;
					}else if (type == CellType.FORMULA) {
						int d=(int)  Math.round(cell.getNumericCellValue()) ;
						finaldata=finaldata+"," + d;
					}				
				
				}
		
				counter++;
		

			}
		
			
			System.out.println("value=" + finaldata);
			System.out.println("Key=" + key);

			data.put(key, finaldata);	

			

	}
	}
	
	  public static void dataDriven(Sheet sheet) {
	  
	  Iterator<Row> row = sheet.rowIterator();
	  Row firstrow = row.next();
	  Iterator <Cell> cell = firstrow.cellIterator();
	  int k=0;
	  int coloumn =0 ;
	  
	  while(cell.hasNext())
	  {
		  Cell value = cell.next();
		  if(value.getStringCellValue().equalsIgnoreCase("name"));
		  {
			  coloumn=k;
	  }
	  
	  k++;
	
	  
	  }
	  System.out.println(row); 
	  System.out.println(coloumn);
	  
}
}	
	


	
	

