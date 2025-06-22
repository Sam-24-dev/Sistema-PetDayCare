package Administración;

public class Administrador {
    private String nombre;
    private String correo;

    public Administrador(String nombre, String correo){
        this.nombre = nombre;
        this.correo = correo;
    }

    public void gestionarCentro() {
        System.out.println("Centro gestionado por " + nombre);
    }

    public void configurarPoliticas() {
        System.out.println("Políticas configuradas por " + nombre);
    }
}
