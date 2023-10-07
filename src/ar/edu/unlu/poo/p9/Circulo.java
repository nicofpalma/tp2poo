package ar.edu.unlu.poo.p9;

public class Circulo extends FiguraGeometrica{
    private double radio;
    public Circulo(double radio){
        this.radio = radio;
    }
    @Override
    public double getArea() {
        return Math.PI * (Math.pow(radio, 2));
    }
}
