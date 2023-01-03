package co.com.choucair.certification.serenityautomatizacion.tasks;

import co.com.choucair.certification.serenityautomatizacion.userinterface.SerenityLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    public static Login laPagina(){
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("admin").into(SerenityLoginPage.INPUT_USER),
                Enter.theValue("serenity").into(SerenityLoginPage.INPUT_PASSWORD),
                Click.on(SerenityLoginPage.ENTER_BUTTON));

    }
}
