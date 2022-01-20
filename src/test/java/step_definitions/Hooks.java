package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

import java.time.Duration;


public class Hooks {
    private static final Logger LOGGER = LogManager.getLogger(Hooks.class);
    public static WebDriver driver;

    @Before
    public void browserInitialization() {
        //LOGGER.info(String.format("---------------Scenario: %s--------------", scenario.getName()));
        driver = DriverFactory.getInstance().getDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void closeBrowser() {
        DriverFactory.getInstance().removeDriver();
        LOGGER.info("Closed the browser");
    }
}
