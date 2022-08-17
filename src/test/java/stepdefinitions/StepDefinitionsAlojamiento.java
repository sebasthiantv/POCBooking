package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import questions.Respuesta;
import tasks.Alojamiento2Per;
import utils.DataDrivenExcel;
import utils.Excel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class StepDefinitionsAlojamiento {

    DataDrivenExcel dataDriverExcel = new DataDrivenExcel();
    Map<String, String> data = new HashMap<>();




    @When("^ingresar al filtro de busqueda los datos requeridos (\\d+)$")
    public void ingresarEnElFiltroDeBusquedaLosDatosRequeridos(int row, DataTable dataExcel){

        List<Map<String, String>> dataFeature = dataExcel.asMaps(String.class, String.class);
        Excel excel = new Excel(
                dataFeature.get(0).get("ExcelRoute"),
                dataFeature.get(0).get("sheet"),
                true, row);
        data = dataDriverExcel.leerExcel(excel);

        List<String> form = new ArrayList<String>(data.values());

        theActorInTheSpotlight().attemptsTo(Alojamiento2Per.enLaPagingConMis(form));
    }

    @Then("^se visualizara el listado de alojamientos disponibles para (.*) personas$")
    public void seVisualizaraElListadoDeAlojamientosDisponiblesParaPersonas(String mensaje)  {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Respuesta.toThe(mensaje)));
    }

}
