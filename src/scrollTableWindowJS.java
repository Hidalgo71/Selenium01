import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class scrollTableWindowJS
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        int sum = 0, total;
        int rowSize;

        JavascriptExecutor selJS = (JavascriptExecutor) chDriver;                                                         //Typecasting
        selJS.executeScript("window.scroll(0,500)");                                                                   ////Scroll down to page
        Thread.sleep(1000);
        selJS.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");

        List<WebElement> tblValues = chDriver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));                //Select 4th column of selected table
        for (WebElement tblValue : tblValues)
        {
            sum = sum + Integer.parseInt(tblValue.getText());
        }
        System.out.println(sum);
        total = Integer.parseInt(chDriver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
        Assert.assertEquals(sum, total);

        //2nd Table
        WebElement tblOne = chDriver.findElement(By.id("product"));                                                                     //Restricting WebElement ony table
        System.out.println("Number of Rows: " + tblOne.findElements(By.tagName("tr")).size());                                          //Printing number of rows
        System.out.println("Number of Titles: " + tblOne.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());  //Printing number of title(th) but restiricted only 0th index of tr
        rowSize = tblOne.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size();
        List<WebElement> secondRow = tblOne.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
        for (int j = 0; j < rowSize; j++)
        {
            System.out.println(secondRow.get(j).getText());
        }
    }
}
