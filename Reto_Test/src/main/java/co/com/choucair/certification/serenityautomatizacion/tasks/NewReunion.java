package co.com.choucair.certification.serenityautomatizacion.tasks;

import co.com.choucair.certification.serenityautomatizacion.userinterface.PaginaNuevaReunion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class NewReunion implements Task {

    public static NewReunion laPagina() {

        return Tasks.instrumented(NewReunion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Prueba1").into(PaginaNuevaReunion.INPUT_NAME_NUEVA_REUNION),
                Click.on(PaginaNuevaReunion.CONTENEDOR_TIPO_REUNION),
                Enter.theValue("General").into(PaginaNuevaReunion.INPUT_TIPO_REUNION),
                Hit.the(Keys.ARROW_DOWN).into(PaginaNuevaReunion.INPUT_TIPO_REUNION),
                Hit.the(Keys.ENTER).into(PaginaNuevaReunion.INPUT_TIPO_REUNION),
                Enter.theValue("01/04/2023").into(PaginaNuevaReunion.INPUT_DATE_FECHA_INICIAL),
                Click.on(PaginaNuevaReunion.CLIC_RELOJ_HORA_INICIAL),
                Click.on(PaginaNuevaReunion.CONTENEDOR_RELOJ_INICIAL),
                Hit.the(Keys.ARROW_DOWN).into(PaginaNuevaReunion.CONTENEDOR_RELOJ_INICIAL),
                Hit.the(Keys.ENTER).into(PaginaNuevaReunion.CONTENEDOR_RELOJ_INICIAL),
                Click.on(PaginaNuevaReunion.CONTENEDOR_LOCACION),
                Enter.theValue("On Site").into(PaginaNuevaReunion.INPUT_LOCACION),
                Hit.the(Keys.ENTER).into(PaginaNuevaReunion.INPUT_LOCACION),
                Click.on(PaginaNuevaReunion.CONTENEDOR_ORGANIZACION),
                Enter.theValue("James Jones").into(PaginaNuevaReunion.INPUT_ORGANIZACION),
                Hit.the(Keys.ENTER).into(PaginaNuevaReunion.INPUT_ORGANIZACION),
                Enter.theValue("10").into(PaginaNuevaReunion.INPUT_NUMERO_REUNION),
                Enter.theValue("01/08/2023").into(PaginaNuevaReunion.INPUT_DATE_FECHA_FINAL),
                Click.on(PaginaNuevaReunion.CLIC_RELOJ_HORA_FINAL),
                Click.on(PaginaNuevaReunion.CONTENEDOR_RELOJ_FINAL),
                Hit.the(Keys.ARROW_DOWN).into(PaginaNuevaReunion.CONTENEDOR_RELOJ_FINAL),
                Hit.the(Keys.ENTER).into(PaginaNuevaReunion.CONTENEDOR_RELOJ_FINAL),
                Click.on(PaginaNuevaReunion.CONTENEDOR_UNIDAD),
                Enter.theValue("Marketing").into(PaginaNuevaReunion.INPUT_UNIDAD),
                Hit.the(Keys.ENTER).into(PaginaNuevaReunion.INPUT_UNIDAD),
                Click.on(PaginaNuevaReunion.CONTENEDOR_REPORTERO),
                Enter.theValue("Alexis Lopez").into(PaginaNuevaReunion.INPUT_REPORTERO),
                Hit.the(Keys.ENTER).into(PaginaNuevaReunion.INPUT_REPORTERO),
                Click.on(PaginaNuevaReunion.CONTENEDOR_LISTA_ASISTENTES),
                Enter.theValue("Charles Davis").into(PaginaNuevaReunion.INPUT_ASISTENTES),
                Hit.the(Keys.ENTER).into(PaginaNuevaReunion.INPUT_ASISTENTES),
                Click.on(PaginaNuevaReunion.BUTTON_SAVE));
    }
}
