import core.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PageObject;

public class GithubLoginTest extends TestBase {
    private PageObject page;

    @Override
    @BeforeMethod
    public void setup() throws InterruptedException {
        super.setup();
        page = new PageObject(driver);
    }

    @Test
    public void loginTest() {
        page.login("kreisfahrer@gmail.com", "wrong pass");
        Assert.assertTrue(driver.findElement(PageObject.VALIDATION_MESSAGE).isDisplayed());
    }
}
