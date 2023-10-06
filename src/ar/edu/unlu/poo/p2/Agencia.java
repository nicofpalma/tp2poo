package ar.edu.unlu.poo.p2;

import java.util.*;

public class Agencia {
    private String nombre;
    private List<Paquete> paquetes;
    private List<Cliente> clientes;
    private List<Compra> compras;
    public Agencia(String nombre){
        this.nombre = nombre;
        this.paquetes = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.compras = new ArrayList<>();
    }

    public void agregarPaquete(Paquete paquete) {
        paquetes.add(paquete);
    }

    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public String verListaDeClientes(){
        String listaDeClientes = "--- LISTA COMPLETA DE CLIENTES ---\n";
        for (int i = 0; i < clientes.size(); i++) {
            listaDeClientes += clientes.get(i) + "\n";
        }

        return listaDeClientes + "\n------------\n";
    }

    public boolean comprarPaquete(String destinoPaquete, Cliente cliente){
        boolean exito = false;
        for (int i = 0; i < paquetes.size(); i++) {
            if(paquetes.get(i).getDestino() == destinoPaquete){
                Compra compra = new Compra(paquetes.get(i), clientes.get(i));
                compras.add(compra);
                exito = true;
            }
        }
        return exito;
    }

    public String verListaDePaquetes(){
        String paquetesListados = "--- LISTA COMPLETA DE PAQUETES A DISPOSICIÓN ---\n";

        for (int i = 0; i < paquetes.size(); i++) {
            paquetesListados += paquetes.get(i);
        }

        return paquetesListados;
    }

    public String verListaDeProveedores(){
        Set<Proveedor> proveedoresUnicos = new HashSet<>();

        for(Paquete paquete : paquetes){
            proveedoresUnicos.add(paquete.getTransporte());
            proveedoresUnicos.add(paquete.getHospedaje());
            proveedoresUnicos.add(paquete.getExcursiones());
        }

        String listaProveedores = "--- LISTA DE PROVEEDORES --- \n";

        for(Proveedor proveedor : proveedoresUnicos){
            listaProveedores += proveedor;
        }

        return listaProveedores +"-------------------\n";
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public String listadoDeComprasPorDestino(){
        List<Compra> compras = this.compras;
        Map<String, Integer> comprasPorDestino = new HashMap<>();
        String destinoFavorito = "";
        int maxCantCompras = 0;

        for(Compra compra : compras) {
            String destino = compra.getPaquete().getDestino();

            int comprasParaEsteDestino = comprasPorDestino.getOrDefault(destino, 0) + 1;
            comprasPorDestino.put(destino, comprasParaEsteDestino);

            if(comprasParaEsteDestino > maxCantCompras) {
                maxCantCompras = comprasParaEsteDestino;
                destinoFavorito = destino;
            }
        }

        String informe = "--- LISTA DE COMPRAS POR DESTINO ---\n";

        for(Map.Entry<String, Integer> destino : comprasPorDestino.entrySet()){
            informe += destino.getKey() + ": " + destino.getValue() + " compras.\n";
        }

        return informe +
                "\nEl destino favorito (el más comprado), es " + destinoFavorito + " con " + maxCantCompras + " compras.";
    }

    public String destinoFavorito(){
        return "";
    }
}
