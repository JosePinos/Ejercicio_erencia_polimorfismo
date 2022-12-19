package Geometria2D;

public class Decagono extends  Geometria2D{

    private int numlados=10;
    

   public double perimetro (double lado1){
    lado = lado1;
    return numlados * lado;
   }
   public double area (double apotema1, double lado1){
    apotema = apotema1;
    lado = lado1;
    return 5 * apotema  * lado;
   }

   public double apotema (double lado1){
    lado = lado1;
    return ((lado / 2))*((Math.cos(78))/(Math.sin(18)));
   }
}
