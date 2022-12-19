package Geometria3D;

public class Octahedro {
    private double Lado; 


    public double altura(double lado){
        Lado = lado;
        return Lado * Math.sqrt(2);

    }
    public double area(double lado){
        Lado = lado;
        return Math.pow(Lado, 2) * (2*(Math.sqrt(3)));
    }
    public double volumen(double lado){
        Lado = lado;
        return Math.pow(Lado, 3) * ((Math.sqrt(2))/3);

    }
}
