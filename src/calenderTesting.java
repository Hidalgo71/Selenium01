import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class calenderTesting
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://www.path2usa.com/travel-companions");

        chDriver.findElement(By.xpath("//input[@id='travel_date']")).click();                                           //Open calender. Wooow

        while (!chDriver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("November"))      //Click "next" until found desired month. In this case it's "April"
        {
            chDriver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        }
        List<WebElement> datesL = chDriver.findElements(By.className("day"));                                           //Getting all days as a list. It provides all dates to compare desired date leter. No hard-coding
        int countDays = chDriver.findElements(By.className("day")).size();
        for (int i = 0; i < countDays; i++)
        {
            String dateTxt = chDriver.findElements(By.className("day")).get(i).getText();                               //Getting date number as a text
            if (dateTxt.equalsIgnoreCase("29"))                                                              //Test Date
            {
                chDriver.findElements(By.className("day")).get(i).click();
            }
        }
    }
}