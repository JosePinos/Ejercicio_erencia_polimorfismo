package Geometria2D;

public class Rectangulo {
    private double  base, altura;

    
    public double Area_Rec(double base1, double altura1){
        base = base1; 
        altura = altura1;
        return (base * altura)/2 ;
    }
    public double Perimetro_Rec(double base1, double altura1){
        base = base1; 
        altura = altura1;
        return (2 * base)+ (2 * altura);
    }
    public double Diagonal_Rec(double base1, double altura1){
        base = base1;
        altura = altura1;
        return (Math.sqrt((Math.pow(altura, 2))+(Math.pow(base, 2))));
    }


}