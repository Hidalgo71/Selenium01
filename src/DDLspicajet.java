import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDLspicajet
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://beta.spicejet.com/");

        chDriver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div")).click();
        chDriver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[26]")).click();
        Thread.sleep(1000);
        chDriver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]")).click();
    }
}
