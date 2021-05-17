package co.com.choucair.certification.academy.stepdefinitions;

import co.com.choucair.proyectobase.model.AcademyChoucairData;
import co.com.choucair.proyectobase.tasks.Login;
import co.com.choucair.proyectobase.tasks.OpenUp;
import co.com.choucair.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.when;
import net.Serenitybdd.screenplay.GivenWhenthen;
import net.Serenitybdd.screenplay.actors.OnStage;
import net.Serenitybdd.screenplay.actors.OnLineCast;

import java.util.List;
e;

public class ChoucairAcademyStepDefinitions {

@Before
public void setStage () { OnStage.setTheStage(new OnlineCast());}

    @Given("^than andrea wants to learn automation at the academy Choucair$")
    public void thanAndreawantToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData)
    throws Exception{
        co.com.choucair.certification.academy.tasks.Login login;
        OnStage.theActorcalled("Andrea").wasAbleTo(OpenUp.thePage(), co.com.choucair.certification.academy.tasks.Login.
            onThePage(academyChoucairdata.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));

    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizaciònBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData)
            throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciònBancolombia(List<AcademyChoucairData> academyChoucairData)
            throws Exception{
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(co.com.choucair.choucair.certification.academy.questions.Answer.toThe(academyChoucairData.get(0).getStrCourse())));
}


