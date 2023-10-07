package ar.edu.unlu.poo.p9;

public class Cuadrado extends FiguraGeometrica{
    private double lado;
    public Cuadrado(double lado){
        this.lado = lado;
    }
    @Override
    public double getArea() {
        return lado * lado;
    }
}
