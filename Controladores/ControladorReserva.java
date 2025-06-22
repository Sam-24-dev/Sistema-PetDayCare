package Controladores;

import Pagos.PagoService;
import Dominios.Reserva;

public class ControladorReserva {
    private DisponibilidadService disponibilidadService;
    private PagoService pagoService;

    public Reserva crearReserva (Object datos){
        return null; }   

    public boolean validarReserva(Reserva reserva){
        return true;
    }

    public void confirmarReserva(Reserva reserva){

    }
}
