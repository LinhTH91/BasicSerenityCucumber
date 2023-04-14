package google.stmapper;

import google.step.GoogleStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

//@RunWith(SerenityRunner.class)
public class GoogleMapper {
    @Steps
    GoogleStep googleStep;

    @Given("Open URL")
    public void open_url() {
        googleStep.openWeb();
    }

    @Then("Login screen is displayed")
    public void login_screen_is_displayed() {
        System.out.println("Hello World");
    }
}
