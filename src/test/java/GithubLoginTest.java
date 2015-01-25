import core.TestBase;
import helpers.CustomListener;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.PageObject;
import static helpers.WebDriverSingleton.getDriver;
import static helpers.Creds.getUser;

@Listeners(CustomListener.class)
public class GithubLoginTest extends TestBase {

    private PageObject page;
    public static final String [] ADMIN = getUser("admin");
    public static final String [] USER1 = getUser("user1");
    public static final String [] USER2 = getUser("user2");
    public static final String [] USER3 = getUser("user3");


    @Test
    public void loginAdminTest() {
        page.login(ADMIN[0], ADMIN[1]);
        Assert.assertTrue(getDriver().findElement(PageObject.VALIDATION_MESSAGE).isDisplayed());
    }

    @Test
    public void loginUser1Test() {
        page.login(USER1[0], USER1[1]);
        Assert.assertTrue(getDriver().findElement(PageObject.VALIDATION_MESSAGE).isDisplayed());
    }

    @Test
    public void loginUser2Test() {
        page.login(USER2[0], USER2[1]);
        Assert.assertTrue(getDriver().findElement(PageObject.VALIDATION_MESSAGE).isDisplayed());
    }

    @Test
    public void loginUser3Test() {
        page.login(USER3[0], USER3[1]);
        Assert.assertTrue(getDriver().findElement(PageObject.VALIDATION_MESSAGE).isDisplayed());
    }
}
