package Geometria3D;

public class Prisma_Triangular extends Geometria3D{
    private double Lado, Altura;

    public Prisma_Triangular(double lado, double altura) {
        Lado = lado;
        Altura = altura;
        area();
        volumen();
    }

    public double getLado() {
        return Lado;
    }

    public double getAltura() {
        return Altura;
    }

    @Override
    protected void area (){
        area = getLado() *((3*getAltura()) + ((getLado() * Math.sqrt(3))/2));
    }

    @Override
    protected void volumen (){
        volumen =  (getAltura() * (Math.pow(getLado(), 2)) * (Math.sqrt(3)))/4;
    }
    
    
}
