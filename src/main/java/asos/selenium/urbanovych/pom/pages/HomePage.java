package asos.selenium.urbanovych.pom.pages;

import asos.selenium.urbanovych.pom.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By categoryDiv = By.className("genericSplash__ctasContainer");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage load() {
        load("/");
        return this;
    }

    public WomenPage navigateToWomenPage() {
        driver.findElements(categoryDiv).get(0).click();
        return new WomenPage(driver);
    }

    public MenPage navigateToMenPage() {
        driver.findElements(categoryDiv).get(1).click();
        return new MenPage(driver);
    }

}
