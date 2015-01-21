package pages;

import core.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Locators.get;

public class PageObject extends PageBase{
    public static final By USER_NAME_FIELD = get("loginPage.userNameField");
    public static final By PASSWORD_FIELD = get("loginPage.passwordField");
    public static final By LOGIN_BUTTON = get("loginPage.loginButton");
    public static final By VALIDATION_MESSAGE = get("loginPage.validationMessage");
    //private final By REMEMBER_CHECKBOX = get("loginPage.rememberCheckbox.temp", "value");

    public PageObject(WebDriver driver) {
        super(driver);
    }

    public void login(String user, String pass) {
        driver.findElement(USER_NAME_FIELD).clear();
        driver.findElement(USER_NAME_FIELD).sendKeys(user);
        driver.findElement(PASSWORD_FIELD).clear();
        driver.findElement(PASSWORD_FIELD).sendKeys(pass);
        driver.findElement(LOGIN_BUTTON).click();
    }
}
