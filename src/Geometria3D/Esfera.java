package Geometria3D;
import Geometria3D.Geometria3D;
public class Esfera extends Geometria3D {
    private double Radio;
    private final double Pi = 3.14;

    public Esfera(double radio){
        Radio = radio;
        area();
        volumen();
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    @Override
    protected void area (){
        area = 4 * Pi * (Math.pow(getRadio(), 2));
    }


    @Override
    protected void volumen (){
        volumen = (4 * Pi * (Math.pow(getRadio(),3)))/3;
    }
    
}
