package hellocucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPage {
    WebDriver driver;
    public void ByVisibleElement() {
            driver = new ChromeDriver();
            JavascriptExecutor js = (JavascriptExecutor) driver;

            //Launch the application
            driver.get("https://www.pearson.com/");

            //Find element by link text and store in variable "Element"
            WebElement Element = driver.findElement(By.className("content-tile-container"));

            //This will scroll the page till the element is found
            js.executeScript("arguments[0].scrollIntoView();", Element);
            System.out.println("e aici");

    }
}
