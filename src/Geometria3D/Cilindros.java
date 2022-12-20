package Geometria3D;

public class Cilindros extends  Geometria3D{
    private double Radio, Altura;


    public Cilindros(double radio, double altura) {
        Radio = radio;
        Altura = altura;
        area();
        volumen();
    }

    public double getRadio() {
        return Radio;
    }
    public double getAltura() {
        return Altura;
    }


    @Override
    protected void area (){
        area = 2 * Math.PI * getRadio() * (getRadio() + getAltura());
    }

    @Override
    protected void volumen (){
        volumen = Math.PI * (Math.pow(getRadio(), 2)) * getAltura();
    }

    public double superficie_latera(double radio, double altura){
        Radio = radio;
        Altura = altura;
        return 2 * Math.PI * Radio * Altura;

    }

}
