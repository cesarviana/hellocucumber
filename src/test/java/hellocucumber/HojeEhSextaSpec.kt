package hellocucumber

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.javalite.test.jspec.JSpec.the

fun hojeEhSexta(dia: String) : String{
    if(dia == "sexta")
        return "sim"
    return "não"
}

class HojeEhSextaSpec {

    private lateinit var dia: String
    private lateinit var ehSexta: String

    @Given("hoje é \"([^\"]*)\"")
    fun hojeEhTerca(dia: String){
        this.dia = dia
    }

    @When("verifica se é sexta")
    fun verificaSeEhSexta(){
        this.ehSexta = hojeEhSexta(this.dia)
    }

    @Then("resposta é \"([^\"]*)\"")
    fun aRespostaEhNao(resposta: String){
        the(this.ehSexta).shouldBeEqual(resposta)
    }

}