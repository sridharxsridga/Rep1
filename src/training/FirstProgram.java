package training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import jxl.Workbook;
import jxl.Cell;
import jxl.Sheet;
import jxl.read.biff.BiffException;;
public class FirstProgram {

	WebDriver driver;
	static String p_pwd;
	static{
	
		System.setProperty("webdriver.geckodriver", "geckodriver.exe");
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		System.setProperty("webdriver.InternetExplorerDriver", "IEDriverServer.exe");
		Properties properties = new Properties();
		try {
			InputStream is = new FileInputStream("data.properties");
			properties.load(is);
			p_pwd=properties.getProperty("pwd");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, BiffException {
	
		
		
	 	//WebDriver driver = new InternetExplorerDriver();
	 	
		//WebDriver	driver = new FirefoxDriver();
	//	WebDriver	driver = new ChromeDriver();
		//String baseUrl ="https://wipfs01.wipro.com/adfs/ls/?wa=wsignin1.0&wtrealm=https%3a%2f%2fmywipro.wipro.com%2f&wctx=rm%3D0%26id%3Dpassive%26ru%3D%252F%26wtc%3D4%252F25%252F2018%25207%253A24%253A20%2520AM";
		
	//	driver.manage().deleteAllCookies();
	//	String baseUrl ="https://mywipro.wipro.com";
	//	driver.get(baseUrl);
		//System.out.println(p_pwd);
		//driver.findElement(By.xpath("//div[@id='userNameArea']/input[@id='userNameInput']")).sendKeys("sr262760@wipro.com");
		//driver.findElement(By.xpath("//div[@id='passwordArea']/input[@id='passwordInput']")).sendKeys("p_pwd");
		//driver.findElement(By.xpath("//div[@id='submissionArea']/span[@id='submitButton']")).click();
		readFromCsvFile();
	}
	
	public static void readFromCsvFile() throws BiffException, IOException{
		File objFile = new File("dataCsv.xls");
		Workbook  workbook=  Workbook.getWorkbook(objFile); 
		Sheet sheet = workbook.getSheet("Sheet1");
		
		int rows = sheet.getRows();
		int cols = sheet.getColumns();
		System.out.println(rows);
		System.out.println(cols);
		
		//Create array to store the data from the csv file
		
		String[][] mydata = new String[rows][cols];
		String[] username = new String[rows];
		for(int row=0;row<rows;row++){
			for(int col=0;col<cols;col++){
				Cell cell = sheet.getCell(row, col);
				
				
				mydata[row][col]=cell.getContents();
				
				
				
				System.out.println(mydata[row][col]);
			}
			
		}
		
	}

	
	
	@Test
	public void firstMethod(){
		System.out.println("first method");
	}
	
	@Test
	public void secondMethod(){
		System.out.println("second method"); 	
	}
	
	
	
}
