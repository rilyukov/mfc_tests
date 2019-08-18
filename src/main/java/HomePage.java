import org.assertj.core.api.Assertions;

public class HomePage extends BasePage {

    private static final String PAGE_TITLE = "Новости";

    void checkTitle() {
        checkPageTitle(PAGE_TITLE);
    }


}

