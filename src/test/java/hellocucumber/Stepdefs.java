package hellocucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.javalite.test.jspec.JSpec.the;

class IsItFriday {
    static String isItFriday(String today){
        if(today.equals("Friday"))
            return "TGIF";
        return "Nope";
    }
}

public class Stepdefs {
    private String today;
    private String actualAnswer;

    @Given("^today is \"([^\"]*)\"")
    public void todayIs(String today) {
        this.today = today;
    }

    @When("^I ask wheter it's Friday yet$")
    public void i_ask_wheter_it_s_Friday_yet() {
        this.actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer){
        the(expectedAnswer).shouldBeEqual(actualAnswer);
    }

}