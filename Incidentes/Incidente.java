package Incidentes;

import java.util.Date;

public class Incidente {
    private String descripcion;
    private Date fecha;
    private boolean resuelto;

    public void marcarResuelto() {
        resuelto = true;
    }
}