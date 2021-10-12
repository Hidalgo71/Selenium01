import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class chechboxTesting
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.edge.driver", "D:\\Docs\\Drivers\\msedgedriver.exe");
        WebDriver ieDriver = new EdgeDriver();
        ieDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");



    }
}
