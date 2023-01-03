package co.com.choucair.certification.serenityautomatizacion.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaNuevaReunion extends PageObject {

    public static final Target INPUT_NAME_NUEVA_REUNION = Target.the("Campo para ingresar el nombre de la reunion")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingName"));

    public static final Target CONTENEDOR_TIPO_REUNION = Target.the("Contenedor del tipo de reunion")
            .located(By.xpath("//*[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId\"]"));

    public static final Target INPUT_TIPO_REUNION = Target.the("Campo para ingresar el tipo de la reunion")
            .located(By.xpath("//*[@id=\"s2id_autogen6_search\"]"));

    public static final Target INPUT_DATE_FECHA_INICIAL = Target.the("Campo para ingresar la fecha inicial de la reunion")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_StartDate"));

    public static final Target CLIC_RELOJ_HORA_INICIAL = Target.the("Icono para Colocar la fecha actual")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[4]/i"));

    public static final Target CONTENEDOR_RELOJ_INICIAL = Target.the("Contenedor para seleccionar hora inicial de la reunion")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[4]/select"));

    public static final Target CONTENEDOR_LOCACION = Target.the("Contenedor para seleccionar la locacion de la reunion")
            .located(By.xpath("//*[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId\"]"));

    public static final Target INPUT_LOCACION = Target.the("Campo para ingresar la locacion de la reunion")
            .located(By.id("s2id_autogen7_search"));

    public static final Target CONTENEDOR_ORGANIZACION = Target.the("Contenedor para seleccionar la organizacion de la reunion")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId"));

    public static final Target INPUT_ORGANIZACION = Target.the("Campo para ingresar la organizacion de la reunion")
            .located(By.id("s2id_autogen9_search"));

    public static final Target INPUT_NUMERO_REUNION = Target.the("Campo para ingresar el numero de la reunion")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber"));

    public static final Target INPUT_DATE_FECHA_FINAL = Target.the("Campo para ingresar la fecha final de la reunion")
            .located(By.id("Serenity_Pro_Meeting_MeetingDialog10_EndDate"));

    public static final Target CLIC_RELOJ_HORA_FINAL = Target.the("Icono para Colocar la fecha actual")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[5]/i"));

    public static final Target CONTENEDOR_RELOJ_FINAL = Target.the("Contenedor para seleccionar hora final de la reunion")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[5]/select"));

    public static final Target CONTENEDOR_UNIDAD = Target.the("Contenedor para seleccionar la unidad de la reunion")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId"));

    public static final Target INPUT_UNIDAD = Target.the("Campo para ingresar la unidad de la reunion")
            .located(By.id("s2id_autogen8_search"));

    public static final Target CONTENEDOR_REPORTERO = Target.the("Contenedor para seleccionar el reportero de la reunion")
            .located(By.id("s2id_Serenity_Pro_Meeting_MeetingDialog10_ReporterContactId"));
    public static final Target INPUT_REPORTERO = Target.the("Campo para ingresar el reportero de la reunion")
            .located(By.id("s2id_autogen10_search"));

    public static final Target CONTENEDOR_LISTA_ASISTENTES = Target.the("Contenedor para seleccionar los asistentes de la reunion")
            .located(By.id("s2id_autogen11"));

    public static final Target INPUT_ASISTENTES = Target.the("Campo para ingresar los asistentes de la reunion")
            .located(By.id("s2id_autogen12_search"));

    public static final Target BUTTON_SAVE = Target.the("Boton para guardar la reunion")
            .located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_Toolbar\"]/div/div/div/div[2]"));

}