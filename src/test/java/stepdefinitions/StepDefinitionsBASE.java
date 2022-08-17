package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AbrirURL;
import utils.DataDrivenExcel;

import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class StepDefinitionsBASE {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();


    @Before
    public void set_the_stage() {

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) ingresa a booking para consultar el  alojamiento$")
    public void santiagoIngresaABookingParaConsultarElAlojamiento(String Santiago){
      theActorCalled(Santiago).wasAbleTo(AbrirURL.PaginaDeUTest());

    }


}
