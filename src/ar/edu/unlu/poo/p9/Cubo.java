package ar.edu.unlu.poo.p9;

public class Cubo extends Figura3d{
    private double arista;
    public Cubo(double arista){
        this.arista = arista;
    }
    @Override
    public double getArea() {
        return 6 * Math.pow(arista, 2);
    }
    @Override
    public double getVolumen() {
        return Math.pow(arista, 3);
    }
}
