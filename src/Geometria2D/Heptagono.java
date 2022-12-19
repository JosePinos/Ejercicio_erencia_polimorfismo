package Geometria2D;

public class Heptagono {

    private double lado, apotema;
    private int numlados=7;
    private  final double Pi = 3.14;
    
    public double perimetro (double lado1){
        lado = lado1;
        return numlados * lado;

    }
    public double area (double lado1, double apotema1){
        lado = lado1;
        apotema = apotema1;
        return (7 * apotema * lado)/2;
    }
    public double apotema (double lado1 ){
        lado = lado1;
        return (lado/2)*((Math.sin((5 * Pi)/14))/((Math.sin(Pi/7))/7));
    }
    
}
