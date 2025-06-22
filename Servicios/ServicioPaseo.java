package Servicios;

import dominio.Mascota;

public class ServicioPaseo extends Servicio {

    private float distancia; // kilómetros(km)
    private String tipoTerreno;
    private int duracionMinutos;

    public ServicioPaseo(String id, String tipo, float precio, int duracion, float distancia, String tipoTerreno, int duracionMinutos) {
        super(id, tipo, precio, duracion);
        this.distancia = distancia;
        this.tipoTerreno = tipoTerreno;
        this.duracionMinutos = duracionMinutos;
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

