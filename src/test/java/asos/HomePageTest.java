package asos;

import asos.selenium.urbanovych.pom.base.BaseTest;
import asos.selenium.urbanovych.pom.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void navigateToWomenCategoryPage() {
        HomePage homePage
                = new HomePage(driver)
                .load();
        homePage.navigateToWomenPage();

        Assert.assertEquals(driver.getTitle(),
                "Women's Clothes | Shop for Women's Fashion | ASOS",
                "Title is not equal to expected");
    }

    @Test
    public void navigateToMenCategoryPage() {
        HomePage homePage
                = new HomePage(driver)
                .load();
        homePage.navigateToMenPage();

        Assert.assertEquals(driver.getTitle(),
                "Men's Clothes | Shop for Men's Fashion | ASOS",
                "Title is not equal to expected");
    }
}
