package co.com.choucair.certification.serenityautomatizacion.tasks;

import co.com.choucair.certification.serenityautomatizacion.userinterface.PaginaNewTarea;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class NewTarea implements Task {


    public static NewTarea laPagina() {
        return Tasks.instrumented(NewTarea.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Prueba1").into(PaginaNewTarea.INPUT_NAME),
                Click.on(PaginaNewTarea.CONTENEDOR_NAME_UNIT),
                Enter.theValue("Administration").into(PaginaNewTarea.INPUT_NAME_UNIT),
                Hit.the(Keys.ARROW_DOWN).into(PaginaNewTarea.INPUT_NAME_UNIT),
                Hit.the(Keys.ENTER).into(PaginaNewTarea.INPUT_NAME_UNIT),
                Click.on(PaginaNewTarea.BUTTON_SAVE));

    }
}
