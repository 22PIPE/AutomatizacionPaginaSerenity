package co.com.choucair.certification.serenity_automatizacion.questions;

import co.com.choucair.certification.serenity_automatizacion.userinterface.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Answer implements Question<Boolean> {

    private String organization2;

    public Answer(String organization2)
    {

        this.organization2 = organization2;
    }

    public static Answer Register(String organization2) {
        return new Answer(organization2);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result2;
        String textSuccess = Text.of(PaginaPrincipal.BUSINESS_UNIT_SUCCESS).viewedBy(actor).asString();
        System.out.println(organization2);
        System.out.println(textSuccess);
        result2 = organization2.equals(textSuccess);
        return result2;

    }
}

