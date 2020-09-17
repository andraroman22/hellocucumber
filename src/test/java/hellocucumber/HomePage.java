package hellocucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    protected static ChromeDriver driver;

    private By searchBoxText= By.id("search-box-input");
    private By searchBoxButton= By.className("search-box-icon");

    public HomePage(ChromeDriver driver){
        this.driver=driver;
    }

    public HomePage(){
    }

    public void inputElements(String searchElement){
        driver.findElement(searchBoxText).sendKeys(searchElement);
    }
    @Then("I can use search feature on page")
    public void searchElements(){
        driver.findElement(searchBoxButton).click();
    }

    @Given("main page is loaded")
    public void loadMainPage() {
        {
            driver.manage().window().maximize();
            driver.get("http://pearson.com/");
        }
    }
}
