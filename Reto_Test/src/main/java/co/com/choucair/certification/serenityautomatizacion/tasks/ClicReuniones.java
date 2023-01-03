package co.com.choucair.certification.serenityautomatizacion.tasks;

import co.com.choucair.certification.serenityautomatizacion.userinterface.PaginaMeeting;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClicReuniones implements Task {
    public static ClicReuniones lapagina() {
        return Tasks.instrumented(ClicReuniones.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaMeeting.ENTER_MEETING),
                Click.on(PaginaMeeting.ENTER_MEETING2),
                Click.on(PaginaMeeting.ENTER_NUEVA_REUNION));
    }
}
