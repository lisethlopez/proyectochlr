package co.com.choucair.certification.academy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;





public class Login implements task {

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    private String strUser;
    private String strPassword;
    public static Login onThePage(String strUser, String strPassword){
        return task.instrumented(Login.class,srtuser,SrtPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("srtUser").into(ChoucairLoginPage.USER),
                Enter.theValue(("srtPassword")).into(ChoucairLoginPage.PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );



}
}
