import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Header {

    private SelenideElement news                  = $("#layout_20");
    private SelenideElement performanceMonitoring = $("#layout_104");

    public void clickOnNews() {
        news.click();
    }

    public void clickOnperfromanceMonitoring() {
        performanceMonitoring.click();
    }
}
