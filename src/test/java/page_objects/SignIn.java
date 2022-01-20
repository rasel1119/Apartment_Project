package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
    private final By SignInTab = By.xpath("//*[@id='headerLoginSection']/a[text()='Sign In']");
    private final By EmailID =By.id("username");
    private final By Password = By.id("password");
    private final By SignInTabLocator = By.id("loginButton");
    private final By DiscoverNewHomeHeader = By.id("quickSearchMainTitle");
    private final By UserProfileLocator = By.xpath("//span[text()='Md']");
    private final By LogOutLocator = By.id("headerSignOut");
    private final By ErrorMessage = By.xpath("//*[@class='validation-error invalid-credentials'][@role='alert']");

    private static final Logger LOGGER = LogManager.getLogger(SignIn.class);

    public WebDriver driver;

    public SignIn(WebDriver driver) {
        this.driver = driver;
    }

    public SignIn clicksOnSignInTab() {
        LOGGER.info("User Clicks on Sign In Tab");
        // driver.findElement(SignInTab).click();
        ActOn.element(driver, SignInTab).click();
        return this;
    }
    public SignIn typeEmailAddress(String value) {
        LOGGER.info("Typing Email Address: " + value);
        // driver.findElement(EmailID).clear();
        // driver.findElement(EmailID).sendKeys("ashfaqmrahman@gmail.com");
        ActOn.element(driver, EmailID).setValue(value);
        return this;
    }
    public SignIn typePassword(String value) {
        LOGGER.info("Typing password: " + value);
        ActOn.element(driver, Password).setValue(value);
        return this;
    }
    public SignIn clickOnSignInButton() {
        LOGGER.info("Clicking on Sign In Button");
        ActOn.element(driver, SignInTabLocator).click();
        return this;
    }
    public SignIn unsuccessfulSignInError(String expectedErrorText) {
        String actualErrorText = ActOn.element(driver, ErrorMessage).getTextValue();
        LOGGER.debug("Validating Sign In Attempt is Unsuccessful with Invalid Credentials");
        Assert.assertEquals(expectedErrorText, actualErrorText);
        return this;
    }

    public SignIn signInIsSuccessful(String expectedText) {
        String actualText = ActOn.element(driver, DiscoverNewHomeHeader).getTextValue();
        LOGGER.debug("Validating Sign In Attempt is Successful with Valid Credentials");
        Assert.assertEquals(expectedText, actualText);
        return this;
    }
    public SignIn userProfileField() {
        LOGGER.info("Clicking on User Profile Tab");
        ActOn.element(driver, UserProfileLocator).click();
        return this;
    }
    public SignIn navigateToLogOut() {
        LOGGER.info("Clicking on Log Out Button");
        ActOn.element(driver, LogOutLocator).click();
        return this;
    }
    public SignIn logoutIsSuccessful(String expectedText) {
        String actualText = ActOn.element(driver, DiscoverNewHomeHeader).getTextValue();
        LOGGER.debug("Validating Log Out Attempt is Successful");
        Assert.assertEquals(expectedText, actualText);
        return this;
    }











//    @BeforeMethod
//    public void openBrowser() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://www.apartments.com/");
//        driver.manage().window().maximize();
//    }
//
//    public void enterData() {
//
//        // driver.findElement(SignInTab).click();
//        ActOn.element(driver, SignInButton).click();
//
//        // driver.findElement(EmailID).clear();
//        // driver.findElement(EmailID).sendKeys("ashfaqmrahman@gmail.com");
//        ActOn.element(driver, EmailID).setValue("ashfaqmrahman@gmail.com");
//
//        // driver.findElement(Password).clear();
//        // driver.findElement(Password).sendKeys("P@ssw0rD$<TesTing");
//        ActOn.element(driver, Password).setValue("P@ssw0rD$<TesTing");
//
//        driver.findElement(SignInButton).click();
//        Act
//
//        driver.findElement(NameSpanTab).click();
//
//        driver.findElement(LogOutButton).click();
//
//        driver.findElement(ErrorMessage).isDisplayed();
//    }
//
//
//
//    @Test
//
//    public void validTesting() {
//        enterData();
//
//    }

}
