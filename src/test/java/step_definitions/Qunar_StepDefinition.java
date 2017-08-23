package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.QunarHomePage;

/**
 * Created by xyShi on 7/23/17.
 */
public class Qunar_StepDefinition {
    public WebDriver driver;
    public static QunarHomePage qunarHomePage;

    public Qunar_StepDefinition(){
        driver = Hooks.driver;
        qunarHomePage = PageFactory.initElements(driver, QunarHomePage.class);

    }

    @Given("^I open qunar website and validate the title$")
    public void i_open_the_qunar_home_page() {
        System.out.println("Title: " + driver.getTitle());
    }

    @When("^I click \"(.*?)\"$")
    public void i_click_button(String tab){
        qunarHomePage.clickTab(tab);
    }

    @And("^I input the Free Trip search page$")
    public void i_input_FreeTrip_search_page() throws InterruptedException {
        qunarHomePage.Fn_FillinFreeTripPage();
    }

    @Then("^the search result displayed$")
    public void the_search_result_page_dispalyed(){
        System.out.println("Title: " + driver.getTitle());
    }
}
