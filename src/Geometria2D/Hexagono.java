package Geometria2D;

public class Hexagono extends Geometria2D{


    private int numlados=6;
   

    public double area (double lado1, double apotema1){
        lado = lado1; 
        apotema = apotema1;
        return ( 3  * apotema * lado);

    }

    public double perimetro (double lado1 ){
        lado = lado1;
        return numlados * lado;
    }

    public double apotema (double lado1){
        lado = lado1; 
        return lado * ((Math.sqrt(3))/2);
    }

    
}
