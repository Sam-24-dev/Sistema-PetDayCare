package Dominios;

import java.util.ArrayList;
import java.util.List;
import Administración.Administrador;
import Administración.PoliticaCancelacion;
import Dominios.Reserva; 
import Servicios.Servicio;
import Dominios.Cuidador; 

public class CentroAfiliado {
    private String nombre; 
    private String direccion; 
    private String capacidad;
    private List<String> tipoMascotasAdmitidas; 
    private List<Administrador> administradores = new ArrayList<>();
    private List<Servicio> servicios = new ArrayList<>();
     private List<PoliticaCancelacion> politicas = new ArrayList<>();
     private List<Cuidador> cuidadores = new ArrayList<>();
     private List<Reserva> reservas = new ArrayList<>();


      public CentroAfiliado(String nombre, String direccion, String capacidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.tipoMascotasAdmitidas = new ArrayList<>(); 
    }

    public String getNombre() {
        return nombre;
    } 
    public String getDireccion() {
        return direccion;
    }
    public String getCapacidad() {
        return capacidad;
    }
    public List<String> getTipoMascotasAdmitidas() {
        return tipoMascotasAdmitidas;
    }
    public List<Administrador> getAdministradores() {
        return administradores;
    }
    public List<Servicio> getServicios() {
        return servicios;
    }
    public List<PoliticaCancelacion> getPoliticas() {
        return politicas;
    }
    public List<Cuidador> getCuidadores() {
        return cuidadores;
    }
    public List<Reserva> getReservas() {
        return reservas;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    public void setTipoMascotasAdmitidas(List<String> tipoMascotasAdmitidas) {
        this.tipoMascotasAdmitidas = tipoMascotasAdmitidas;
    }
    public void setAdministradores(List<Administrador> administradores) {
        this.administradores = administradores;
    }
    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
    public void setPoliticas(List<PoliticaCancelacion> politicas) {
        this.politicas = politicas;
    }
    public void setCuidadores(List<Cuidador> cuidadores) {
        this.cuidadores = cuidadores;
    }
    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
    public void configurarServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    } 
    public void gestionarPromociones(List<PoliticaCancelacion> politicas) {
        this.politicas = politicas;
    } 
    public void gestionarHistorialReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    } 
}
