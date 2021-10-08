import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownExp
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        /*
        WebElement staticDDList = chDriver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));            //We created a variable is storing dropdownlist in Select
        Select ddlist = new Select(staticDDList);                                                           //Select is a class. We'r using this class for dropdown list or etc...
        ddlist.selectByIndex(2);                                                                                    //Selecting 3rd value in the list
        System.out.println(ddlist.getFirstSelectedOption().getText());                                              //3rd element is AED. To confirm that we printed 3rd element by using getText()
        ddlist.selectByVisibleText("USD");                                                                          //Selecting value with visible text
        System.out.println(ddlist.getFirstSelectedOption().getText());
        ddlist.selectByValue("AED");                                                                                //Selecting value with value. <option value="">Select</option>
        System.out.println(ddlist.getFirstSelectedOption().getText());
        */

        chDriver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();                                          //Clicking Passenger ddlist, and opening list.
        Thread.sleep(1000L);                                                                //This code allows the program wait. Because opening dropdown list is need time! With this code we are waiting list opening and executing continue.

        for(int i = 1; i < 3; i++)
        {
            chDriver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();                                          //In the menu clicking "+" button to add adults.
            System.out.println(i + " kere basıldı");
        }
        chDriver.findElement(By.xpath("//*[@id='btnclosepaxoption']")).click();
    }
}