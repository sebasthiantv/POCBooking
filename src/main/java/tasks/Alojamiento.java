package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.items;

import java.util.List;

public class Alojamiento implements Task {


    private List<String> form;



    @Override
    public <T extends Actor> void performAs(T actor) {



        actor.attemptsTo(

                Enter.theValue(form.get(1)).into(items.TXT_DESTINO),
                Click.on(items.CALENDARIO),
                Click.on(items.INICIO_CALENDARIO),
                Click.on(items.FIN_CALENDARIO),
                Click.on(items.VIAJEROS),
                Click.on(items.UNO_VIAJEROS),
                Click.on(items.BTN_BUSQUEDA)


        );
    }

    public Alojamiento(List<String> form2) {

        this.form = form2;

    }

    public static Alojamiento enLaPagingConMis(List<String> form2) {

        return new Alojamiento(form2);

    }
}
