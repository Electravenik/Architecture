import core.TestBase;
import helpers.CustomListener;
import helpers.DataProviders;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.PageObject;

import static helpers.WebDriverSingleton.getDriver;

@Listeners(CustomListener.class)
public class DataProviderTest extends TestBase {
    private PageObject page;

    @Test(dataProvider = "userData", dataProviderClass = DataProviders.class)
    public void loginTest(String login, String password){
        page.login(login, password);
        Assert.assertTrue(getDriver().findElement(PageObject.VALIDATION_MESSAGE).isDisplayed());
    }
}
