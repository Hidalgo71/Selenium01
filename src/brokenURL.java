import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class brokenURL
{
    public static void main(String[] args) throws IOException
    {
        DesiredCapabilities chDCap = DesiredCapabilities.chrome();
        chDCap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        chDCap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://rahulshettyacademy.com/AutomationPractice/");

        /*  //1 Link example
        String url = chDriver.findElement(By.cssSelector("a[href*=\"soapui\"]")).getAttribute("href");                   //Taking url using href.
        //new URL(url).openConnection();                                                                                 //Open connection and send URL and get the respond
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();                                      //'openConnection()' is in the 'URL class' creating object 'new URL(url)' and calling method
                                                                                                                         //Return type is 'HttpURLConnection' casting '(HttpURLConnection)'
        conn.setRequestMethod("HEAD");
        conn.connect();
        int resCode = conn.getResponseCode();                                                                            //Taking responce code to compare url working or broken
        System.out.println(resCode);
        */

        //Multiple Links
        List<WebElement> links = chDriver.findElements(By.cssSelector("li[class=\"gf-li\"] a"));
        SoftAssert a = new SoftAssert();
        for (WebElement link : links)
        {
            String url = link.getAttribute("href");
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int resCode = conn.getResponseCode();
            System.out.println(resCode);
            a.assertTrue(resCode <= 399 , link.getText() + " is broken. " + resCode);
            /*if (resCode >= 400)
            {       //No need to use IF, Use soft Assert
                System.out.println(link.getText() + " is broken. " + resCode);
                Assert.assertTrue(false);
            }*/
        }
        a.assertAll();
    }
}
