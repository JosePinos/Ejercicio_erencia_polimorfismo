package Geometria2D;

public class Circulo extends Geometria2D{
    //Perimetro area y diametro

    public double Area_Cir(double radio1){
        radio = radio1; // se pasa el radio que se pedira por teclado y lo almacenamos en el atributo del objeto
        return (Math.PI)*Math.pow(radio,2);
    }

    public double Perimetro_Cir(double radio1){
        radio = radio1;
        return (Math.PI) *(radio*2);
    }
    public double Diametro_Cir(double radio1){
        radio = radio1;
        return 2*radio;
    }
}
