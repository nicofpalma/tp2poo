package ar.edu.unlu.poo.p6;

public class Expendedor {
    private int idExpendedor;
    private Combustible combustible;
    private static int contadorId = 0;

    public Expendedor(Combustible combustible){
        this.combustible = combustible;
        this.idExpendedor = ++contadorId;
    }

    public String toString(){
        return  "ID EXPENDEDOR: " + contadorId + "\n"
                + "COMBUSTIBLE: " + combustible.toString() + "\n"
                + "PRECIO COMBUSTIBLE (x litro): $" + combustible.getPrecioVenta();
    }
    public Combustible getCombustible() {
        return combustible;
    }
    public int getIdExpendedor() {
        return idExpendedor;
    }
}
