package Geometria2D;

public class Octogono extends Geometria2D{

    private int numlados=8;
   

   public double perimetro (double lado1){
        lado = lado1;
        return numlados * lado;
   }
   public double area (double lado1, double apotema1){
        lado = lado1;
        apotema = apotema1;
        return (4 * apotema *lado);
   }
   public double apotema (double lado1){
        lado = lado1;
        return (lado * 2)*((Math.sin(67.5))/(Math.sin(22.5)));
   }
}
