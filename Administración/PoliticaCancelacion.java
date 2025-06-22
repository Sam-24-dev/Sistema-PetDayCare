package Administración;

import java.util.Date;

public class PoliticaCancelacion {
    private String id;
    private int plazoSinPenalizacion; // en horas
    private float penalizacionPorcentaje;
    private String descripcion;

    public PoliticaCancelacion(String id, int plazoSin, float porcentaje, String descripcion){
        this.id = id;
        this.plazoSinPenalizacion = plazoSin;
        this.penalizacionPorcentaje = porcentaje;
        this.descripcion = descripcion;
    }
    public float calcularPenalizacion(Date fechaCancelacion) {
        return penalizacionPorcentaje;
    }

    public boolean permiteCancelacion() {
        return true;
    }
}