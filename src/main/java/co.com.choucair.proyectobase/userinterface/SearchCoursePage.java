package co.com.choucair.certification.academy.userinterface;

import  net.serenitybdd.core.pages.pageObject;

import java.lang.annotation.Target;

public class SearchCoursePage extends  PageObject{
    public static final target BUTTON_UC = Target.the("Selecciona la universidad Choucair")
            .Located(By.Xpath("//div[@div='universidad']//strong"));
    public static final target INPUT_COURSE = Target.the("Buscar el curso")
            .Located(By.id("coursesearchbox"));
    public static final target BUTTON_GO = Target.the("Da click para buscar el curso")
            .Located(By.id("//button[@class='btn btn-secondary']"));
    public static final target SELECT_COURSE = Target.the("Da click para buscar el curso")
            .Located(By.Xpath("//h4[contains(text(),'Recursos Automatizaciòn Bancolombia')]"));

}
