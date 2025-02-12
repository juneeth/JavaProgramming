package amazon_project;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pdoc_mail_automation {

	public static void main(String[] args) throws IOException, InterruptedException 
	{

		Scanner sc=new Scanner(System.in);
		//Adding the mail id
		String mail_id;
		System.out.println("Kindly Enter the Login Email ID: ");
		mail_id=sc.nextLine();
		
		//Adding the Pass word 
		String pwd;
		System.out.println("Kindly Enter the Account Password: ");
		pwd=sc.nextLine();
		
		//adding the approval mail 
		String email_address;
		System.out.println("Kindly Add a new approval e-mail address ");
		
		email_address=sc.nextLine();
		
		int enable_disable;
		System.out.println("Kindly Enter 1 to 'Enable personal document archiving': ");
		System.out.println("Kindly Enter 2 to 'Disable personal document archiving': ");
		enable_disable=sc.nextInt();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		
		//1. Sign in
		WebElement Account_list=driver.findElement(By.id("nav-link-accountList"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		//act.moveToElement(Account_list);
		Account_list.click();
		
		//Sending the account id :
		driver.findElement(By.name("email")).sendKeys("ajuneeth+22@amazon.com");
		//clicking on the continue
		driver.findElement(By.id("continue")).click();
		
		//sending the password here in the account
		driver.findElement(By.id("ap_password")).sendKeys("password");
		//clicking on the sign in option
		driver.findElement(By.id("signInSubmit")).click();
		
		
		WebElement accountandlist=driver.findElement(By.xpath("//a[@id='nav-link-accountList']//span[@class='nav-line-2 ']"));
		WebElement contentlibrary=driver.findElement(By.xpath("//span[normalize-space()='Content Library']"));
		act.moveToElement(accountandlist).moveToElement(contentlibrary).click().build().perform();
		
		//preference selection
		WebElement preferences=driver.findElement(By.xpath("//span[normalize-space()='Preferences']"));
		preferences.click();
		
		//personal document selection using the action class
		WebElement personaldoc=driver.findElement(By.xpath("//div[contains(text(),'Personal Document Settings')]"));
		act.moveToElement(personaldoc);
		act.perform();
		
		personaldoc.click();
		
		// condition whether the archive is displayed or not
		WebElement archive_status=driver.findElement(By.xpath("//div[@class='myx-spacing-large ng-scope myx-row']//strong[@class='myx-color-state inline_myx ng-binding']"));
		String arstatus=archive_status.getText();
		//System.out.println(arstatus);
		
		switch(enable_disable)
		{
		case 1:
		
		if(arstatus.equalsIgnoreCase("Disabled")) //Enabled  //Disabled
		{
			
			System.out.println("'personal document archiving' is disabled..................");
			System.out.println("'personal document archiving' Test is Enabling Now..........");
			driver.findElement(By.xpath("//span[contains(text(),'Edit Archive Settings')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@type='checkbox']")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Update')]")).click();
			System.out.println("'Enable personal document archiving' to my Kindle library is Enabled successfully");
					
		}
		else
		{
			System.out.println("'personal document archiving' is Enabled in to the account Already");
		}
		break;
		
		case 2:
			
			if(arstatus.equalsIgnoreCase("Enabled")) //Enabled  //Disabled
			{
				
				System.out.println("'personal document archiving' is Enabled..................");
				System.out.println("'personal document archiving' Test is Disabling Now........");
				driver.findElement(By.xpath("//span[contains(text(),'Edit Archive Settings')]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				driver.findElement(By.xpath("//span[contains(text(),'Update')]")).click();
				System.out.println("'Enable personal document archiving' to my Kindle library is Disabled successfully");
						
			}
			else
			{
				System.out.println("'personal document archiving' is Disabled in to the account Already");
			}
			
			break;
		}
		
     	System.out.println("Approved Personal Document E-mail List Test is started........");
		//adding a new approved email address
     	
     	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Add a new approved e-mail address']")).click();
		
		driver.findElement(By.xpath("//input[@id='pdocEmailInput_myx']")).sendKeys(email_address);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Add Address')]")).click();
		
		System.out.println("New approved e-mail address is added successfully ");
		
		System.out.println("Approved Personal Document E-mail List Test is completed........");
		
		
		//Reading the table data using the for loop 
		// //table[@class='myx-bordered']//tr//th
		List<WebElement> total_rows=driver.findElements(By.xpath("//table[@class='myx-bordered']//tr"));
		List<WebElement> total_column=driver.findElements(By.xpath("//table[@class='myx-bordered']//tr//th"));
		
		System.out.println(" Name "+"\t"+"\t"+"\t"+" E-mail address ");
		
		// creating a excel instance
		FileOutputStream file=new FileOutputStream("C:\\Users\\ajuneeth\\Desktop\\Excell\\pdocExcell.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("PDOC");
		
		for(int r=2;r<=total_rows.size();r++)
		{
			XSSFRow current_row=sheet.createRow(r-1);
			for(int c=1;c<total_column.size();c++)
			{
				//  //table[@class='myx-bordered']//tr[2]//td[2]
				String data=driver.findElement(By.xpath("//table[@class='myx-bordered']//tr["+r+"]//td["+c+"]")).getText();
				
				XSSFCell cell=current_row.createCell(c-1);
				cell.setCellValue(data);
				System.out.print(data+"\t");
			}
			System.out.println();
		}
		XSSFRow header_row=sheet.createRow(0);
		header_row.createCell(0).setCellValue("Device Name");		
		header_row.createCell(1).setCellValue("E-mail address");
		
		workbook.write(file);
		workbook.close();
		file.close();
		
	}
	}

