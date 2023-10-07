package ar.edu.unlu.poo.p9;

public class Tetraedro extends Figura3d{
    private double arista;
    public Tetraedro(double arista){
        this.arista = arista;
    }

    @Override
    public double getArea() {
        return Math.pow(arista, 2) * Math.sqrt(3);
    }

    @Override
    public double getVolumen() {
        return Math.pow(arista, 3) * (Math.sqrt(2)/12);
    }
}
