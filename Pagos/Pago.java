package Pagos;

import java.util.Date;

public class Pago {
    private String id;
    private float monto;
    private Date fecha;
    private String estado; 
    private String metodoPago;

    public Pago(String id, float monto, Date fecha, String estado, String metodoPago){
        this.id = id;
        this.monto = monto;
        this.fecha = fecha;
        this.estado = estado;
        this.metodoPago = metodoPago;
    }

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
