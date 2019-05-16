package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Test {


    public class ExerciseOne {
        public String browser;
        public WebDriver driver;


        public void main(String[] args) throws InterruptedException, IOException {
            //Invoke browser
            System.setProperty("WebDriver.chrome.driver", "/usr/local/chromedriver");
            WebDriver driver = new ChromeDriver();
            //Open bookmyshow

            driver.get ( "https://in.bookmyshow.com/pune/movies/avengers-endgame-3d-4dx/ET00100674" );  // get url
            Thread.sleep ( 5000 );
           String Love = (driver.findElement ( By.xpath ( "/html/body/div[5]/div[3]/div[1]/div[2]/div[2]/div[1]/span[2]" ) )).getText ();   //for getting loves
            System.out.println ( "% Love" +Love);
            Thread.sleep ( 5000 );
            String Votes = (driver.findElement ( By.xpath ( "/html/body/div[5]/div[3]/div[1]/div[2]/div[2]/div[1]/div" ) )).getText ();
            System.out.println ( "Number of Votes"  +Votes);
        }

    }
}