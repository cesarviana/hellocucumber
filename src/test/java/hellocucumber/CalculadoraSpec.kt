package hellocucumber

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.javalite.test.jspec.JSpec.the

class Calculadora {
    fun soma(a: Int, b: Int) = a + b
}

class CalculadoraSpec {

    private var primeiroNumero: Int = 0
    private var segundoNumero: Int = 0
    private var resultado: Int = 0

    @Given("^primeiro numero é (-?\\d+) e segundo numero é (-?\\d+)$")
    fun pegaNumeros(primeiro: Int, segundo: Int){
        this.primeiroNumero = primeiro
        this.segundoNumero = segundo
    }

    @When("calcula soma")
    fun calculaSoma(){
        this.resultado = Calculadora().soma(primeiroNumero, segundoNumero)
    }

    @Then("^o resultado deve ser (-?\\d+)$")
    fun oResultadoDeveSerTres(resultadoEsperado: Int){
        the(resultado).shouldBeEqual(resultadoEsperado)
    }

}