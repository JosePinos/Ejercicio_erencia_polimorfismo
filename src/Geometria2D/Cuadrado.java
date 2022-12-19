package Geometria2D;

public class Cuadrado  extends Geometria2D{



    //perimetro area diamtetro

    public double Area_Cuad(double lado1){
        lado = lado1;
        return Math.pow(lado,2);
    }
    public double Perimetro_Cuad(double lado1){
        lado = lado1;
        return 4*lado;
    }
    public double Diagonal_Cuad(double lado1){
        lado = lado1;
        return lado*Math.sqrt(2.0);
    }


}
