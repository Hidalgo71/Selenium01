import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;

public class httpsCertCookiesScreenshot
{
    public static void main(String[] args) throws IOException
    {
        DesiredCapabilities chDCap = DesiredCapabilities.chrome();                      //General Chrome profile
        chDCap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);         //Object knows whatever insecure cert. comes it accept it.
        chDCap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);              //Object knows whatever SSL cert. comes it accept it.

        ChromeOptions chOp = new ChromeOptions();                                       //Local Chrome profile
        chOp.merge(chDCap);
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver(chOp);
        chDriver.get("https://google.com");
        chDriver.manage().deleteAllCookies();

        File src = ((TakesScreenshot)chDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\Hidalgo\\Pictures\\Screenshots\\testSS1.jpeg"));
    }
}
