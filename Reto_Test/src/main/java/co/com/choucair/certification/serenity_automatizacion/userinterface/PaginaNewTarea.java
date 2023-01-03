package co.com.choucair.certification.serenity_automatizacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaNewTarea extends PageObject {

    public static final Target INPUT_NAME = Target.the("Campo para ingresar el Nombre del nuevo Business")
            .located(By.xpath("/html/body/div[4]/div[2]/div/div[2]/form/div/div[1]/div/div/div[1]/input"));
    public static final Target CONTENEDOR_NAME_UNIT = Target.the("Contenedor del Nombre de la unidad")
            .located(By.xpath("//*[@id=\"s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId\"]/a"));
    public static final Target INPUT_NAME_UNIT = Target.the("Campo para ingresar el Nombre de la unidad")
            .located(By.xpath("/html/body/div[7]/div/input"));
    public static final Target BUTTON_SAVE = Target.the("Boton para guardar la tarea")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Toolbar\"]/div/div/div/div[2]"));
}
