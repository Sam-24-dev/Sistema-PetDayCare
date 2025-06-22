package Servicios;
import java.util.ArrayList;
import java.util.List;
import dominio.CentroAfiliado;
import Interfaces.Reservable;
import dominio.Paquete;
import dominio.Reserva; 
import dominio.Mascota; 

public abstract class Servicio implements Reservable{
    private String nombre; 
    private String id;
    private String tipo;
    private float precio;
    private int duracion; // En horas o minutos, según el contexto
    private List<String> opcionesAdicionales;
    private List<Paquete> paquetes;
    private List<Reserva> reservas = new ArrayList<>();
    private CentroAfiliado centroAfiliado; 

      public Servicio(String id, String tipo, float precio, int duracion) {
        this.id = id;
        this.tipo = tipo;
        this.precio = precio;
        this.duracion = duracion;
        this.opcionesAdicionales = new ArrayList<>(); 
      }
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
    public List<Paquete> getPaquetes() {
        return paquetes; 
    } 
    public List<Reserva> getReservas() {
        return reservas; 
    }
    public CentroAfiliado getCentroAfiliado() {
        return centroAfiliado; 
    } 
    public void setId(String id) {
        this.id = id; 
    }
    public void setTipo(String tipo) {
        this.tipo = tipo; 
    }
    public void setPrecio(float precio) {
        this.precio = precio; 
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion; 
    }
    public void setOpcionesAdicionales(List<String> opcionesAdicionales) {
        this.opcionesAdicionales = opcionesAdicionales; 
    }
    public void setPaquetes(List<Paquete> paquetes) {
        this.paquetes = paquetes; 
    }
    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas; 
    }
    public void setCentroAfiliado(CentroAfiliado centroAfiliado) {
        this.centroAfiliado = centroAfiliado; 
    }
    public abstract boolean validarCompatibilidad(Mascota mascota);
    public abstract float calcularCostoEspecifico(); 


}

