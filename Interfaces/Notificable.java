package Interfaces;

import Incidentes.Notificacion;

public interface Notificable {
    void enviarNotificacion(String mensaje);
    void recibirNotificacion(Notificacion notificacion);
}
