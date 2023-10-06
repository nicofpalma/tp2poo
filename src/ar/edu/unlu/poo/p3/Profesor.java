package ar.edu.unlu.poo.p3;

public class Profesor {
    private String nombre;
    private String apellido;
    private int cobroMensual;
    public Profesor(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cobroMensual = 0;
    }
    public String toString(){
        return nombre + " " + apellido;
    }
    public String getNombre() {
        return nombre;
    }

    public int getCobroMensual() {
        return cobroMensual;
    }

    public void sumarCobroMensual(){
        cobroMensual += 10;
    }

    public String getApellido() {
        return apellido;
    }
}
