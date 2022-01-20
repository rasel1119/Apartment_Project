package page_objects;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {

    private final By ApartmentHomeLogo = By.linkText("https://www.apartments.com/");
    private final By MenuBar = By.id("headerMeunIcon");
//  -------------------------------------------------------------------------------------------------------------

//  # 3. Add a Property
    private final By AddProperty = By.xpath("//span[text()='Add a Property']");
    private final By SingleUnit = By.xpath("//fieldset/label[text()=' Unit ']");
    private final By PropertyAddress = By.id("cpid1-address");
    private final By PropertyType = By.id("cpid1-propertyType");
    private final By SelectBeds = By.id("cpid2-0beds");
    private final By SelectBaths = By.id("cpid6-0baths");
    //private final By SelectCaptcha = By.xpath("//*[@id=\"recaptcha-anchor\"]/div[contains(text(),'')]");
    private final By AddMyProperty = By.xpath("//button[contains(text(),' Add My Property ')]");
//  -------------------------------------------------------------------------------------------------------------

//  # 4. Search Apartment(With Price Range)
    private final By SearchBar = By.id("quickSearchLookup");
    private final By SearchButton = By.linkText("https://www.apartments.com/search/");
    private final By PriceButton = By.xpath("//*[@title='Price'][@type='button']");
    private final By MinRentRange = By.id("min-input");
    private final By MaxRentRange = By.id("max-input");
    private final By Apartment1BR = By.id("placards");
    private final By FavouritesButton = By.xpath("//*[@aria-label='favorites'][@role='button']");
//  -------------------------------------------------------------------------------------------------------------

//  # 5. Homes for Rent
    private final By HomesForRent = By.xpath("//*[@id='menuNavigation']/li[@class='open']");
    private final By BrooklynHomesNav = By.linkText("https://www.apartments.com/houses/brooklyn-ny/");
    private final By SelectHome = By.xpath("//*[@id='placardContainer']/ul/li[@class='mortar-wrapper']");
//  -------------------------------------------------------------------------------------------------------------

//  # 6. Renter Tools
    private final By RentalToolsNav = By.xpath("//*[@id=,menuNavigation']/li[@class='open']");
    private final By FavouritesPage = By.linkText("https://www.apartments.com/my-account/#FavoriteListings");
//  -------------------------------------------------------------------------------------------------------------


    private static final Logger LOGGER = LogManager.getLogger(NavigationBar.class);

    public WebDriver driver;

    public NavigationBar(WebDriver driver) {
        this.driver = driver;
    }



//    public () {
//        LOGGER.debug("Navigating to Real Apr Page");
//        ActOn.element(driver, ).click();
//        return new (driver);
//    }



}
