package Geometria3D;

public class Tetrahedro extends Geometria3D{
    private double Lado, Altura;

    public Tetrahedro(double lado, double altura) {
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
        area = ((getLado()/2))* (((Math.sqrt(3))/2)* getLado() * 3 * ((Math.sqrt((Math.pow(getLado(), 2))* (3/36) + (Math.pow(getAltura(),2))))));
    }

    @Override
    protected void volumen(){
        volumen = getAltura() * (Math.pow(getLado(), 2)) * ((Math.sqrt(3))/12);
    }
}
