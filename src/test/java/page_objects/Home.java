package page_objects;

import org.openqa.selenium.By;

public class Home {


//  --------------------------------------------------------------------------------------------------------------------

//  # 7. Pet Friendly Apartments
    private final By PetFriendlyApartment = By.linkText("https://www.apartments.com/pet-friendly-apartments/");
    private final By NavigatesToNewYork = By.linkText("https://www.apartments.com/new-york-ny/pet-friendly/");
    private final By SelectStudioApartment = By.xpath("//*[@id='placardContainer']/ul/li/article[@data-ck='spzd8l4']");
//  --------------------------------------------------------------------------------------------------------------------

//  # 8. Language Preference
    private final By LanguageEnglishToEspañol = By.linkText("https://www.apartments.com/es/");
    private final By LanguageEspañolToEnglish = By.linkText("https://www.apartments.com/");
//  --------------------------------------------------------------------------------------------------------------------

//  # 9. Rental Manager Resources
    private final By RentalManagerResource = By.linkText("https://www.apartments.com/rental-manager/resources");
    private final By SelectArticle = By.name("selectTopic");
    private final By SelectNyMap = By.id("NY");
//  --------------------------------------------------------------------------------------------------------------------

//  # 10. Advertise
    private final By SelectAdvertiseLink = By.linkText("https://www.apartments.com/advertise");
    private final By ClickOnAdvertiseNow = By.id("addToCart");
    private final By  FirstName = By.id("Textbox-1");
    private final By LastName = By.id("Textbox-2");
    private final By Email = By.id("Textbox-3");
    private final By PhoneNumber = By.id("Textbox-4");
    private final By CommunityName = By.id("Textbox-5");
    private final By SelectCommunitySize = By.id("Dropdown-1");
    private final By CommunityZip = By.id("Textbox-6");
    private final By ManagementCompany = By.id("Textbox-7");
    private final By SubmitButton = By.id("C025_Col01");
}
