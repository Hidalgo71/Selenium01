import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class filtering
{
    public static void main(String[] args)
    {
        DesiredCapabilities chDCap = DesiredCapabilities.chrome();
        chDCap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        chDCap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        chDriver.findElement(By.id("search-field")).sendKeys("Rice");                                           //Typing filter textbox
        List<WebElement> vegNames = chDriver.findElements(By.xpath("//tr/td[1]"));                                           //Taking vegg names in 1st column as a list,
        List<WebElement> filList = vegNames.stream().filter(v -> v.getText().contains("Rice")).collect(Collectors.toList()); //using filter select name 'rice' and store in a list
        Assert.assertEquals(vegNames.size(), filList.size());
    }
}
