import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;

public class firefoxDriver
{
    public static void main(String[] args)
    {

        // Add .exe file
        System.setProperty("webdriver.gecko.driver", "D:\\Docs\\Drivers\\geckodriver.exe");
        File pathBinary = new File("D:\\Program Files\\Mozilla Firefox\\firefox.exe");

    /* If Firefox located different than default, we need to add this codes. */
        FirefoxBinary ffBinary = new FirefoxBinary(pathBinary);
        DesiredCapabilities desired = DesiredCapabilities.firefox();
        FirefoxOptions ffOptions = new FirefoxOptions();
        desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, ffOptions.setBinary(ffBinary));

        // Create Firefox object driver.
        WebDriver ffDriver = new FirefoxDriver(ffOptions);

       /*
       ffDriver.get("https://login.salesforce.com");
        ffDriver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Hidalgo");
        ffDriver.findElement(By.cssSelector("#password")).sendKeys("123");
        ffDriver.findElement(By.xpath("//*[@id=\"Login\"]")).click();

        System.out.println(ffDriver.findElement(By.cssSelector("#error")).getText());
        */
        ffDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        ffDriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

    }
}
