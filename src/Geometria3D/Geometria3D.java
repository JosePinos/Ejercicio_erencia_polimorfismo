package Geometria3D;
//se realiza la abstaccion para poder ocupar protected y poder tener las funciones de volumen y area
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