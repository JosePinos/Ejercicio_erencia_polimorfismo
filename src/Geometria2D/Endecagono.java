package Geometria2D;

public class Endecagono extends Geometria2D {
    private  final int numlados=11;

   public double area (double lado1, double apotema1){
    lado = lado1;
    apotema = apotema1;
    return (lado * numlados * apotema)/2; 

   }
   public double perimetro(double lado1){
        lado = lado1;
       return 11 * lado;
   }
   public double angulos_interiores (){

       return 180 * (numlados - 2);
   }


}
