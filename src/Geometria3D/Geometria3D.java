package Geometria3D;
public abstract class Geometria3D {

    protected double area, volumen;

    protected abstract void area();

    protected abstract void volumen();

    public double getArea() {
        return area;
    }
    public double getVolumen() {
        return volumen;
    }


}