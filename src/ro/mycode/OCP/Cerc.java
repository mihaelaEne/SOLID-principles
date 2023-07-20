package ro.mycode.OCP;

public class Cerc implements FormaGeometrica{

    private double r;

    @Override
    public double calculeazaPerimetrul() {
        return Math.PI * r * r;
    }
}
