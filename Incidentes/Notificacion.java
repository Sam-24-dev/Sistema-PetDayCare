package Incidentes;

import java.util.Date;

public class Notificacion {
    private String tipo;
    private String contenido;
    private Date fechaEnvio;

    public void enviarPorCorreo() {
        System.out.println("Enviando notificación: " + contenido);
    }
}