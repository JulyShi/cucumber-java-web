package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by July on 7/7/17.
 */
public class BaiDuHomePage extends BaseClass{
    WebDriverWait wait;
    public BaiDuHomePage(WebDriver driver){
        super(driver);
        wait = new WebDriverWait(driver, 5);
    }


    /**
     * Find Web Elements
     **/
    @FindBy(xpath = "//*[@id='kw']")
    public WebElement Keyword_input;

    @FindBy(xpath = "//*[@id='su']")
    public WebElement search_btn;



    /**
     * KeyWords
     **/
    public void setKeyword_input(String keyword){
        if(isElementPresent(Keyword_input)){
            Keyword_input.clear();
            Keyword_input.sendKeys(keyword);
        }

    }

    public void clicksearch_btn(){
        if(isElementPresent(search_btn)){
            search_btn.click();
        }
    }


    /**
     * Methods
     **/
    public void searhbyKeyword(String keyword){
        setKeyword_input(keyword);
        clicksearch_btn();
    }
}
