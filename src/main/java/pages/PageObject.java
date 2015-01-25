package pages;

import core.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static helpers.Locators.get;
import static helpers.WebDriverSingleton.getDriver;

public class PageObject extends PageBase{
    public static final By USER_NAME_FIELD = get("loginPage.userNameField");
    public static final By PASSWORD_FIELD = get("loginPage.passwordField");
    public static final By LOGIN_BUTTON = get("loginPage.loginButton");
    public static final By VALIDATION_MESSAGE = get("loginPage.validationMessage");


    //private final By REMEMBER_CHECKBOX = get("loginPage.rememberCheckbox.temp", "value");


    public static void login(String user, String pass) {
        getDriver().findElement(USER_NAME_FIELD).clear();
        getDriver().findElement(USER_NAME_FIELD).sendKeys(user);
        getDriver().findElement(PASSWORD_FIELD).clear();
        getDriver().findElement(PASSWORD_FIELD).sendKeys(pass);
        getDriver().findElement(LOGIN_BUTTON).click();
    }
}
