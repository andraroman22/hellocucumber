package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchElementTest {
    ChromeDriver driver= new ChromeDriver();


    @When("I look for search element on page")
    public void SearchElementTest(){

        HomePage homePage = new HomePage(driver);

        homePage.inputElements("pearson");

    }


}
