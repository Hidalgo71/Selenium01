import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class webTableSorting
{
    public static void main(String[] args)
    {
        DesiredCapabilities chDCap = DesiredCapabilities.chrome();
        chDCap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        chDCap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        List<String> vegPrice;

        //Test case: Click the header and make list order and compare order is true with using Selenium
        chDriver.findElement(By.xpath("//tr/th[1]")).click();                                                               //Clicking header
        List<WebElement> orgEleList = chDriver.findElements(By.xpath("//tr/td[1]"));                                        //List of items
        List<String> orgSortedList = orgEleList.stream().map(WebElement::getText).collect(Collectors.toList());             //Taking items text and store into compare list
        List<String> sortedList = orgSortedList.stream().sorted().collect(Collectors.toList());                             //Creating a list but items are sorted
        Assert.assertEquals(sortedList, orgSortedList);

        //Test case2: Scan the names find wanted and take the wanted's price
        do
        {
            List<WebElement> rows = chDriver.findElements(By.xpath("//tr/td[1]"));                                          //Evety 'NEXT' button click geting items again
            vegPrice = rows.stream().filter(s -> s.getText().contains("Rice")).map(webTableSorting::getVegPrice).collect(Collectors.toList());
            vegPrice.forEach(System.out::println);                                                                          //Print price
            if (vegPrice.size() < 1)
            {
                chDriver.findElement(By.cssSelector("[aria-label='Next']")).click();                                        //Click next button until find what we searching for
            }
        }
        while (vegPrice.size() < 1);
    }

    private static String getVegPrice(WebElement s)
    {
        return s.findElement(By.xpath("following-sibling::td[1]")).getText();            //tr[4]/td[2]                      //Gettind 2nd column of table and sending
    }
}