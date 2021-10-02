import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class ieDriver
{
    public static void main(String[] args)
    {
        // Add .exe file
        System.setProperty("webdriver.ie.driver", "D:\\Docs\\Drivers\\msedgedriver.exe");

        // Create Chrome object driver.
        WebDriver ieDriver = new EdgeDriver();

        ieDriver.get("https://google.com");
        System.out.println(ieDriver.getTitle());

    }
}
