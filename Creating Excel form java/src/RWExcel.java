
import java.io.File;
import java.io.IOException;

import jxl.*;
import jxl.write.*;
import jxl.write.Number;

public class RWExcel {

	public static void main(String[] args) throws IOException, WriteException {
		// TODO Auto-generated method stub
		
		//String is used to point the directory where the file is to be created 
		String filePath = "E:\\OBE_File.xls";	
		
		File file;
		
		WritableWorkbook workbook = null ;
		Label label;
		Number number;
		WritableSheet sheet;
		
		try {
			
			 file = new File(filePath);
		
			 //The Condition is used to check weather the file is excited or not
			if (file.isFile() && file.exists()) { 
		
	            System.out.println("ObeFile.xls is Found in Directory No Need to Create "); 
	          
	        } 
	        else { 
	        	
	        	//creating a workbook
	        	workbook =  Workbook.createWorkbook(new File(filePath));
			 	//adding the sheet in workbook
	        	sheet = workbook.createSheet("Attandance",0);
	        	sheet = workbook.createSheet("FinalTerm",1);
	        	sheet = workbook.createSheet("MidTerm",2);
				
				//adding A Label
	        	sheet = workbook.getSheet(0);        	
	        	
				label = new Label (0,0,"Iftikhar Ahmad");
				sheet.addCell(label);
		
				number = new Number (1,0,3.66);
				sheet.addCell(number);
	
	            System.out.println("ObeFile.xls is not existed"
	                               + " A new File is Created in the Directory"); 
	        } 

			workbook.write();
			workbook.close();

		}catch (Exception e) {	}	
	}
}
