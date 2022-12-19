package Geometria3D;

public class Esfera {
    private double Radio;
    private final double Pi = 3.14;

    public double area (double radio){
        Radio = radio;
        return 4 * Pi * (Math.pow(Radio, 2));

    }

    public double volumen ( double radio){
        Radio = radio;
        return (4 * Pi * (Math.pow(Radio,3)))/3;
    }
    
}
