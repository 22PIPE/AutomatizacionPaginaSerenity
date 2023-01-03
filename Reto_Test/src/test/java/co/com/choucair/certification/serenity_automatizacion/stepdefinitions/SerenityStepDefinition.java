package co.com.choucair.certification.serenity_automatizacion.stepdefinitions;

import co.com.choucair.certification.serenityautomatizacion.questions.Answer;
import co.com.choucair.certification.serenityautomatizacion.questions.Success;
import co.com.choucair.certification.serenityautomatizacion.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SerenityStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Yo estando en la pagina de StartSharp")
    public void yoEstandoEnLaPaginaDeStartSharp() {
        OnStage.theActorCalled("admin").wasAbleTo(AbrirPaginaSerenity.laPagina());

    }

    @Given("especifico mis credenciales de logueo")
    public void especificoMisCredencialesDeLogueo() {
        OnStage.theActorCalled("admin").wasAbleTo(Login.laPagina());
    }

    @When("ingreso al modulo Organizacion")
    public void ingresoAlModuloOrganizacion() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClicPaginaPrincipal.laPagina());

    }

    @When("creo la nueva unidad de negocio")
    public void creoLaNuevaUnidadDeNegocio() {
        OnStage.theActorInTheSpotlight().attemptsTo(NewTarea.laPagina());
    }

    @Then("se completa la creacion de la nueva unidad de negocio {string}")
    public void seCompletaLaCreacionDeLaNuevaUnidadDeNegocio(String organization){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Success.register(organization)));

    }
    @When("ingreso al modulo Meeting")
    public void ingresoAlModuloMeeting() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClicReuniones.lapagina());

    }

    @When("creo la nueva reunion")
    public void creoLaNuevaReunion() {
        OnStage.theActorInTheSpotlight().attemptsTo(NewReunion.laPagina());

    }

    @Then("se completa la creacion de la nueva reunion {string}")
    public void seCompletaLaCreacionDeLaNuevaReunion(String organization2){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.register(organization2)));

    }

}
