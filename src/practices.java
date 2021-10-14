import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class practices
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://rahulshettyacademy.com/AutomationPractice/");

        chDriver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).click();                                 //Click
        Assert.assertTrue(chDriver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).isSelected());         //Clicked Case
        chDriver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).click();                                 //Unclick
        Assert.assertFalse(chDriver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).isSelected());        //Unclicked case
        System.out.println(chDriver.findElements(By.cssSelector("input[type='checkbox']")).size());
    }
}
