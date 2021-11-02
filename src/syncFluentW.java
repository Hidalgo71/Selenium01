import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class syncFluentW
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        chDriver.findElement(By.cssSelector("[id='start'] button")).click();

        Wait<WebDriver> fluW = new FluentWait<WebDriver>(chDriver).withTimeout(Duration.ofSeconds(10))                      //Wait 10 sec to element appear
                                            .pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);    //Check every 3 sec for element is appeard.
        WebElement foo = fluW.until(new Function<WebDriver, WebElement>()
        {
            @Override
            public WebElement apply(WebDriver webDriver)                                                                    //Method expecting web element
            {
                if (chDriver.findElement(By.cssSelector("[id = 'finish'] h4")).isDisplayed())
                {
                    return chDriver.findElement(By.cssSelector("[id = 'finish'] h4"));                                      //Wait until this element appear
                }
                else
                    return null;
            }
        });
        System.out.println(chDriver.findElement(By.cssSelector("[id = 'finish'] h4")).getText());
    }
}
