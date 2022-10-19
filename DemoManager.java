package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoManager {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("abilash");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Testleaf");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("abi");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
        driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("MC");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Educational institute");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abiabilash627@gmail.com");
         driver.findElement(By.className("smallSubmit")).click();
         driver.findElement(By.className("subMenuButton")).click();
         driver.findElement(By.id("createLeadForm_description")).clear();
         driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("basfavfhacgvaskvhcv");
         driver.findElement(By.linkText("Upload Leads")).click();
        String title = driver.getTitle();
        System.out.println(title);
	}
 
}
