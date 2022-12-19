package Geometria2D;

public class Circulo {

    private double radio;
    private final double  Npi = 3.14;

    //Perimetro area y diametro

    public double Area_Cir(double radio1){
        radio = radio1; // se pasa el radio que se pedira por teclado y lo almacenamos en el atributo del objeto
        return Npi*Math.pow(radio,2);
    }

    public double Perimetro_Cir(double radio1){
        radio = radio1;
        return Npi *(radio*2);
    }
    public double Diametro_Cir(double radio1){
        radio = radio1;
        return 2*radio;
    }
}
