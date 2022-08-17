package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.Excel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Respuesta;
import tasks.AbrirURL;
import tasks.Alojamiento;
import utils.DataDrivenExcel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class StepDefinitionsUno {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();



    @When("^ingresar en el filtro de busqueda los datos requeridos (\\d+)$")
    public void ingresarEnElFiltroDeBusquedaLosDatosRequeridos(int row, DataTable dataExcel){

        List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
        Excel excel = new Excel(
                dataFeature.get(0).get("ExcelRoute"),
                dataFeature.get(0).get("sheet"),
                true, row);
        data = dataDriverExcel.leerExcel(excel);

        List<String> form = new ArrayList<String>(data.values());

        theActorInTheSpotlight().attemptsTo(Alojamiento.enLaPagingConMis(form));
    }

    @Then("^Debera ver el listado de alojamientos disponibles para (.*) persona$")
    public void deberaVerElListadoDeAlojamientosDisponiblesParaPersona(String mensaje)  {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Respuesta.toThe(mensaje)));
    }

}
