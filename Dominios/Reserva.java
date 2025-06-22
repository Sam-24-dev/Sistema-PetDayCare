package Dominios;

import java.sql.Date;
import java.util.List;

import Enums.EstadoReserva;
import Incidentes.Incidente;
import Interfaces.Cancelable;
import Pagos.Pago;
import Servicios.Servicio; 



public class Reserva implements Cancelable {
    private Date fechaInicio;
    private Date fechaFin; 
    private EstadoReserva estado; 
    private boolean  recurrente; 
    private String intervaloRecurrencia;
    private Usuario usuario;
    private Mascota mascota;
    private Servicio servicio;
    private Pago pago;
    private Paquete paquete;
    private List<Incidente> incidentes;
    private Cuidador cuidador;
    
     public Reserva(Date fechaInicio, Date fechaFin, EstadoReserva estado, boolean recurrente, String intervaloRecurrencia) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.recurrente = recurrente;
        this.intervaloRecurrencia = intervaloRecurrencia; 
     }

    public Date getFechaInicio() {
        return fechaInicio; 
    } 
    public Date getFechaFin() {
        return fechaFin; 
    } 
    public EstadoReserva getEstado() {
        return estado; 
    } 
    public boolean isRecurrente() {
        return recurrente; 
    } 
    public String getIntervaloRecurrencia() {
        return intervaloRecurrencia; 
    } 
    public Usuario getUsuario() {
        return usuario; 
    } 
    public Mascota getMascota() {
        return mascota; 
    }
    public Servicio getServicio() {
        return servicio; 
    }
    public Pago getPago() {
        return pago; 
    }
    public Paquete getPaquete() {
        return paquete; 
    }
    public List<Incidente> getIncidentes() {
        return incidentes; 
    }
    public Cuidador getCuidador() {
        return cuidador; 
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio; 
    }
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin; 
    }
    public void setEstado(EstadoReserva estado) {
        this.estado = estado; 
    }
    public void setRecurrente(boolean recurrente) {
        this.recurrente = recurrente; 
    }
    public void setIntervaloRecurrencia(String intervaloRecurrencia) {
        this.intervaloRecurrencia = intervaloRecurrencia; 
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario; 
    }
    public void setMascota(Mascota mascota) {
        this.mascota = mascota; 
    }
    public void setServicio(Servicio servicio) {
        this.servicio = servicio; 
    }
    public void setPago(Pago pago) {
        this.pago = pago; 
    }
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete; 
    }
    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes; 
    }
    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador; 
    }
    
      public void seleccionarCuidador(Cuidador cuidador) {
        this.cuidador = cuidador; 
      }
      public void validarDisponibilidad() {
        // Lógica para validar la disponibilidad del cuidador
        if (cuidador != null) {
            // Verificar si el cuidador está disponible en las fechas de la reserva
        }
    }
    public boolean procesarPago() {
        // Lógica para procesar el pago de la reserva
        if (pago != null) {
            // Procesar el pago y actualizar el estado de la reserva
            return true; // Placeholder para indicar que el pago fue exitoso
        }
        return false; // Indicar que no se pudo procesar el pago
    } 
    public void confirmarReserva() {
        // Lógica para confirmar la reserva
        if (procesarPago()) {
            this.estado = EstadoReserva.CONFIRMADA; // Actualizar el estado a CONFIRMADA
        } else {
            this.estado = EstadoReserva.PENDIENTE; // Mantener el estado PENDIENTE si el pago falla
        }
    } 
    
    @Override
    public void cancelar() {
        // Lógica para cancelar la reserva
    }

    @Override
    public float calcularPenalizacion() {
        // Lógica para calcular la penalización por cancelación
        return 0.0f; // Placeholder
    } 
    
}

