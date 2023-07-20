package ro.mycode.OCP;

public class Rectangle implements FormaGeometrica{

    private double width;
    private double height;

    @Override
    public double calculeazaPerimetrul() {
        return width*height;
    }
}
