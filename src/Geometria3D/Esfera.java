package Geometria3D;

public class Esfera extends Geometria3D {
    private double Radio;
   

    public Esfera(double radio){
        Radio = radio;
        area();
        volumen();
    }

    private double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    @Override
    protected void area (){
        area = 4 * (Math.PI) * (Math.pow(getRadio(), 2));
    }


    @Override
    protected void volumen (){
        volumen = (4 * (Math.PI) * (Math.pow(getRadio(),3)))/3;
    }
    
}
