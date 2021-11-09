import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateLinkTxt
{
    public static void main(String[] args)
    {
        // Add .exe file
        System.setProperty("webdriver.chrome.driver", "D:\\Docs\\Drivers\\chromedriver.exe");

        // Create Chrome object driver.
        WebDriver chDriver = new ChromeDriver();

       /* chDriver.get("https://google.com");                           //Get: It can be redirect another URL, and we don't want this.
        System.out.println(chDriver.getTitle());                        //Validating correct title
        System.out.println(chDriver.getCurrentUrl());                   //Validating correct URL
       // System.out.println(chDriver.getPageSource());                 //Taking page source codes */

       // chDriver.get("https://twitter.com");                          //Open Twitter but same tab with google. 1st Google open and after that Twitter opening same tab.
       // chDriver.navigate().back();                                   //Back button. After the twitter is opened, returning google page.
       // chDriver.navigate().forward();                                //Forward button.
       // chDriver.close();                                             //It Closing current browser.
       // chDriver.quit() ;                                             //It Closing all browsers opened by Selenium.

       chDriver.get("https://facebook.com");
       // chDriver.findElement(By.id("email"));                         //Goal is taking mail textbox by using id method. But we need to send characters in this textbox.
       // chDriver.findElement(By.id("email")).sendKeys("Hello World");  //.sendKeys method is used for sending input to email textbox.
       // chDriver.findElement(By.id("pass")).sendKeys("nesyek71");      //Password textbox
       // chDriver.findElement(By.linkText("Şifreni mi Unuttun?")).click();           //If element don't have an id, name or anything else, we use linkText. Which mean it's a link but link's explanation text.
                                                                                    //.click() method for clicking.
        ////*[@id="u_0_d_ho"] => This Xpath taken from facebook login button but this code changing every new refresh event.
                                //In Java between "..""..." not allowed. Need to change ' '. => "..''..".
       // chDriver.findElement(By.xpath("//*[@id=\"u_0_d_ho\"]")).click();

        chDriver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Hello World");
        chDriver.findElement(By.cssSelector("#pass")).sendKeys("123");
       // chDriver.findElement(By.name("login")).click();

       // chDriver.findElement(By.xpath("//*[@id=\"u_0_a_3j\"]/div[3]/a")).click();         //Forgot password changing xpath
        chDriver.findElement(By.cssSelector("._6ltj > a:nth-child(1)")).click();            //This ccs taken from Firefox, stable cssSelector







    }
}
