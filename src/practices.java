import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class practices
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        //chDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        chDriver.get("https://www.cleartrip.com/");

        /*
        chDriver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).click();                                 //Click
        Assert.assertTrue(chDriver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).isSelected());         //Clicked Case
        chDriver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).click();                                 //Unclick
        Assert.assertFalse(chDriver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).isSelected());        //Unclicked case
        System.out.println(chDriver.findElements(By.cssSelector("input[type='checkbox']")).size());
        //*/

        /*
        WebElement staticDDListAdult = chDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div[4]/div/div[1]/select"));         //Adults
        Select ddlistAdult = new Select(staticDDListAdult);
        ddlistAdult.selectByIndex(3);
        WebElement staticDDListChild = chDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div[4]/div/div[3]/select"));         //Children
        Select ddlistChild = new Select(staticDDListChild);
        ddlistChild.selectByValue("2");

        chDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/button")).click();                    //Date
        chDriver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div[3]/div/div/div/div/div/ul/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[5]/div/div")).click();

        chDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div[5]/div/div/a/strong")).click();                                 //More Options
        chDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div[6]/div/div[3]/div/div/div[1]/input")).sendKeys("TUR");

        chDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div[8]/div[2]/button")).click();                                    //Search
        System.out.println(chDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/div/div/span")).getText());
        //*/


    }
}