package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FacebookLoginPage;

import java.util.List;

public class FacebookLoginSteps extends BaseUtil {

    private BaseUtil base;

    FacebookLoginPage facebookLoginPage = new FacebookLoginPage(base.Driver);


    public FacebookLoginSteps(BaseUtil base) {
        this.base = base;
    }


    @Given("^User navigate to the facebook login page$")
    public void navigateToFacebookPage() {


        System.out.println("Navigate Facebook login Page");
        base.Driver.navigate().to("https://www.facebook.com/");
    }

    @When("^User fills in Email and Password$")
    public void userFillsInEmailAndPassword(DataTable table) {

        List<String> credentials = table.raw().get(1);
        facebookLoginPage.fillInLoginCredentials(credentials.get(0), credentials.get(1));

    }

    @Then("^User clicks on Log-In Button$")
    public void userClicksOnButton() {

        facebookLoginPage.loginBtn.click();

    }
}
