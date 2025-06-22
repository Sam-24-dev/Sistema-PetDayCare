package Controladores;

import java.util.List;
import java.sql.Date;

import Servicios.Servicio;
import Dominios.CentroAfiliado;
import Dominios.Cuidador;

public class DisponibilidadService {
    public boolean validarDisponibilidad(Servicio servicio, Date fecha){
        return false;}
    public int verificarCapacidad(CentroAfiliado centro){
        return 0;
    }
    public List<Cuidador> consultarPersonalDisponible(){ return null;}
}
