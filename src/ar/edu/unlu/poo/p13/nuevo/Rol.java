package ar.edu.unlu.poo.p13.nuevo;

public class Rol {
    public enum Tipo {
        TRIPULANTE, PASAJERO
    }
    private Tipo tipo;

    public Rol(String rol) {
        setTipo(rol);
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(String rol) {
        if (rol != null) {
            if (rol.toLowerCase().equals("tripulante")) {
                tipo = Tipo.TRIPULANTE;
            } else if (rol.toLowerCase().equals("pasajero")) {
                tipo = Tipo.PASAJERO;
            } else {
                throw new IllegalArgumentException("Valor de rol no válido: " + rol);
            }
        } else {
            throw new IllegalArgumentException("El valor de rol no puede ser nulo");
        }
    }
}
