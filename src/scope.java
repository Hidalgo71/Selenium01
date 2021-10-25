import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class scope
{
    public static void main(String[] args)
    {
        //Taking footer section link.
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        chDriver.manage().window().maximize();

        System.out.println(chDriver.findElements(By.tagName("a")).size());
        //Limit WebDriver scope
        WebElement footerDriver = chDriver.findElement(By.id("gf-BIG"));                                                //Created WebElement driver for footer. It works only footer section
        System.out.println(footerDriver.findElements(By.tagName("a")).size());
        //Limit footer only 1st column
        WebElement colmFooDr = chDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(colmFooDr.findElements(By.tagName("a")).size());

        //Test case: Click every link in column and check they're opened
        for (int i =1; i < colmFooDr.findElements(By.tagName("a")).size(); i++)
        {
            String clickLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            colmFooDr.findElements(By.tagName("a")).get(i).sendKeys(clickLink);
        }
        Set<String> tabIter = chDriver.getWindowHandles();
        Iterator<String> iter = tabIter.iterator();
        while (iter.hasNext())                                                                                      //hasNext() says is there any window present.
        {
            chDriver.switchTo().window(iter.next());                                                                //Driver switching next tab. Use index.
            System.out.println(chDriver.getTitle());
        }
    }
}
