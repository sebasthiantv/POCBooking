package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class items {



    public static final Target TXT_DESTINO = Target.the("Ingreso DESTINO")
            .located(By.xpath("//input[@id='ss']"));

    public static final Target CALENDARIO = Target.the("CLICK CALENDARIO")
            .locatedBy("//form[@id='frm']//div[2]//div[2]/div/div/div/div/span");

    public static final Target INICIO_CALENDARIO = Target.the("FECHA INICIO")
            .locatedBy("//form[@id='frm']//div[2]//div[3]/div[1]//tr[3]/td[7]");

    public static final Target FIN_CALENDARIO = Target.the("FECHA FIN")
            .locatedBy("//form[@id='frm']//div[2]//div[3]/div[1]//tr[4]/td[2]");

    public static final Target VIAJEROS = Target.the(" VIAJEROS")
            .locatedBy("//*[@id='xp__guests__toggle']/span[2]");

    public static final Target UNO_VIAJEROS = Target.the("CANTIDAD DE VIAJEROS")
            .locatedBy("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[1]/div/div[2]/button[1]/span");

    public static final Target DOS_VIAJEROS = Target.the("CANTIDAD DE VIAJEROS")
            .locatedBy("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[1]/div/div[2]/button[2]/span");

    public static final Target FAMILIA_VIAJEROS = Target.the("FAMILIAR  VIAJEROS")
            .locatedBy("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[2]/div/div[2]/button[2]");

    public static final Target NINO1_VIAJEROS = Target.the("FAMILIAR  VIAJEROS")
            .locatedBy("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[3]/select[1]/option[4]");

    public static final Target NINO2_VIAJEROS = Target.the("FAMILIAR  VIAJEROS")
            .locatedBy("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[3]/select[2]/option[8]");



    public static final Target BTN_BUSQUEDA = Target.the("BUSCAR")
            .locatedBy("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button");

    public static final Target TEXT_HOSPEDAJE = Target.the("LUGAR")
            .locatedBy("//h1[contains(text(),' alojamientos encontrados')]");


    }
