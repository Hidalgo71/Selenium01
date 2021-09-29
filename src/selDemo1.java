import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selDemo1
{
    public static void main(String[] args)
    {
        // Selenium Codes ?

        // Add .exe file
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");

        // Create Chrome object driver.
        WebDriver chDriver = new ChromeDriver();

        chDriver.get("https://google.com");
        System.out.println(chDriver.getTitle());



    }
}
