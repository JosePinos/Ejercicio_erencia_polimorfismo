package Geometria2D;

public class Pentagono extends Geometria2D{

    private int numlados=5;
    

    public double Area_Pent(double lado1, double apotema1){
        lado = lado1;
        apotema = apotema1;
        return (numlados * lado * apotema)/2; 
    }
    public double Perimetro_Pent(double lado1){
        lado = lado1;
        return numlados * lado;
    }
    public double Apotema_Pent(double lado1)
    {
        lado = lado1;
        return (lado / 2)/((Math.sqrt(1 + (2 / (Math.sqrt(5))))));
    }
}
