package co.com.choucair.certification.academy.tasks;

import co.com.choucair.proyectobase.userinterface.ChoucairAcademyPage;
import javafx.concurrent.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.perfomable;
import net.serenitybdd.screenplay.task;



public class OpenUp implements task {
    private co.com.choucair.proyectobase.userinterface.ChoucairAcademyPage ChoucairAcademyPage ;
    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public  <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Open.browserOn(choucairAcademypage));

}
}
