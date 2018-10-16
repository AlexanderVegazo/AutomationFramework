package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {


    public FacebookLoginPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.NAME, using = "email")
    public WebElement userNameTxt;

    @FindBy(how = How.NAME, using = "pass")
    public WebElement passwordTxt;

    @FindBy(how = How.ID, using = "u_0_2")
    public WebElement loginBtn;


    public void fillInLoginCredentials(String userName, String password) {
        userNameTxt.sendKeys(userName);
        passwordTxt.sendKeys(password);
    }

    public void clickLogin() {
        loginBtn.click();
    }

}
