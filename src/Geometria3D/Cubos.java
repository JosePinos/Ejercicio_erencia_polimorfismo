package Geometria3D;

public class Cubos extends Geometria3D{
    private double Lado;
    private final double Nlado = 6;

    public Cubos(double lado) {
        Lado = lado;
        area();
        volumen();
    }

    public double getLado() {
        return Lado;
    }

    @Override
    protected void area (){
        area = Nlado * (Math.pow(getLado(), 2));
    }

    @Override
    protected void volumen(){
        volumen = (Math.pow(getLado(), 3));
    }

    public double superficie (double lado){
        Lado = lado;
        return 6 * (Math.pow(Lado, 2));
    }
}
