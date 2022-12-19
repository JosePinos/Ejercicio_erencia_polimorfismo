package Geometria3D;

public class Piramide {
    private double Lado, Altura;

    public double area (double lado , double altura){
        Lado = lado;
        Altura = altura;
        return Lado * (Lado + Math.sqrt((4 * Altura) + (Math.pow(Lado, 2))));


    }

    public double volumen (double lado, double altura){
        Lado = lado;
        Altura = altura;
        return ((Math.pow(Lado, 2)) * Altura)/3;
    }

    public double superficie_latera (double lado, double altura){
        Lado = lado;
        Altura = altura;
        return (1/2) * (3 * Lado) * Altura;
    }
    
}
