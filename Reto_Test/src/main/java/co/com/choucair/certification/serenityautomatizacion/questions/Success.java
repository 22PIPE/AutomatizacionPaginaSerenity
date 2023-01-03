package co.com.choucair.certification.serenityautomatizacion.questions;

import co.com.choucair.certification.serenityautomatizacion.userinterface.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Success implements Question<Boolean> {

    private String organization;

    public Success(String organization)
    {
        this.organization = organization;
    }

    public static Success register(String organization) {
        return new Success(organization);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String textSuccess = Text.of(PaginaPrincipal.BUSINESS_UNIT_SUCCESS).viewedBy(actor).asString();
        result = organization.equals(textSuccess);
        return result;

    }
}
