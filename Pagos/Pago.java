package Pagos;

import java.util.Date;

public class Pago {
    private String id;
    private float monto;
    private Date fecha;
    private String estado; 
    private String metodoPago;

    public boolean autorizar() {
        estado = "aprobado";
        return true;
    }

    public void procesar() {
        System.out.println("Procesando pago...");
    }

    public void reembolsar() {
        estado = "reembolsado";
        System.out.println("Pago reembolsado.");
    }
}
