import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

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


    }
}
