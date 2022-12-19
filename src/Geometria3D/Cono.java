package Geometria3D;

public class Cono {
    private double Altura, Altura_Inclinada , Radio;
    private final double Pi = 3.14;



    public double Area (double radio, double altura_inclinada){
        Radio = radio;
        Altura_Inclinada = altura_inclinada;

        return  Pi * Radio * (Radio + Altura_Inclinada);

    }

    public double  Volumen (double radio, double altura){
        Radio = radio; 
        Altura = altura;
        
        return (Pi * Altura * (Math.pow(Radio, 2)))/3;
    }
    public double superficie_latera (double radio, double altura){
        Radio = radio;
        Altura = altura;
        return Pi * Radio * Altura_Inclinada;
    }

    

}
