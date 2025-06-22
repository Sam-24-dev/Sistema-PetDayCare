package Administración;

import java.util.Date;

public class PoliticaCancelacion {
    private String id;
    private int plazoSinPenalizacion; // en horas
    private float penalizacionPorcentaje;
    private String descripcion;

    public float calcularPenalizacion(Date fechaCancelacion) {
        return penalizacionPorcentaje;
    }

    public boolean permiteCancelacion() {
        return true;
    }
}