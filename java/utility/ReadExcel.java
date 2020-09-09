package utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readExcelData (String excelFileName) throws IOException {
		//1.Go to the folder and open the file-path/location
		//to read data write below code
		XSSFWorkbook book= new XSSFWorkbook("./TestData/"+excelFileName+".xlsx");
		//2.Select the sheet- Sheet name/index use book.getSheet and press ctrl2+L
		//XSSFSheet sheet = book.getSheet("Sheet1");
		//use getSheetAt(index) and press crtl2+L
		XSSFSheet sheet = book.getSheetAt(0);
		//3.You need to iterate over the rows count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		//4.You need to Col size to iterate over the cells.
		//to get the header row from a sheet
		XSSFRow headerRow = sheet.getRow(0);
		//to get the columnsize
		int colCount = headerRow.getLastCellNum();
		String[][] array = new String[rowCount][colCount];
		//iterate over the rows and columns always use forloop and not foreach
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				//for reading the data,getStringCellValue is used to retrive particular string cell value
				String data = cell.getStringCellValue();
				array[i-1][j]= data;
				System.out.println(data);
							}
				
		}
			
		return array;

	}

	public static String[][] readExcelData() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
