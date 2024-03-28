package Medio.Exercicio4;


public class Main {
    public static void main(String[] args) {
        /*
        Interface FormaGeometrica Crie uma interface FormaGeometrica com métodos
                para calcularArea() e calcularPerimetro(). Em seguida, crie classes
        Quadrado, Circulo e Retangulo que implementam a interface
        FormaGeometrica. Crie objetos dessas classes e teste os métodos.
        */
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Retangulo retangulo = new Retangulo();

        System.out.println("Area de circulo: "+ circulo.calcularArea(5, 0));
        System.out.println("Area de circulo: "+ circulo.calcularPerimetro(5, 0));

        System.out.println("Area de quadrado: "+ quadrado.calcularArea(5, 5));
        System.out.println("Area de quadrado: "+ quadrado.calcularPerimetro(5, 5));

        System.out.println("Area de retângulo: "+ retangulo.calcularArea(4, 5));
        System.out.println("Area de retângulo: "+ retangulo.calcularPerimetro(4, 5));
    }
}
