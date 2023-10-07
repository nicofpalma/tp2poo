package ar.edu.unlu.poo.p4;

import java.time.LocalDate;
public class Cuenta {
    private double saldo;
    private double limiteGiroDescubierto;
    private double giroDescubierto;
    private double saldoInvertido;
    private static final double INTERES_POR_INVERSION = 0.4;
    private static final int PLAZO_DIAS_INVERSION = 60;
    private LocalDate fechaInversion;
    private boolean precancelarInversion;

    public Cuenta(double saldo, double limiteGiroDescubierto, boolean precancelarInversion) {
        this(saldo, limiteGiroDescubierto);
        this.precancelarInversion = precancelarInversion;
    }

    public Cuenta(double saldo, double limiteGiroDescubierto) {
        this.saldo = saldo;
        this.limiteGiroDescubierto = limiteGiroDescubierto;
        this.giroDescubierto = 0;
        this.saldoInvertido = 0;
        this.fechaInversion = null;
    }

    /**
     * Dado un monto genera un gasto en la cuenta: quita del saldo el monto a gastar, si el monto es mayor
     * al saldo entonces gira en descubierto (siempre y cuando todavía quede límite).
     * Si (saldo + limite descubierto disponible) < monto, entonces la operacion no se realiza y devuelve false.
     * @param monto: el monto a gastar
     * @return boolean: indica si la operación fué exitosa.
     */

    public boolean gastar(double monto) {
        boolean res = false;
        if ((this.saldo + saldoInvertido + (this.limiteGiroDescubierto-this.giroDescubierto)) >= monto) {
            if (this.saldo < monto) {
                //Giro en descubierto
                if(precancelarInversion){
                    double saldoInvertidoRecuperado = recuperarInversion();
                    if(monto < saldo + saldoInvertidoRecuperado){
                        saldo += saldoInvertidoRecuperado;
                        saldo -= monto;
                    } else {
                        saldo += saldoInvertidoRecuperado;
                        giroDescubierto += monto - saldo;
                        saldo = 0;
                    }
                } else {
                    this.giroDescubierto += monto - this.saldo;
                    this.saldo = 0;
                }
            }else {
                // El saldo me alzanza para el gasto
                this.saldo -= monto;
            }
            res = true;
        }

        return res;
    }

    /**
     * Deposita el monto en la cuenta. Si existe giro en descubierto, primero intenta cubrirlo y si queda
     * dinero disponible aumenta el saldo.
     * @param monto
     */
    public void depositar(double monto) {
        if(giroDescubierto > 0){
            double diferencia = giroDescubierto - monto;
            if(diferencia < 0){
                monto += Math.abs(diferencia);
                giroDescubierto = 0;
            } else {
                giroDescubierto = diferencia;
            }
        } else {
            saldo += monto;
        }
    }

    /**
     * Realiza la inversion del monto indicado. Condiciones para que la operación sea exitosa:
     * 	a. Que el saldo sea >= monto
     *  b. Que no exista una inversión activa.
     *
     * Tambien establece la fecha de inversión.
     *
     * @param monto El monto a invertir
     * @return exito Un booleano que indica el exito de la operacion
     */
    public boolean invertir(double monto) {
        boolean exito = false;
        if(saldo >= monto && saldoInvertido == 0){
            saldoInvertido = monto;
            fechaInversion = LocalDate.now();
            exito = true;
        }
        return exito;
    }

    /**
     * Devuelve el monto invertido al saldo con el interes establecido. Se puede realizar siempre y cuando
     * hayan pasado los N días que dura la inversión.
     * @return
     */
    public double recuperarInversion() {
        double inversionRecuperada;
        LocalDate hoy = LocalDate.now();
        if(hoy.isAfter(fechaInversion.plusDays(PLAZO_DIAS_INVERSION))){
            inversionRecuperada = saldoInvertido + (saldoInvertido * Cuenta.INTERES_POR_INVERSION);
        } else if (hoy.isAfter(fechaInversion.plusDays(30)) || hoy.isEqual(fechaInversion.plusDays(30))) {
            inversionRecuperada = saldoInvertido + (saldoInvertido * 0.04);
        } else {
            inversionRecuperada = saldoInvertido;
        }
        saldoInvertido = 0;
        fechaInversion = null;
        return inversionRecuperada;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getGiroDescubierto() {
        return this.giroDescubierto;
    }

    public double getLimiteGiroDescubierto() {
        return this.limiteGiroDescubierto;
    }

    public double getMontoInvertido() {
        return this.saldoInvertido;
    }

    public double getInteresAGanar() {
        if (this.fechaInversion != null)
            return this.saldoInvertido * Cuenta.INTERES_POR_INVERSION;
        return 0.0d;
    }
}

