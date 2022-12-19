package Geometria3D;
import Geometria3D.Geometria3D;
public class Esfera extends Geometria3D {
    private double Radio;
    private final double Pi = 3.14;

    @Override
    //protected double area (double radio){
    protected double area (double radio){
        Radio = radio;
        return 4 * Pi * (Math.pow(Radio, 2));

    }

    @Override
    //protected double volumen ( double radio){
    protected double volumen (){
        Radio = radio;
        return (4 * Pi * (Math.pow(Radio,3)))/3;
    }
    
}
