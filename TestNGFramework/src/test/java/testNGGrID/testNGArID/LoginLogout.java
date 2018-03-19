package testNGGrID.testNGArID;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class LoginLogout {
  @Test(dataProvider = "dpCorrectData")
  public void LogintestWithCorrectCredentials(String name, String password) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
  }

  @DataProvider
  public Object[][] dpCorrectData() {
    return new Object[][] {
      new Object[] { "a", "a" },
      new Object[] { "b", "b" },
    };
  }
}
