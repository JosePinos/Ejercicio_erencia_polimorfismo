package Geometria3D;

public class Cubos {
    private double Lado;
    private final double Nlado = 6;

    public double area (double lado){
        Lado = lado;
        return Nlado * (Math.pow(Lado, 2));
    }

    public double volumen(double lado){
        Lado = lado;
        return (Math.pow(Lado, 3));
    }

    public double superficie (double lado){
        Lado = lado;
        return 6 * (Math.pow(Lado, 2));
    }
}
