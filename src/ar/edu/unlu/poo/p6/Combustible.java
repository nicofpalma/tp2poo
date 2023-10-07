package ar.edu.unlu.poo.p6;

public enum Combustible {
    NAFTA(3.50),
    GASOIL(2.20),
    KEROSENE(1.50);

    private double precioVenta;

    Combustible(double precioVenta){
        this.precioVenta = precioVenta;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }
}
