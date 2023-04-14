package google.step;

import google.page.GooglePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class GoogleStep extends ScenarioSteps {
    GooglePage googlePage;

    @Step
    public void openWeb() {
        googlePage.open();
    }
}
