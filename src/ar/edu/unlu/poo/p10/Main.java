package ar.edu.unlu.poo.p10;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EmpleadoAsalariado asalariado = new EmpleadoAsalariado("Carlos Lopez", "6345345", "3425345", LocalDate.now().minusDays(60) , 200000);
        EmpleadoComision comision = new EmpleadoComision("Mariano Lopez", "3123231", "5345345", LocalDate.now().minusDays(100), 100, 5.4);
        EmpleadoComisionSalarioBase comisionSalarioBase = new EmpleadoComisionSalarioBase("Jorge Perez", "2534534", "34534543", LocalDate.now().minusDays(10), 200, 3.0, 100000);
        EmpleadoPasante empleadoPasante = new EmpleadoPasante("Martina Perez", "2134123", "23423", LocalDate.now().minusDays(240));
        EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora("Nicolas Gimenez", "4234234", "123123", LocalDate.now(), 200, 700);

        System.out.println("Empleado asalariado: " + asalariado.calcularSueldo());
        System.out.println("Empleado comision: " + comision.calcularSueldo());
        System.out.println("Empleado comisionSalarioBase: " + comisionSalarioBase.calcularSueldo());
        System.out.println("Empleado pasante: " + empleadoPasante.calcularSueldo());
        System.out.println("Empleado porHora: " + empleadoPorHora.calcularSueldo());

    }
}
