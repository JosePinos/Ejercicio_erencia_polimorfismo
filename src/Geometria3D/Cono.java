package Geometria3D;

public class Cono extends  Geometria3D{
    private double Altura, Altura_Inclinada , Radio;

    public Cono(double altura, double altura_Inclinada, double radio) {
        Altura = altura;
        Altura_Inclinada = altura_Inclinada;
        Radio = radio;
        area();
        volumen();
    }

    public double getAltura() {
        return Altura;
    }
    public double getAltura_Inclinada() {
        return Altura_Inclinada;
    }
    public double getRadio() {
        return Radio;
    }


    @Override
    protected void area (){
        area = Math.PI * getRadio() * (getRadio() + getAltura_Inclinada());
    }

    @Override
    protected void  volumen (){
        volumen = (Math.PI * getAltura() * (Math.pow(getRadio(), 2)))/3;
    }

    public double superficie_latera (double radio, double altura){
        Radio = radio;
        Altura = altura;
        return Math.PI * Radio * Altura_Inclinada;
    }

    

}
