package co.com.choucair.certification.serenity_automatizacion.tasks;

import co.com.choucair.certification.serenity_automatizacion.userinterface.PaginaSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaSerenity implements Task {
    private PaginaSerenity paginaSerenity;
    public static AbrirPaginaSerenity laPagina() {
        return Tasks.instrumented(AbrirPaginaSerenity.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaSerenity));
        
    }
}
