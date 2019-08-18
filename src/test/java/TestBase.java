import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class TestBase {
    @BeforeSuite(description = "Init test data and setup properties")
    void beforeSuite() {
        TestData.initSelenide();
    }

    @AfterMethod(description = "Close web driver")
    void afterMethod() {
        closeWebDriver();
    }
}
