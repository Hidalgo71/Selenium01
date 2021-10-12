import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdownExp
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        /* STATIC DROPDOWN LIST.
        WebElement staticDDList = chDriver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));            //We created a variable is storing dropdownlist in Select
        Select ddlist = new Select(staticDDList);                                                                   //Select is a class. We'r using this class for dropdown list or etc...
        ddlist.selectByIndex(2);                                                                                    //Selecting 3rd value in the list
        System.out.println(ddlist.getFirstSelectedOption().getText());                                              //3rd element is AED. To confirm that we printed 3rd element by using getText()
        ddlist.selectByVisibleText("USD");                                                                          //Selecting value with visible text
        System.out.println(ddlist.getFirstSelectedOption().getText());
        ddlist.selectByValue("AED");                                                                                //Selecting value with value. <option value="">Select</option>
        System.out.println(ddlist.getFirstSelectedOption().getText());
        */
//=================================================
        /* INTERACTIVE DROPDOWN LOST
        chDriver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();                                          //Clicking Passenger ddlist, and opening list.
        Thread.sleep(1000L);                                                                                      //This code allows the program pause. Because opening dropdown list is need time! With this code we are waiting list opening and executing continue.

        for(int i = 1; i < 3; i++)
        {
            chDriver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();                                          //In the menu clicking "+" button to add adults.
            System.out.println(i + " kere basıldı");
        }
        chDriver.findElement(By.xpath("//*[@id='btnclosepaxoption']")).click();
        */
//=================================================
        /* DYNAMIC DROPDOWN LIST
        *DDL is empty list at the beginning because need to select something before list is becoming full. For exm city - state. 1st need to select city and then ddl full with this city's states.

        ////div[@id='id'] //a[@value='val'] CODE SNIPPED
        //chDriver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();                                              //This id for windowed size, if its half size ddlist changing to static dd list.
        chDriver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        chDriver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[3]/li[8]/a")).click();                                    //1st select is done
        Thread.sleep(1000);
        chDriver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='JLR']")).click(); //Parent-child relationship example.
        */
//=================================================
        /*//AUTO SUGGESTIVE DROPDOWN LIST
        //*User type something in the list and dropdown list open and suggest related elements in the list
        chDriver.findElement(By.xpath("//*[@id=\"autosuggest\"]")).sendKeys("ar");
        Thread.sleep(1000);

        List<WebElement> options = chDriver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for (WebElement option : options)
        {
            if(option.getText().equalsIgnoreCase("San Marino"))
            {
                option.click();
                break;
            }
        }
        //*/




    }
}