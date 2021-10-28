import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class practices
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://rahulshettyacademy.com/AutomationPractice/");     //1 - 6 - 7
        //chDriver.get("https://www.cleartrip.com/");                           //2
        //chDriver.get("https://www.itgeared.com/demo/1506-ajax-loading.html"); //3
        //chDriver.get("https://the-internet.herokuapp.com/");                  //4 - 5

        chDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebDriverWait expWait = new WebDriverWait(chDriver, 5);

        /* //1
        chDriver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).click();                                 //Click
        Assert.assertTrue(chDriver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).isSelected());         //Clicked Case
        chDriver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).click();                                 //Unclick
        Assert.assertFalse(chDriver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]")).isSelected());        //Unclicked case
        System.out.println(chDriver.findElements(By.cssSelector("input[type='checkbox']")).size());
        //*/

        /* //2
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

        /* //3
        chDriver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
        expWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
        System.out.println(chDriver.findElement(By.id("results")).getText());
         //*/

        /* //4
        chDriver.findElement(By.xpath("/html/body/div[2]/div/ul/li[33]/a")).click();
        chDriver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
        Set<String> windows = chDriver.getWindowHandles();
        Iterator<String> iterWin = windows.iterator();
        String parentId = iterWin.next();
        String childId = iterWin.next();
        chDriver.switchTo().window(childId);
        System.out.println(chDriver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
        chDriver.switchTo().window(parentId);
        System.out.println(chDriver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
        //*/

        /*    //5
        chDriver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
        Actions dragAD = new Actions(chDriver);
        System.out.println(chDriver.findElements(By.tagName("frameset")).size());
        chDriver.switchTo().frame(chDriver.findElement(By.name("frame-top")));
        chDriver.switchTo().frame(chDriver.findElement(By.name("frame-middle")));
        System.out.println(chDriver.findElement(By.id("content")).getText());
        //*/

        /*    //6
        chDriver.findElement(By.id("checkBoxOption3")).click();
        String cbName = chDriver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[3]")).getText();
        WebElement sttDDL = chDriver.findElement(By.id("dropdown-class-example"));
        Select ddList = new Select(sttDDL);
        ddList.selectByVisibleText(cbName);
        chDriver.findElement(By.xpath("//input[@id='name']")).sendKeys(cbName);
        chDriver.findElement(By.id("alertbtn")).click();
        String javaPopup = chDriver.switchTo().alert().getText();
        if (javaPopup.contains(cbName))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
        }
        //*/

        /*    //7
        chDriver.findElement(By.id("autocomplete")).sendKeys("tur");
        List<WebElement> options = chDriver.findElements(By.cssSelector(".ui-menu-item"));
        for (WebElement option : options)
        {
            if (option.getText().equalsIgnoreCase("Turkey"))
            {
                option.click();
                break;
            }
        }
        System.out.println(chDriver.findElement(By.id("autocomplate")).getAttribute("value"));
        //*/

        ///* //8

        //*/
    }
}