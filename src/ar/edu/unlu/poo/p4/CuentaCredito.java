package ar.edu.unlu.poo.p4;

import java.util.ArrayList;
import java.util.List;

public class CuentaCredito {
    private double limite;
    private List<Double> compras;
    private List<Double> pagado;

    private static final double INTERES_POR_COMPRA = 0.05;

    public CuentaCredito(double limite) {
        this.limite = limite;
        this.compras = new ArrayList<Double>();
        this.pagado = new ArrayList<Double>();
    }

    /**
     * Registra una nueva compra en caso que todavía quede saldo disponible para compras.
     *
     * @param monto
     * @return boolean: true si la compra fue existosa, false en caso contrario.
     */
    public boolean comprar(double monto) {
        boolean exito = false;
        // monto total a pagar con el recargo del 5%
        double montoTotal = monto * (monto * CuentaCredito.INTERES_POR_COMPRA);

        // monto total es menor o igual al limite de gasto disponible
        if(montoTotal <= limite){
            compras.add(montoTotal);
            limite -= montoTotal;
            exito = true;
        }
        return exito;
    }

    /**
     * Realiza un pago sobre una compra. Si el monto es menor o igual al saldo que queda por pagar de la compra, el pago se registra
     * y la operacion es exitosa devolviendo true.
     * Si el monto es mayor al saldo, entonces la operación no se realiza devolviendo false.
     *
     * @param monto: cantidad a pagar.
     * @param indiceCompra: el numero de indice de la compra sobre la cual se requiere realizar un pago.
     * @return
     */
    public boolean pagar(double monto, int indiceCompra) {
        boolean exito = false;
        if(indiceCompra >= 0 && indiceCompra < compras.size()){
            double saldoPendiente = compras.get(indiceCompra) - pagado.get(indiceCompra);

            if(monto <= saldoPendiente){
                pagado.set(indiceCompra, pagado.get(indiceCompra) + monto);
                limite += monto;
                exito = true;
            }
        }
        return exito;
    }

    /**
     * Retorna el saldo que queda por pagar de una compra, incluyendo el interes.
     *
     * @param indiceCompra
     * @return
     */
    public double getSaldoDeudorCompra(int indiceCompra) {
        double saldoDeudor = 0;
        if(indiceCompra <= 0 && indiceCompra < compras.size()){
            saldoDeudor = compras.get(indiceCompra) - pagado.get(indiceCompra);
            saldoDeudor += (saldoDeudor * INTERES_POR_COMPRA);
        }
        return saldoDeudor;
    }

    /**
     * Devuelve el saldo deudor total teniendo en cuenta todas las compras impagas.
     * @return double
     */
    public double getSaldoDeudor() {
        double saldoDeudorTotal = 0;
        for (int i = 0; i < compras.size(); i++) {
            double saldoPendiente = compras.get(i) - pagado.get(i);
            saldoPendiente += (saldoPendiente * INTERES_POR_COMPRA);
            saldoDeudorTotal += saldoPendiente;
        }

        return saldoDeudorTotal;
    }

    /**
     * Devuelve el monto disponible para compras de la cuenta teniendo en cuenta todas las compras
     * realizadas que quedan por pagar, sin tener en cuenta las que deben solo el interes.
     * @return double: el saldo disponible para realizar compras.
     */
    public double getMontoDisponibleParaCompras() {
        double saldoDisponible = limite;
        for (int i = 0; i < compras.size(); i++) {
            double saldoPendiente = compras.get(i) - pagado.get(i);
            if(saldoPendiente > 0){
                saldoDisponible -= saldoPendiente;
            }
        }

        return saldoDisponible;
    }

}

