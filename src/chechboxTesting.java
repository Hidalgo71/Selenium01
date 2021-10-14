import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class chechboxTesting
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.edge.driver", "D:\\Docs\\Drivers\\msedgedriver.exe");
        WebDriver ieDriver = new EdgeDriver();
        ieDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        /*//Selecting Checkbox*/
        Assert.assertFalse(ieDriver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        ieDriver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();                                          //Selecting checkbox using css
        Assert.assertTrue(ieDriver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
       // System.out.println(ieDriver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());                 //Checking checkbox is selected
        //COUNT THE NUMBEROF CHECKBOXES
        System.out.println(ieDriver.findElements(By.cssSelector("input[type='checkbox']")).size());

    }
}
