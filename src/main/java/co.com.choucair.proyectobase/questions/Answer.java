package co.com.choucair.choucair.certification.academy.questions;

import co.com.choucair.certification.academy.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import javax.xml.soap.Text;


public class Answer implements  Question<Boolean>{
    private string question;

    public Answer(String question){
        this.question = question;
}
public static Answer toThe(String question){
        return new Answer(question);
}

@Override
    public Boolean answerdBy(Actor actor){
        boolean result;
        String nameCourse= Text.of(SecarhCoursePage.NAME_COURSE).vieweBy(actor.asString());
        if (question.equals(nameCourse)){
            result = true
        }else {
            result = false;
        }
        return result;
    }


}
