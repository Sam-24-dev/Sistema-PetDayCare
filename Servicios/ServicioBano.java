package Servicios;

import Dominios.Mascota;

public class ServicioBano extends Servicio {
    private String tipoShampoo;
    private boolean incluyeSecado;

    public ServicioBano(String id, String tipo, float precio, int duracion, String tipoShampoo, boolean incluyeSecado) {
        super(id, tipo, precio, duracion);
        this.tipoShampoo = tipoShampoo;
        this.incluyeSecado = incluyeSecado;
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
