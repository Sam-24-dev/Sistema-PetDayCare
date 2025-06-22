import java.util.ArrayList;
import java.util.List;

public class Cuidador {
    private String nombre;
    private String experiencia;
    private List<Date> disponibilidad;
    private CentroAfiliado centroAfiliado;
    private Reserva reserva; 


      public Cuidador(String nombre, String experiencia) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.disponibilidad = new ArrayList<>(); 
}
    public String getNombre() {
        return nombre;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public List<Date> getDisponibilidad() {
        return disponibilidad;
    }

    public CentroAfiliado getCentroAfiliado() {
        return centroAfiliado;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public void setDisponibilidad(List<Date> disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setCentroAfiliado(CentroAfiliado centroAfiliado) {
        this.centroAfiliado = centroAfiliado;
    } 
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    } 
    public void asignarServicio(Reserva reserva) {
        this.reserva = reserva;
    }
}
