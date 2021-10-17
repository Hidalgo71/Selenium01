import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DDLspicajet
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");
        WebDriver chDriver = new ChromeDriver();
        chDriver.get("https://beta.spicejet.com/");

        //CASE: Testing FROM-TO dropdownlist
        /*
        chDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]")).click();                                                          //Clicking From
        chDriver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[26]")).click();                //Selecting City
        Thread.sleep(1000);
        chDriver.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]")).click();                 //To
        Thread.sleep(1000);
        chDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div[3]/div[5]/div[5]/div")).click();    //Date
        //*/

        //System.out.println(chDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div/div[2]")).isEnabled());                                     //Is 2nd calender enable? Not %100 accurate

        /*
        //Checking Style Attribute
        System.out.println(chDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div/div[2]/div[1]")).getAttribute("style"));                   //Checking "style att" before clicking "2nd calender"
        chDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div")).click();                                      //Click 2nd calender
        System.out.println(chDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div/div[2]/div[1]")).getAttribute("style"));                   //Checking "style att" after clicking "2nd calender"
         //*/

        chDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[2]/div/div[2]")).click();
        if (chDriver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div/div[2]/div[1]")).getAttribute("style").contains("1"))
        {
            System.out.println("Enable");
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }
    }
}
