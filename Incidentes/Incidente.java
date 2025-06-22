package Incidentes;

import java.util.Date;

public class Incidente {
    private String descripcion;
    private Date fecha;
    private boolean resuelto;

    public Incidente(String descripcion, Date fecha, boolean resuelto){
        this.descripcion = descripcion; 
        this.fecha = fecha;
        this.resuelto = resuelto;
    }
    public void marcarResuelto() {
        resuelto = true;
    }
}