package Geometria3D;

public class Piramide extends Geometria3D{
    private double Lado, Altura;

    public Piramide(double lado, double altura) {
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
        area = getLado() * (getLado() + Math.sqrt((4 * getAltura()) + (Math.pow(getLado(), 2))));
    }
    @Override
    protected void volumen (){
        volumen = ((Math.pow(getLado(), 2)) * getAltura())/3;
    }

    public double superficie_latera (double lado, double altura){
        Lado = lado;
        Altura = altura;
        return (1/2.0) * (3 * Lado) * Altura;
    }
    
}
