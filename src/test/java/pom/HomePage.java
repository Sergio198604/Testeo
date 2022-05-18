package pom;

import org.openqa.selenium.By;

public class HomePage {

    private String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
    private By titleComicsLocator = By.id("menu-item-2008");

    public String getTitleHomePage() {
        return titleHomePage;
    }

    public By getTitleComicsLocator() {
        return titleComicsLocator;
    }
}
