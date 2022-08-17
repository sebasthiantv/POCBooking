package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.items;
public class Respuesta implements Question<Boolean> {

    private final String question;

    public Respuesta(String question) {
        this.question = question;
    }

    public static Respuesta toThe(String question) {
        return new Respuesta(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return items.TEXT_HOSPEDAJE.of(question).resolveFor(actor).isPresent();

    }
}
