package Geometria3D;

public class Prisma_Triangular {
    private double Lado, Altura;

    public double area (double lado, double altura){
        Lado = lado;
        Altura = altura;

        return Lado *((3*Altura) + ((Lado * Math.sqrt(3))/2));
    }
    public double volumen (double lado, double altura){
        Lado = lado;
        Altura = altura;
        return  (Altura * (Math.pow(Lado, 2)) * (Math.sqrt(3)))/4;

    }
    
    
}
