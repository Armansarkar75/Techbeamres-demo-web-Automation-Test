import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techbeamres {

	public static void main(String[] args) {
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\drivers\\chromedriver_win32 "
					+ "(1)\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.techbeamers.com/");
			driver.findElement(By.xpath("/html/body/div[1]/nav[1]/div/ul/li[1]/a/span")).click();
			driver.findElement(By.name("s")).sendKeys("coders");
			driver.findElement(By.xpath("/html/body/div[1]/nav[1]/div/ul/li[2]/a/span")).click();
			driver.findElement(By.name("s")).sendKeys("w3school");
			driver.findElement(By.name("esfpx_email")).sendKeys("armansarkar715@gmail.com");
			driver.findElement(By.xpath("/html/body/div[1]/nav[1]/div/ul/li[3]/a/span")).click();
			driver.findElement(By.name("s")).sendKeys("youtube");
			driver.findElement(By.name("esfpx_email")).sendKeys("armansarkar715@gmail.com");
			driver.findElement(By.xpath("/html/body/div[1]/nav[1]/div/ul/li[4]/a/span")).click();
			driver.findElement(By.name("s")).sendKeys("google");
			driver.findElement(By.name("esfpx_email")).sendKeys("armansarkar715@gmail.com");
			driver.findElement(By.xpath("/html/body/div[1]/nav[1]/div/ul/li[5]/a/span")).click();
			driver.findElement(By.name("s")).sendKeys("hackerrank");
			driver.findElement(By.name("esfpx_email")).sendKeys("armansarkar715@gmail.com");
			driver.findElement(By.xpath("/html/body/div[1]/nav[1]/div/ul/li[6]/a/span")).click();
			driver.findElement(By.name("s")).sendKeys("codeforce");
			driver.findElement(By.name("esfpx_email")).sendKeys("armansarkar715@gmail.com");
			driver.findElement(By.xpath("/html/body/div[1]/nav[1]/div/ul/li[7]/a/span")).click();
			driver.findElement(By.name("s")).sendKeys("stackoverflow");
			driver.findElement(By.name("esfpx_email")).sendKeys("armansarkar715@gmail.com");
			driver.findElement(By.xpath("/html/body/div[1]/nav[1]/div/ul/li[8]/a/span")).click();
			driver.findElement(By.name("s")).sendKeys("chatgpt");
			driver.findElement(By.name("esfpx_email")).sendKeys("armansarkar715@gmail.com");
			driver.findElement(By.xpath("/html/body/div[1]/nav[1]/div/ul/li[9]/a/span")).click();
			driver.findElement(By.name("s")).sendKeys("techland");
			driver.findElement(By.name("esfpx_email")).sendKeys("armansarkar715@gmail.com");
			
	}

}
