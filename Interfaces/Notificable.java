package Interfaces;

import Incidentes.Notificacion;

public interface Notificable {

    
      public void enviarNotificación(String mensaje);
      public void recibirNotificación(Notificacion notificación);
}
