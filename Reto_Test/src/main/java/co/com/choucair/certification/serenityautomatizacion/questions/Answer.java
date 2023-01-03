package co.com.choucair.certification.serenityautomatizacion.questions;

import co.com.choucair.certification.serenityautomatizacion.userinterface.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answer implements Question<Boolean> {

    private String organization2;

    public Answer(String organization2)
    {

        this.organization2 = organization2;
    }

    public static Answer register(String organization2) {
        return new Answer(organization2);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result2;
        String textSuccess = Text.of(PaginaPrincipal.BUSINESS_UNIT_SUCCESS).viewedBy(actor).asString();
        result2 = organization2.equals(textSuccess);
        return result2;

    }
}

