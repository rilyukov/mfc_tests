import org.testng.annotations.Test;

@Test
public class SmokeTest extends TestBase {
    @Test
    void customScenario() {
        HomePage homePage = new HomePage();
        homePage.openHomePage();
        homePage.checkTitle();
        homePage.header.clickOnPerformanceMonitoring();
        PerformanceMonitoring performanceMonitoring = new PerformanceMonitoring();
        performanceMonitoring.checkTitle();
        performanceMonitoring.waitPageLoaded();

        performanceMonitoring.setRegionSelect("Субъекты РФ");
        performanceMonitoring.validateRegionInTheTeble("Все МФЦ/ТОСП");
    }
}
