package co.com.choucair.certification.serenityautomatizacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityLoginPage extends PageObject {
    public static final Target INPUT_USER = Target.the("Campo para ingresar el usuario")
            .located(By.id("LoginPanel0_Username"));
    public static final Target INPUT_PASSWORD = Target.the("Campo para ingresar la contraseña")
            .located(By.id("LoginPanel0_Password"));
    public static final Target ENTER_BUTTON = Target.the("Boton para confirmar login")
            .located(By.id("LoginPanel0_LoginButton"));
}
