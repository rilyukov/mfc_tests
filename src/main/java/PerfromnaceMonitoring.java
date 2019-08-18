import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.assertj.core.api.Assertions;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class PerfromnaceMonitoring extends BasePage {
    private static final Integer TIMEOUT = 10000;

    private static final String PAGE_TITLE       = "Мониторинг показателей работы МФЦ";
    private static       String REGION_MENU_ITEM = "//li[contains(.,'%s')]";

    private SelenideElement applyButton  = $x("//button[@class = 'apply-filters btn btn-primary']");
    private SelenideElement regionSelect = $x("(//div[@class = 'aggregation-filter']//div[@class = 'mdm-select'])[2]");
    private SelenideElement infoTable    = $x("//div[@class = 'dataTables_scroll']");

    private void clickApplyButton() {
        applyButton.click();
    }

    private void waitTableLoaded() {
        infoTable.waitUntil(Condition.visible, TIMEOUT);
    }

    void checkTitle() {
        checkPageTitle(PAGE_TITLE);
    }

    void waitPageLoaded() {
        applyButton.waitUntil(Condition.visible, TIMEOUT);
    }

    void setRegionSelect(String title) {
        regionSelect.click();
        $x(String.format(REGION_MENU_ITEM, title)).click();
        clickApplyButton();
        waitTableLoaded();
    }

    void validateRegionInTheTeble(String title) {
        ElementsCollection cells = $$x("//tr[@role = 'row']//td[@data-dt-column = '2']");
        for (SelenideElement cell : cells) {
            Assertions.assertThat(cell.getText()).as("Text in cell").isEqualToIgnoringCase(title);
        }
    }
}
