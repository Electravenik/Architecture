package helpers;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "userData")
    public static Object[][] userData() {
        return new Object[][] { { "user1@yandex.ru", "12345" }, { "user2@yandex.ru", "rtewtg43" },
                { "user3@yandex.ru", "87rfdf" }};
    }
}
