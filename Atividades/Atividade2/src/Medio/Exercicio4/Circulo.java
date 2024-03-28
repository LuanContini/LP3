package Medio.Exercicio4;

public class Circulo implements FormaGeometrica{
    @Override
    public double calcularArea(double r, double b) {
        return 3.14 * (r * r);
    }

    @Override
    public double calcularPerimetro(double r, double b) {
        return 2 * 3.14 * r;
    }
}
