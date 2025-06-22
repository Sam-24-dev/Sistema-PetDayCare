package Servicios;
import java.sql.Time;
public class ServicioGuarderia extends Servicio {
    private int capacidadMaxima;
    private Time horarioInicio;
    private Time horarioFin;

    public ServicioGuarderia(String id, String tipo, float precio, int duracion, int capacidadMaxima, Time horarioInicio, Time horarioFin) {
        super(id, tipo, precio, duracion);
        this.capacidadMaxima = capacidadMaxima;
        this.horarioInicio = horarioInicio;
        this.horarioFin = horarioFin;
    }

    @Override
    public boolean validarCompatibilidad(Mascota mascota) {
        return mascota != null && mascota.getEdad() >= 0.5; // Mayor a 6 meses
    }

    @Override
    public float calcularCostoEspecifico() {
        return precio * duracion;
    }

    // Getters y setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Time getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Time horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Time getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(Time horarioFin) {
        this.horarioFin = horarioFin;
    }
}

