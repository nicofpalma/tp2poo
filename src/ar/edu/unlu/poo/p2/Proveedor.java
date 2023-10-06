package ar.edu.unlu.poo.p2;

import java.util.ArrayList;
import java.util.List;

public class Proveedor {
    private String nombre;
    private TipoProveedor tipo;
    private String email;

    public Proveedor(String nombre, TipoProveedor tipo, String email){
        this.nombre = nombre;
        this.tipo = tipo;
        this.email = email;
    }

    public String toString(){
        String tipoDeProveedor = "";
        if(tipo == TipoProveedor.EXCURSIONES){
            tipoDeProveedor = "Excursiones";
        } else if (tipo == TipoProveedor.MEDIOS_DE_TRANSPORTE) {
            tipoDeProveedor = "Medios de transporte";
        } else {
            tipoDeProveedor = "Hospedajes";
        }

        return "    - PROVEEDOR: " + nombre + "\n"
                + "    - TIPO DE PROVEEDOR: " + tipoDeProveedor + "\n"
                + "    - EMAIL DE CONTACTO: " + email + "\n\n";
    }

    public String getNombre() {
        return nombre;
    }

    public TipoProveedor getTipo() {
        return tipo;
    }

    public String getEmail() {
        return email;
    }
}
