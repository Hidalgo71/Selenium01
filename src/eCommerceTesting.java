import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class eCommerceTesting
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        String[] marketItems = new String[] {"Cucumber", "Brocolli"};                                                                               //If we want to add multiple items using array.
        //Case is Adding item to cart. But every addBTN are same. So we need to find item name to add to cart.
        List<WebElement> products = (List<WebElement>) chDriver.findElement(By.cssSelector("h4.product-name"));                                     //Creating Web List to reach all item name's
        for (int i = 0; i < products.size(); i++)                                                                                                   //Loop until find the item we want.
        {
            String itemName = products.get(i).getText();                                                                                            //Getting item name's and set to string variable
            List marketItemsList = Arrays.asList(marketItems);                                                                                      //To using array we need to change array to arraylist
            if (marketItemsList.contains(itemName))                                                                                                 //When we find the item
            {
                chDriver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();                                                   //click function inside the loop so don't need to fitn item's-add click button.
            }
        }


    }
}
