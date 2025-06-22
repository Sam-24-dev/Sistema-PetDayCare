import java.util.List;

public class Paquete {
    private String id;
    private String nombre;
    private int duracion;
    private float precioDescuento;
    private List<String> tiposServicios;
    private String descripcion;

    public float calcularPrecioTotal() {
        return duracion * precioDescuento;
    }

    public boolean validarServicios() {
        return tiposServicios != null && !tiposServicios.isEmpty();
    }

    // Getters y setters 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public float getPrecioDescuento() {
        return precioDescuento;
    }

    public void setPrecioDescuento(float precioDescuento) {
        this.precioDescuento = precioDescuento;
    }

    public List<String> getTiposServicios() {
        return tiposServicios;
    }

    public void setTiposServicios(List<String> tiposServicios) {
        this.tiposServicios = tiposServicios;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

