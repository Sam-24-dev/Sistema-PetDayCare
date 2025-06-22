package Servicios;
import java.util.List;

public abstract class Servicio {
    protected String id;
    protected String tipo;
    protected float precio;
    protected int duracion; // En horas o minutos, según el contexto
    protected List<String> opcionesAdicionales;

    public Servicio(String id, String tipo, float precio, int duracion) {
        this.id = id;
        this.tipo = tipo;
        this.precio = precio;
        this.duracion = duracion;
    }

    // Método que debe implementar cada subclase para validar si una mascota puede recibir el servicio
    public abstract boolean validarCompatibilidad(Mascota mascota);

    // Método que cada subclase implementa para calcular su costo total
    public abstract float calcularCostoEspecifico();

    // Getters y setters
    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public int getDuracion() {
        return duracion;
    }

    public List<String> getOpcionesAdicionales() {
        return opcionesAdicionales;
    }

    public void setOpcionesAdicionales(List<String> opcionesAdicionales) {
        this.opcionesAdicionales = opcionesAdicionales;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setId(String id) {
        this.id = id;
    }
}

