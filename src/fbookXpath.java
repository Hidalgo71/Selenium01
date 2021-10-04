import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbookXpath
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver fbDriver = new ChromeDriver();
        fbDriver.get("https://facebook.com");


    }
}
