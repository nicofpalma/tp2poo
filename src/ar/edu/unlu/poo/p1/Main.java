package ar.edu.unlu.poo.p1;

public class Main {
    public static void main (String args[]){
        ClubDeportivo club = new ClubDeportivo();
        Actividad futbol = new Actividad("Futbol", Suscripcion.BASICA);
        Actividad buffet = new Actividad("Buffet", Suscripcion.BASICA);
        Actividad gimnasio = new Actividad("Gimnasio", Suscripcion.BASICA);
        Actividad hockey = new Actividad("Hockey", Suscripcion.INTERMEDIA);
        Actividad rugby = new Actividad("Rugby", Suscripcion.INTERMEDIA);
        Actividad natacion = new Actividad("Natación", Suscripcion.DESTACADA);
        Actividad polo = new Actividad("Polo", Suscripcion.DESTACADA);

        club.agregarActividad(futbol);
        club.agregarActividad(buffet);
        club.agregarActividad(gimnasio);
        club.agregarActividad(hockey);
        club.agregarActividad(rugby);
        club.agregarActividad(natacion);
        club.agregarActividad(polo);

        club.inscribirSocio("José", "López", "165546349", "Av George 123", "joselopez@gmail.com", Suscripcion.BASICA);
        club.inscribirSocio("Nicolás", "Fernández Palma", "6754557", "Av San Martin 423", "nicofpalmaa@gmail.com", Suscripcion.INTERMEDIA);

        System.out.println(club.generarReporteNuevosSocios());
        System.out.println();
        System.out.println(club.listarActividadesPorSuscripcion(Suscripcion.BASICA));
        System.out.println(club.listarActividadesPorSuscripcion(Suscripcion.INTERMEDIA));
        System.out.println(club.listarActividadesPorSuscripcion(Suscripcion.DESTACADA));
        System.out.println();
        System.out.println(club.listarSociosPorSuscripcion(Suscripcion.BASICA));
        System.out.println(club.listarSociosPorSuscripcion(Suscripcion.INTERMEDIA));
        System.out.println(club.listarSociosPorSuscripcion(Suscripcion.DESTACADA));


    }
}
