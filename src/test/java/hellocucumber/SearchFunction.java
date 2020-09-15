package hellocucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class SearchFunction {
    ChromeDriver driver= new ChromeDriver();

    @Given("main page is loaded")
    public void mainPage(){
        driver.manage().window().maximize();
        driver.get("http://pearson.com/");
    }

    @When("I look for search element on page")
    public void searchElement() {
        WebElement element=driver.findElement(By.id("search-box-input"));
        element.isDisplayed();
    }

    @Then("I can use search feature on page")
    public void findElement() throws InterruptedException {
        WebElement insertText=driver.findElement(By.className("search-box-input"));
        insertText.sendKeys("pearson");
        WebElement searchButton=driver.findElement(By.className("search-box-icon"));
        searchButton.click();

        List<WebElement>countResults = driver.findElements(By.className("test"));

        Assert.assertEquals(10,countResults.size());

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement nextButton = driver.findElement(By.linkText("Next"));
        js.executeScript("arguments[0].scrollIntoView();", nextButton);
        nextButton.click();

        List<WebElement> listPage2 = driver.findElements(By.className("test"));
        js.executeScript("arguments[0].scrollIntoView();", listPage2.get(2));
        listPage2.get(2).findElement(By.linkText("PEARSON PLC")).click();

    }
}
