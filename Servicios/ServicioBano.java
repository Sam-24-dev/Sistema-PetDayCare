package Servicios;

public class ServicioBano extends Servicio {
    private String tipoShampoo;
    private boolean incluyeSecado;

    public ServicioBano(String id, String tipo, float precio, int duracion, String tipoShampoo, boolean incluyeSecado) {
        super(id, tipo, precio, duracion);
        this.tipoShampoo = tipoShampoo;
        this.incluyeSecado = incluyeSecado;
    }

    @Override
    public boolean validarCompatibilidad(Mascota mascota) {
        return mascota != null; // Se puede personalizar según alergias
    }

    @Override
    public float calcularCostoEspecifico() {
        return precio + (incluyeSecado ? 5.0f : 0.0f);
    }
}
