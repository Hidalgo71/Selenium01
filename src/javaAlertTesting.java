import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaAlertTesting
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String alertTxt = "Nesyek";                                                 //This test have a 1 txtbox and alert btn. Type some text and click alert btn popup types txt value.
        chDriver.findElement(By.id("name")).sendKeys(alertTxt);
        chDriver.findElement(By.id("alertbtn")).click();
        System.out.println(chDriver.switchTo().alert().getText());
        Thread.sleep(1000);
        chDriver.switchTo().alert().accept();                                       //Popup's OK button.
        chDriver.findElement(By.id("confirmbtn")).click();
        System.out.println(chDriver.switchTo().alert().getText());
        Thread.sleep(1000);
        chDriver.switchTo().alert().dismiss();                                      //Popup's CANCEL button.

    }
}
