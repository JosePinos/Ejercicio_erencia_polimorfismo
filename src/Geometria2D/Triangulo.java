package Geometria2D;

public class Triangulo {
    private double lado, base, altura;

    
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
