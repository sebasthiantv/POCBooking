package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.PaginaInicial;

public class AbrirURL implements Task {

    private PaginaInicial paginaInicioUTest;

    public static AbrirURL PaginaDeUTest () {
        return Tasks.instrumented(AbrirURL.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaInicioUTest));
    }
}
