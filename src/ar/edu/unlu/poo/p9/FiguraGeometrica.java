package ar.edu.unlu.poo.p9;

public abstract class FiguraGeometrica {
    public FiguraGeometrica(){}
    public abstract double getArea();
    @Override
    public String toString(){
        return "Tipo de figura: " + this.getClass().getSimpleName();
    }
}
