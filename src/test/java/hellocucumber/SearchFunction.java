//package hellocucumber;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//import java.util.List;
//
//
//public class SearchFunction {
//    ChromeDriver driver= new ChromeDriver();
//
//    @Given("main page is loaded")
//    public void mainPage(){
//        driver.manage().window().maximize();
//        driver.get("http://pearson.com/");
//    }
//
//    @When("I look for search element on page")
//    public void searchBox() {
//        WebElement searchBox=driver.findElement(By.id("search-box-input"));
//        searchBox.isDisplayed();
//    }
//
//    @Then("I can use search feature on page")
//    public void findElement() throws InterruptedException {
//        WebElement insertText=driver.findElement(By.className("search-box-input"));
//        insertText.sendKeys("pearson");
//        WebElement searchButton=driver.findElement(By.className("search-box-icon"));
//        searchButton.click();
//
//        List<WebElement>countResultsList = driver.findElements(By.className("test"));
//
//        Assert.assertEquals(10,countResultsList.size());
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        WebElement nextButton = driver.findElement(By.linkText("Next"));
//        js.executeScript("arguments[0].scrollIntoView();", nextButton);
//        nextButton.click();
//
//        List<WebElement> countResultsListPage2 = driver.findElements(By.className("test"));
//        js.executeScript("arguments[0].scrollIntoView();", countResultsListPage2.get(2));
//        countResultsListPage2.get(2).findElement(By.linkText("PEARSON PLC")).click();
//
//    }
//}
