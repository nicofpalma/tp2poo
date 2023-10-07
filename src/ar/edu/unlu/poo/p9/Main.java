package ar.edu.unlu.poo.p9;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<FiguraGeometrica> figuras2d = new ArrayList();
        List<Figura3d> figuras3d = new ArrayList<>();

        Circulo circulo = new Circulo(9);
        Rectangulo rectangulo = new Rectangulo(2, 4);
        Cuadrado cuadrado = new Cuadrado(2);
        Triangulo triangulo = new Triangulo(10, 4);

        Esfera esfera = new Esfera(4);
        Cubo cubo = new Cubo(4);
        Tetraedro tetraedro = new Tetraedro(6);

        figuras2d.add(circulo);
        figuras2d.add(rectangulo);
        figuras2d.add(cuadrado);
        figuras2d.add(triangulo);
        figuras3d.add(esfera);
        figuras3d.add(cubo);
        figuras3d.add(tetraedro);

        for(FiguraGeometrica figura : figuras2d){
            System.out.println(figura + "  -- Area: " + figura.getArea());
        }

        for(Figura3d figura3d : figuras3d){
            System.out.println(figura3d + " -- Area: " + figura3d.getArea() + "  --  Volumen: " + figura3d.getVolumen());
        }
    }
}
