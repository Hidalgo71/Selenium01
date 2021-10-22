import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandles
{
    public static void main(String[] args)
    {
        //This example login test. But getting id and pass another window
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://rahulshettyacademy.com/loginpagePractise/");                                      //Parent browser


        chDriver.findElement(By.cssSelector("a[class='blinkingText']")).click();                                //Click method open new window. Child browser
        Set<String> windows = chDriver.getWindowHandles();                            //[parentId, childId]     //Get to the window handle IDs of all tabs by opened by automation
        Iterator<String> iterWin = windows.iterator();                                                          //'iterWin' can extract the values in set collection
        String parentId = iterWin.next();                                                                       //Get the next index of set bu default. Zeroth index is 'parentId'
        String childId = iterWin.next();                                                                        //first index
        chDriver.switchTo().window(childId);                                                                    //Switching to opened tab
        System.out.println(chDriver.findElement(By.cssSelector("p[class='im-para red']")).getText());

    }
}
