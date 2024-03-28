package Medio.Exercicio1;

public class Main {
    public static void main(String[] args) {
        /*
        Classe Polígono Crie uma classe abstrata Poligono com um método abstrato
        area(). Em seguida, crie classes Retangulo, Circulo e Triangulo que
        estendem a classe Poligono e implementam o método area(). Crie objetos
        dessas classes e teste o método area().
        */

        Circulo circulo = new Circulo();
        Triangulo triangulo = new Triangulo();
        Retangulo retangulo = new Retangulo();

        System.out.println("Area de circulo: "+ circulo.area(5, 0));
        System.out.println("Area de triângulo: "+ triangulo.area(5, 3));
        System.out.println("Area de retângulo: "+ retangulo.area(4, 5));


    }
}
