import com.codeborne.selenide.SelenideElement;
import org.assertj.core.api.Assertions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BasePage {

    SelenideElement pageTitle = $("#content > h1");

    Header header = new Header();

    private void openPage(String url) {
        open(url);
    }

    void openHomePage() {
        openPage("/");
    }

    void checkPageTitle(String title) {
        Assertions.assertThat(pageTitle.getText()).isEqualToIgnoringCase(title)
                .as("Page title matches");
    }
}
