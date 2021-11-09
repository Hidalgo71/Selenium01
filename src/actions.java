import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class actions
{
    public static void main(String[] args)
    {

        System.setProperty("webdriver.gecko.driver", "D:\\Docs\\Drivers\\geckodriver.exe");
        File pathBinary = new File("D:\\Program Files\\Mozilla Firefox\\firefox.exe");

        FirefoxBinary ffBinary = new FirefoxBinary(pathBinary);
        DesiredCapabilities desired = DesiredCapabilities.firefox();
        FirefoxOptions ffOptions = new FirefoxOptions();
        desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, ffOptions.setBinary(ffBinary));

        WebDriver ffDriver = new FirefoxDriver(ffOptions);                                                                  //Browser Driver Object
        Actions amzAct = new Actions(ffDriver);                                                                             //Actions Object
        ffDriver.manage().window().maximize();                                                                              //To maximize browser
        ffDriver.get("https://www.amazon.com/");
        WebElement cursorMove = ffDriver.findElement(By.cssSelector("a[id='nav-link-accountList']"));

        //Composite Actions
        amzAct.moveToElement(ffDriver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("asus").doubleClick().build().perform();        //Actions object finds "search textbox" than click than press "shift" and type "text" and select text

        //Move to Specific element
        amzAct.moveToElement(cursorMove).contextClick().build().perform();           //'.build().perform()' is need to execute the line. !!!!"contextClick()" is for Right click



    }
}
