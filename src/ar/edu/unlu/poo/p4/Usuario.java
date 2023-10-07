package ar.edu.unlu.poo.p4;

public class Usuario {
    private Cuenta cuenta;
    private CuentaCredito cuentaCredito;

    public Usuario(Cuenta cuenta, CuentaCredito cuentaCredito) {
        this.cuenta = cuenta;
        this.cuentaCredito = cuentaCredito;
    }

    public Usuario(Cuenta cuenta) {
        this(cuenta, null);
    }

    /**
     * Muestra por consola el estado de su cuenta, imprime:
     * 	a. El saldo
     *  b. El limite de giro en descubierto y en parentesis el monto girado en descubierto.
     *  c. El monto total invertido y entre parentesis el interes a ganar.
     *  d. El monto disponible para compras a credito y la deuda total a pagar segun las compras.
     */
    public void mostrarEstado() {
        System.out.println("-----------------------");
        System.out.println("");
        System.out.println("Saldo: "+this.cuenta.getSaldo());
        System.out.println("Giro en descubierto: "+this.cuenta.getLimiteGiroDescubierto()+"(GiroDescubierto: "+this.cuenta.getGiroDescubierto()+")");
        System.out.println("Inversiones: "+this.cuenta.getMontoInvertido()+" (Interés a ganar: "+this.cuenta.getInteresAGanar()+")");
        System.out.println("");
        System.out.println("--- Cuenta crédito ----");
        System.out.println("");
        System.out.println("Disponible para compras: "+this.cuentaCredito.getMontoDisponibleParaCompras());
        System.out.println("Saldo deudor: "+this.cuentaCredito.getSaldoDeudor());
    }

    /**
     * Intenta realizar un gasto sobre la cuenta. En caso de que el monto sea mayor al saldo, emite un mensaje que no se puede
     * realizar el gasto porque se va a girar en descubierto.
     * @param monto El monto a gastar
     * @return exito Un booleano que marca si se pudo realizar el gasto o no
     */
    public boolean realizarGasto(double monto) {
        if(monto > this.cuenta.getSaldo()) {
            System.out.println("No se puede realizar el gasto, se va a girar en descubierto..");
            return false;
        }else {
            return this.cuenta.gastar(monto);
        }
    }

    /**
     * Intenta realizar un gasto sobre la cuenta por mas que se vaya a girar en descubierto
     * @param monto
     * @return
     */
    public boolean realizarGastoYGirar(double monto) {
        return this.cuenta.gastar(monto);
    }

    public void realizarDeposito(double monto){
        cuenta.depositar(monto);
    }

    public boolean realizarInversion(double monto){
        return cuenta.invertir(monto);
    }

    public double recuperarInversionRealizada(){
        return cuenta.recuperarInversion();
    }

    public boolean comprarConCredito(double monto){
        return cuentaCredito.comprar(monto);
    }

    public boolean pagarConCredito(double monto, int idCompra){
        return cuentaCredito.pagar(monto, idCompra);
    }

    public double obtenerSaldoDeudorCompraCredito(int idCompra){
        return cuentaCredito.getSaldoDeudorCompra(idCompra);
    }

    public double obtenerSaldoDeudorCreditoTotal(){
        return cuentaCredito.getSaldoDeudor();
    }

    public double obtenerMontoDisponibleParaCompras(){
        return cuentaCredito.getMontoDisponibleParaCompras();
    }
}


