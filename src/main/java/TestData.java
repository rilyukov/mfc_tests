import com.codeborne.selenide.Configuration;

import static org.openqa.selenium.remote.BrowserType.CHROME;

public class TestData {

    public static String BASE_URL = "https://xn--d1apb.xn--d1achjhdicc8bh4h.xn--p1ai/";

    public static void initSelenide() {
        Configuration.browser = System.getProperty("selenide.browser", System.getProperty("browser", CHROME));
        System.setProperty("webdriver.chrome.driver", "/Users/rilyukov/IdeaProjects/mfc/mfc_tests/mfctest/src/main/resources/chromedriver");
        if ((null == Configuration.browserSize || Configuration.browserSize.isEmpty())) {
            Configuration.browserSize = "1920x1080";
        }

        if (null == Configuration.baseUrl || Configuration.baseUrl.isEmpty() || Configuration.baseUrl.equals("http://localhost:8080")) {
            Configuration.baseUrl = TestData.BASE_URL;
        }

        if (Configuration.timeout == 4000) {
            Configuration.timeout = 6000;
        }
    }
}
