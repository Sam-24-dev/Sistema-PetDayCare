package Pagos;

import java.util.Date;

public class Promocion {
    private String id;
    private String nombre;
    private float porcentaje;
    private Date fechaInicio;
    private Date fechaFin;
    private boolean activa;

    public boolean validarVigencia() {
        Date hoy = new Date();
        return activa && hoy.after(fechaInicio) && hoy.before(fechaFin);
    }

    public float aplicarDescuento(float precio) {
        if (validarVigencia()) {
            return precio * (1 - porcentaje / 100);
        }
        return precio;
    }
}