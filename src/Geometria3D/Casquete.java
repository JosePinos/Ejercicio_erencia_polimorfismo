package Geometria3D;

import java.util.Scanner;

public class Casquete {
    Scanner sc =  new Scanner(System.in);
    
    //Atributtes

    private double Radio_Circulo;
    private double Radio_Casquete;
    private double Altura_Casquete;
    private final double  Pi = 3.14;
    

    //methods

    public  double Calcular_Area_Casquete( double RadioCirculo, double AlturaCasquete ){
        Radio_Circulo = RadioCirculo;
        Altura_Casquete = AlturaCasquete;
        return  2 * Pi * Radio_Circulo * Altura_Casquete;
    }

    public double Volumen_Casquete(double RadioCirculo, double AlturaCasquete){
        Radio_Circulo = RadioCirculo;
        Altura_Casquete = AlturaCasquete;
        return ((1/3) * Pi * (Math.pow(Altura_Casquete,2)) * ((3 * Radio_Circulo)- Altura_Casquete));
    }
    public double Radido_Casquete ( double RadioCasquete, double AlturaCasquete){
        Radio_Casquete  = RadioCasquete;
        Altura_Casquete = AlturaCasquete;

        return ((Math.pow(Radio_Casquete, 2))+ (Math.pow(Altura_Casquete, 2)))/(2 * Altura_Casquete);

    }
    


}
