package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.BaiDuHomePage;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;


/**
 * Created by July on 7/7/17.
 */
public class BaiDu_StepDefinitions {
    public WebDriver driver;
    public static BaiDuHomePage baiDuHomePage;


    public BaiDu_StepDefinitions()
    {
    	driver = Hooks.driver;
        baiDuHomePage = PageFactory.initElements(driver, BaiDuHomePage.class);
    }
    
    @Given("^I open baidu website and validate the title$")
    public void i_open_website() throws Throwable {
        //driver.get("http://www.baidu.com");
        assertEquals(driver.getTitle(), "百度一下，你就知道");
    }



    @When("^I input \"(.*?)\" and search$")
    public void i_input_keyword_and_search(String text) throws  Throwable{
        baiDuHomePage.searhbyKeyword(text);
    }

    @Then("^the search result displayed$")
    public void the_search_result_page_displayed() throws Throwable {
        //TO DO: Assert result
    }
    
}