package webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webapptest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/ubuntu/chromedriver");
				// "C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--headless");

		chromeOptions.addArguments("--no-sandbox");

		WebDriver driver = new ChromeDriver(chromeOptions);

		chromeOptions.addArguments("--headless");

		driver.get("http://35.236.226.153:8001/index.php");
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='About Us']")).click();
		String exp = driver.findElement(By.cssSelector("p")).getText();
		// String exp = driver.findElement(By.cssSelector("p")).getText();

		// "//*[@id='mp-tfa']/p"

		// String body = driver.findElement(By.tagName("body")).getText();
		String title1 = driver.findElement(By.xpath("//*[@id=\"PID-ab2-pg\"]")).getText();
		// String title2 = driver.findElement(By.xpath("/html/body/p[2]")).getText();
		String Expected = "This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

		System.out.println(exp);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println(title1);
		if (Expected.equalsIgnoreCase(title1)) {
			System.out.println("Success");

		} else {
			System.out.println("Failed");
		}
		driver.close();

	}

}
