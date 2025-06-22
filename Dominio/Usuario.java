

import java.util.ArrayList;
import java.util.List;
import Pagos.Promocion;
import Incidentes.Notificacion; // Asegúrate de que la ruta del paquete sea correcta

public class Usuario implements Interfaces.Notificable {

    private String nombre;
    private String  correo;
    private String telefono;
    private String direccion;
    private List<Mascota> mascotas = new ArrayList<>(); 
    private List<Reserva> reservas = new ArrayList<>();
    private List<Promocion> promociones = new ArrayList<>();


        public Usuario(String nombre, String correo, String telefono, String direccion) {
            this.nombre = nombre;
            this.correo = correo;
            this.telefono = telefono;
            this.direccion = direccion;
        }
    public String getNombre() { 
        return nombre; 
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

     public void registrarMascota() {
            Mascota nuevaMascota = new Mascota(correo, correo, correo, 0, correo, correo, correo, null);
            // Lógica para registrar la nueva mascota
            mascotas.add(nuevaMascota); 
     }
     public void reservarServicio() {
            Reserva nuevaReserva = new Reserva(null, null, null, false, correo);
            // Lógica para reservar un servicio
            reservas.add(nuevaReserva); 
     }  
       public List<Reserva> consultarReserva() {
        return this.reservas;
    }
     public boolean validarCredenciales(){
        // Lógica para validar las credenciales del usuario
        return true; 
     }

     public List<Mascota> obtenerMascotas() {
        return this.mascotas;
    }
    @Override
    public void recibirNotificación(Notificacion notificacion) {
        // TODO: Implementar la lógica para recibir una notificación
        System.out.println("Notificación recibida: " + notificacion);
    }

    @Override
    public void enviarNotificación(String mensaje) {
        // TODO: Implementar la lógica para enviar una notificación
        System.out.println("Enviando notificación: " + mensaje);
    }
}