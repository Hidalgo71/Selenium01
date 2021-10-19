import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.List;

public class eCommerceTesting
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        int j = 0;

        String[] marketItems = new String[] {"Cucumber", "Brocolli", "Beetroot", "Carrot"};                                                                               //If we want to add multiple items using array.
        Thread.sleep(3000);
        //Case is Adding item to cart. But every addBTN are same. So we need to find item name to add to cart.
        List<WebElement> products = chDriver.findElements(By.cssSelector("h4.product-name"));                                                       //Creating Web List to reach all item name's
        for (int i = 0; i < products.size(); i++)                                                                                                   //Loop until find the item we want.
        {
            String[] itemName = products.get(i).getText().split("-");            //World= "Cucumber -1 Kg" to ====> "Cucumber "               //Getting item name's BUT! the string is need to fit for array format. So we need to get rid of the rest. "Split()" function used for this. When text came to "-" deleting the rest included -
            String trueFormName = itemName[0].trim();                                 //World= "Cucumber" only.                                     //We have "Cucumber " "Brocolli " So we need to get rid of space to. "trim()" function deleting spaces.
            List<String> marketItemsList = Arrays.asList(marketItems);                                                                              //To using array we need to change array to arraylist
            if (marketItemsList.contains(trueFormName))                                                                                             //When we find the item
            {
                j++;
                chDriver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();                                            //click function inside the loop so don't need to fitn item's-add click button.
                if (j == marketItems.length)
                {
                    break;                                                                                                                          //We have a 3 element in the array but for loop iterates 30 times because of add button. To quit loop we add variable and count as array size.
                }
            }
        }
    }
}
