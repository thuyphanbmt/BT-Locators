package Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo_Xpath_TuongDoi {
    public static void main(String[] args)  {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        driver.get("https://crm.anhtester.com/admin/authentication");
//        driver.findElement(By.id("email")).sendKeys("admin@example.com");
//        driver.findElement(By.name("password")).sendKeys("123456");
//        driver.findElement(By.id("remember")).click();


       driver.get("https://crm.anhtester.com/admin/authentication");

       driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@example.com");

       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");

       driver.findElement(By.xpath("//label[normalize-space()='Remember me']")).click();

       driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();



       driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();


       driver.findElement(By.xpath("(//a[@href='https://crm.anhtester.com/admin/clients/client'])[2]")).click();

       driver.findElement(By.xpath("/html/body/aside/ul/li[3]/a/span")).click();
       //Thread.sleep(1000);
       driver.findElement(By.xpath("//a[normalize-space()='New Customer']")).click();
       //Thread.sleep(2000);

       driver.findElement(By.xpath("//span[normalize-space()='Projects']")).click();
       //Thread.sleep(2000);

       driver.findElement(By.xpath("//a[normalize-space()='New Project']")).click();
       //Thread.sleep(2000);

       driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Project_Thuy");
       //Thread.sleep(2000);

       driver.findElement(By.xpath("//div[normalize-space()='Select and begin typing'][1]")).click();
       //Thread.sleep(2000);

       driver.quit();

    }
}
