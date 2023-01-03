package co.com.choucair.certification.serenity_automatizacion.questions;

import co.com.choucair.certification.serenity_automatizacion.userinterface.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Success implements Question<Boolean> {

    private String organization;

    public Success(String organization)
    {
        this.organization = organization;
    }

    public static Success Register(String organization) {
        return new Success(organization);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String textSuccess = Text.of(PaginaPrincipal.BUSINESS_UNIT_SUCCESS).viewedBy(actor).asString();
        System.out.println(organization);
        System.out.println(textSuccess);
        result = organization.equals(textSuccess);
        return result;

    }
}
