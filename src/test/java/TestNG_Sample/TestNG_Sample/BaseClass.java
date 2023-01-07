package TestNG_Sample.TestNG_Sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	static WebDriver driver;
	public static void Name_1() {
		System.out.println("Greens Tech");
	}
	
	public static void BrowserLaunch() {
			System.setProperty("webdriver.edge.driver", ".\\src\\test\\java\\driver\\msedgedriver.exe");
			driver=new EdgeDriver();
	}
	
	public static void getURL(String url) {
	try {
		driver.get(url);
	} catch (Exception e) {
		System.out.println("Invalid URL :"+e.getMessage());
	}

	}
	public static void window_Max() {
	driver.manage().window().maximize();
	}
	
	public static void elementSendkeys(WebElement element,String value) {
element.sendKeys(value);
	}
	
	public static void elementClick(WebElement element) {
element.click();
	}
	
	public static void write_Xl(int r,int c, String value) throws IOException {
		String path=".\\src\\test\\java\\testdata\\testdata.xlsx";
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(r);
		if (row==null) {
			row = sheetAt.createRow(r);
		}
		Cell cell = row.getCell(c);
		if (cell==null) {
			cell=row.createCell(c, CellType.STRING);
		}
		
		cell.setCellValue(value);
		
		FileOutputStream out=new FileOutputStream(f);
		wb.write(out);
		out.close();
	}
	
	
	
	
}
