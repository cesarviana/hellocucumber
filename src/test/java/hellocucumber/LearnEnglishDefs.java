package hellocucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.javalite.test.jspec.JSpec.the;

class HelloTalk {
    static String willLearn(String daysStudy){
        switch (daysStudy) {
            case "all days": return "yes!";
            case "only some days": return "maybe";
            case "never" : return "no, will not learn";
        }
        return "";
    }
}

public class LearnEnglishDefs {

    private String talkDays;
    private String answer;

    @Given("^will talk in hello talk \"([^\"]*)\"$")
    public void willTalkInHelloTalk(String talkDays) throws Throwable {
        this.talkDays = talkDays;
    }

    @When("^I ask wheter will learn english")
    public void iAskWheterWillLearnEnglish(){
        this.answer = HelloTalk.willLearn(this.talkDays);
    }

    @Then("^The answer is \"([^\"]*)\"$")
    public void theAnswerIs(String expectedAnswer){
        the(answer).shouldBeEqual(expectedAnswer);
    }

}
