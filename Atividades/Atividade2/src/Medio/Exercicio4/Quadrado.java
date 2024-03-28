package Medio.Exercicio4;

public class Quadrado implements FormaGeometrica{
    @Override
    public double calcularArea(double h, double b) {
        return h * b;
    }

    @Override
    public double calcularPerimetro(double b, double h) {
        return b * 4;
    }
}
