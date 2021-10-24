import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameTesting
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        Actions actDrg = new Actions(chDriver);                                                                                 //Frames are actions class member.
        chDriver.get("https://jqueryui.com/droppable/");
        System.out.println(chDriver.findElements(By.tagName("iframe")).size());                                                 //Identifying how mant frames in the page
        chDriver.switchTo().frame(0);                                                                                        //Switching frame using by Index.
        //chDriver.switchTo().frame(chDriver.findElement(By.cssSelector("iframe.demo-frame")));                                   //We need to switch frames(), selenium can't find frames if we don't do that.
        //Drag & Drop
        WebElement sourceElm = chDriver.findElement(By.cssSelector("div[id='draggable']"));                                     //Identify drag element and assign to WebElement variable
        WebElement targetElm = chDriver.findElement(By.cssSelector("div[id='droppable']"));                                     //Identify drag element and assign to WebElement variable
        actDrg.dragAndDrop(sourceElm, targetElm).build().perform();
        chDriver.switchTo().defaultContent();                                                                                   //To quit frame.



    }
}
