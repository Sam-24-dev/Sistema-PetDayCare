package Servicios;
import java.sql.Time;

import dominio.Mascota;
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
    

    @Override
    public boolean validarDisponibilidad() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validarDisponibilidad'");
    }

    @Override
    public float calcularCosto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularCosto'");
    }

    @Override
    public boolean validarCompatibilidad(Mascota mascota) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'validarCompatibilidad'");
    }

    @Override
    public float calcularCostoEspecifico() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularCostoEspecifico'");
    }

    
    
}

