package rs.sonja;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class MySteps {
    @Given("Navigate to URL {string}")
    public void navigateToURL(String urlPath) throws InterruptedException {
        File file = new File("src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        Base.driver = new ChromeDriver(options);
        Base.driver.manage().window().maximize();
        Base.driver.navigate().to(urlPath);
        Thread.sleep(5000);
        //wait(1000);
    }

    @Then("Wait")
    public void wait1() throws InterruptedException {
        Thread.sleep(4000);

    }

    @Then("Click on empty space")
    public void clickOnEmptySpace() {
        WebElement element = Base.driver.findElement(By.xpath("//*[@aria-label='Dismiss sign in information.']"));
        element.click();
    }

    @Then("Type in {string} into search field by placeholder {string}")
    public void typeInIntoSearchField(String value, String placeholder) {
        WebElement element = Base.driver.findElement(By.xpath("//*[@placeholder='" + placeholder + "']"));
        element.sendKeys(value);
    }

    @Then("Browser quit")
    public void browserQuit() {
        Base.driver.quit();
    }

//    @Then("Click on element on the dropdown list")
//    public void clickOnElementOnTheDropdownList() {
//        WebElement element = Base.driver.findElement(By.xpath("(//*[@class=\"3cj1dx\"])[1]"));
//        element.click();
//    }

    @Then("Click on Button by class {string}")
    public void clickOnButtonById(String className) {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@class='" + className + "'])[1]"));
        element.click();
    }

    @Then("Click on start date")
    public void clickOnStartDate() {
        WebElement element = Base.driver.findElement(By.xpath("//*[@aria-label='5 August 2023']"));
        element.click();
    }

    @Then("Click on end date")
    public void clickOnEndDate() {
        WebElement element = Base.driver.findElement(By.xpath("//*[@aria-label='8 August 2023']"));
        element.click();
    }

    @Then("Click on Search button")
    public void clickOnSearchButton() {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@class=\"f9cf783bde\"])[4]"));
        element.click();
    }

    @Then("Assert search results by class")
    public void assertSearchResults() {
        WebElement element = Base.driver.findElement(By.cssSelector("[class='fcab3ed991 d5f78961c3']"));
        Assert.assertTrue(element.isDisplayed());
    }

    @Then("Click on occupancy option")
    public void clickOnOccupancyOption() {
        WebElement element = Base.driver.findElement(By.xpath("//*[@data-testid=\"occupancy-config\"]"));
        element.click();
    }

    @Then("Click on plus sign")
    public void clickOnPlusSign() {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@type=\"button\"])[12]"));
        element.click();
    }

    @Then("Click on button Done")
    public void clickOnButtonDone() {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@type=\"button\"])[18]"));
        element.click();
    }

    @Then("Click on Flight option")
    public void clickOnStringOption() {
        //WebElement element = Base.driver.findElement(By.xpath("(//*[@class=\"db29ecfbe2\"]["+index+"])"));
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"fc63351294 fa030f4cc2 d4e373d880\"])[1]")));
        element.click();
    }

    @Then("Click on date field")
    public void clickOnInputField() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"css-1ovag24\"])[3]")));
        element.click();
    }

    @Then("Click on destination input field")
    public void clickOnDestinationInputField() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"css-1ovag24\"])[2]")));
        element.click();
    }

//    @Then("Input destination {string}")
//    public void inputDestination(String destination) {
//        WebElement element = Base.driver.findElement(By.cssSelector("[class='css-n1d439 css-18e6ulj']"));
//        element.sendKeys(destination);
//    }

    @Then("Click on Airport or City field and input {string}")
    public void clickOnAirportOrCityField(String value) {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"css-1ovag24\"])[2]")));
        element.sendKeys(value);
        element.click();
    }

    @Then("Click on Submit button")
    public void clickOnSubmitButton() {
        WebElement element = Base.driver.findElement(By.xpath("//*[@data-ui-name=\"button_search_submit\"]"));
        element.click();
    }

    @Then("Click on Attractions option")
    public void clickOnCarRentalsOption() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"fc63351294 fa030f4cc2 d4e373d880\"])[3]")));
        element.click();
    }

    @Then("Click on Select your dates field")
    public void clickOnSelectYourDatesField() {
        WebElement element = Base.driver.findElement(By.xpath(("(//*[@class=\"css-ck8kih\"])")));
        element.click();
    }

    @Then("Click on Search button by class")
    public void clickOnSearchButton1() {
        WebElement element = Base.driver.findElement(By.xpath("(//*[@class=\"e57ffa4eb5\"])[5]"));
        element.click();
    }
}