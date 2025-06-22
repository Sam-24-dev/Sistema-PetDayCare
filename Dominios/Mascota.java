package Dominios;

import java.util.ArrayList;
import java.util.List;

public class Mascota {
    private String nombre; 
    private String especie; 
    private String raza; 
    private int edad; 
    private String tamaño;
    private String necesidadesEspeciales;
    private String preferenciasTrato;
    private Usuario usuario;
    private List<Reserva> reservas = new ArrayList<>();
    
    public Mascota(String nombre, String especie, String raza, int edad, String tamaño, String necesidadesEspeciales, String preferenciasTrato, Usuario usuario) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
        this.necesidadesEspeciales = necesidadesEspeciales;
        this.preferenciasTrato = preferenciasTrato;
        this.usuario = usuario;
    } 
    public String getNombre() {
        return nombre;
    }  
    public String getEspecie() {
        return especie;
    } 
    public String getRaza() {
        return raza;
    }   
    public int getEdad() {
        return edad;
    }  
    public String getTamaño() {
        return tamaño;
    }
    public String getNecesidadesEspeciales() {
        return necesidadesEspeciales;
    }
    public String getPreferencias_trato() {
        return preferenciasTrato;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public List<Reserva> getReservas() {
        return reservas;
    } 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  
    public void setEspecie(String especie) {
        this.especie = especie;
    } 
    public void setRaza(String raza) {
        this.raza = raza;
    } 
    public void setEdad(int edad) {
        this.edad = edad;
    }    
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    } 
    public void setNecesidadesEspeciales(String necesidadesEspeciales) {
        this.necesidadesEspeciales = necesidadesEspeciales;
    }
    public void setPreferencias_trato(String preferenciasTrato) {
        this.preferenciasTrato = preferenciasTrato;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void agregarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    } 
}
