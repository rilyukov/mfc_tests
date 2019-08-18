import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

@Test
public class SmokeTest extends TestBase {
    @Test
    void customScenario() {
        HomePage homePage = new HomePage();
        homePage.openHomePage();
        homePage.checkTitle();
        homePage.header.clickOnperfromanceMonitoring();
        PerfromnaceMonitoring perfromnaceMonitoring = new PerfromnaceMonitoring();
        perfromnaceMonitoring.checkTitle();
        perfromnaceMonitoring.waitPageLoaded();

        perfromnaceMonitoring.setRegionSelect("Субъекты РФ");
        perfromnaceMonitoring.validateRegionInTheTeble("Все МФЦ/ТОСП");
    }
}
