package Geometria3D;

public class Octahedro extends Geometria3D{
    private double Lado;

    public Octahedro(double lado) {
        Lado = lado;
        area();
        volumen();
    }

    public double altura(double lado){
        Lado = lado;
        return Lado * Math.sqrt(2);

    }

    @Override
    protected void area(){
        area = Math.pow(Lado, 2) * (2*(Math.sqrt(3)));
    }

    @Override
    protected void volumen(){
        volumen = Math.pow(Lado, 3) * ((Math.sqrt(2))/3);
    }

}
