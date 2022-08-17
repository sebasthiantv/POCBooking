package utils;


public class Excel {

    public String rutaExcel;
    public String hojaExcel;
    public boolean contieneCabecera;
    public int filaLeer;

    public String excelRute;
    public String excelRoute1;
    public boolean b;
    public int row;

    public Excel(String rutaExcel, String hojaExcel, boolean contieneCabecera, int filaLeer) {
        super();
        this.rutaExcel = rutaExcel;
        this.hojaExcel = hojaExcel;
        this.contieneCabecera = contieneCabecera;
        this.filaLeer = filaLeer;
    }

    public String getRutaExcel() {
        return rutaExcel;
    }

    public void setRutaExcel(String rutaExcel) {
        this.rutaExcel = rutaExcel;
    }

    public String getHojaExcel() {
        return hojaExcel;
    }

    public void setHojaExcel(String hojaExcel) {
        this.hojaExcel = hojaExcel;
    }

    public boolean isContieneCabecera() {
        return contieneCabecera;
    }

    public void setContieneCabecera(boolean contieneCabecera) {
        this.contieneCabecera = contieneCabecera;
    }

    public int getFilaLeer() {
        return filaLeer;
    }

    public void setFilaLeer(int filaLeer) {
        this.filaLeer = filaLeer;
    }

    public String getExcelRute() {
        return excelRute;
    }

    public void setExcelRute(String excelRute) {
        this.excelRute = excelRute;
    }

    public String getExcelRoute1() {
        return excelRoute1;
    }

    public void setExcelRoute1(String excelRoute1) {
        this.excelRoute1 = excelRoute1;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    }