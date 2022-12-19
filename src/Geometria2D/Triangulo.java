package Geometria2D;

public class Triangulo extends Geometria2D{


    
    public double area (double base1, double altura1){
        base = base1;
        altura = altura1;
        return (base * altura)/2;
    }
    public double perimetro ( double lado1 ){
        lado = lado1;
        return lado * 3;
    }


}
