package Servicios;

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
    public boolean validarCompatibilidad(Mascota mascota) {
        return mascota != null && (mascota.getTamano().equalsIgnoreCase("grande") || distancia <= 5.0f);
    }

    @Override
    public float calcularCostoEspecifico() {
        return precio + (distancia * 0.5f);
    }

    // Getters y setters
    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
}

