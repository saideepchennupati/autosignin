package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosignin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver gm = new ChromeDriver();
		gm.get("https://mail.google.com");
        gm.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("youremail@gmail.com");
        gm.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	    gm.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    gm.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("###password###");
	    gm.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
	}

}
