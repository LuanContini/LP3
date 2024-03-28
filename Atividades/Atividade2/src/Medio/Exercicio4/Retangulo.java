package Medio.Exercicio4;

public class Retangulo implements FormaGeometrica{
    @Override
    public double calcularArea(double b, double h) {
        return b * h;
    }

    @Override
    public double calcularPerimetro(double b, double h) {
        return (b * 2) + (h * 2);
    }
}
