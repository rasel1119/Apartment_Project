package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_objects.SignIn;
import utilities.ReadConfigFiles;

public class SignInLogOutSteps {
    private static final Logger LOGGER = LogManager.getLogger(SignInLogOutSteps.class);

    WebDriver driver = Hooks.driver;


    @Given("^user is on the Home Page$")
    public void navigateToHomePage() {


        ActOn.browser(driver).openBrowser(ReadConfigFiles.getPropertyValues("ApmtUrl"));
        LOGGER.info("User is on the Home Page");
    }
    @When("^user enters email \"(.+?)\" and password \"(.+?)\"$")
    public void userEntersUsernameAndPassword(String emailId, String password) {
        new SignIn(driver)
                .clicksOnSignInTab()
                .typeEmailAddress(emailId)
                .typePassword(password);
    }
    @And("^clicks on Sign In button$")
    public void clicksOnSignInButton() {
        new SignIn(driver)
                .clickOnSignInButton();

    }
    @Then("^user should get error message \"(.+?)\"$")
    public void userSeesErrorMessage(String errMsg) {
        new SignIn(driver)
                .unsuccessfulSignInError(errMsg);

    }


}
