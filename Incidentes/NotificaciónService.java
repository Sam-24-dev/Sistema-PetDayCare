package Incidentes;

import Dominios.Reserva;
import Dominios.Usuario;

public class NotificaciónService {
    public void enviarNotificacion(Usuario usuario, String mensaje){}
    public Notificacion crearNotificacion(String tipo, String contenido){
        return new Notificacion(tipo, contenido);
    }
    public void programarRecordatorio(Reserva reserva) {}
}
