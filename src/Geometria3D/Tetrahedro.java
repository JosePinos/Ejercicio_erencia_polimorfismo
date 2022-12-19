package Geometria3D;

public class Tetrahedro {
    private double Lado, Altura; 

    public double area (double lado, double altura){
        Lado = lado;
        Altura = altura;
        return ((Lado/2))* (((Math.sqrt(3))/2)* Lado * 3 * ((Math.sqrt((Math.pow(Lado, 2))* (3/36) + (Math.pow(Altura,2))))));

    }
    public double volumen(double lado, double altura){
        Lado = lado;
        Altura = altura;

        return Altura * (Math.pow(Lado, 2)) * ((Math.sqrt(3))/12);

    }
}
