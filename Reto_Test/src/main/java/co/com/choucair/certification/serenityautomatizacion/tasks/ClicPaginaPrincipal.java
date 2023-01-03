package co.com.choucair.certification.serenityautomatizacion.tasks;

import co.com.choucair.certification.serenityautomatizacion.userinterface.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClicPaginaPrincipal implements Task {
    public static ClicPaginaPrincipal laPagina() {
        return Tasks.instrumented(ClicPaginaPrincipal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaPrincipal.ENTER_ORGANIZATION),
                Click.on(PaginaPrincipal.ENTER_BUSINESS_UNITS),
                Click.on(PaginaPrincipal.ENTER_NEW_BUSINESS));

    }
}
