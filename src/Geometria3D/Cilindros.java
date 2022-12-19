package Geometria3D;

public class Cilindros {
    private double Radio, Altura;
    private final double Pi = 3.14;


    public double area (double radio, double altura){
        Radio = radio;
        Altura = altura;
        return  2 * Pi * Radio * (Radio + Altura);

    }
    public double volumen (double radio, double altura){
        Radio = radio;
        Altura = altura;
        return Pi * (Math.pow(Radio, 2)) * Altura;
    }

    public double superficie_latera(double radio, double altura){
        Radio = radio;
        Altura = altura;
        return 2 * Pi * Radio * Altura;

    }

}
