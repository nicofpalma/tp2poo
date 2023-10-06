package ar.edu.unlu.poo.p2;

public class Compra {
    private Paquete paquete;

    private Cliente cliente;

    public Compra(Paquete paquete, Cliente cliente){
        this.paquete = paquete;
        this.cliente = cliente;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
