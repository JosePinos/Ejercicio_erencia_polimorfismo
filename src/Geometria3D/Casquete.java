package Geometria3D;

//import java.util.Scanner;

public class Casquete extends Geometria3D{
    //Scanner sc =  new Scanner(System.in);
    
    //Atributtes

    private double Radio_Circulo;
    private double Radio_Casquete;
    private double Altura_Casquete;


    public Casquete(double radio_Circulo, double radio_Casquete, double altura_Casquete) {
        Radio_Circulo = radio_Circulo;
        Radio_Casquete = radio_Casquete;
        Altura_Casquete = altura_Casquete;
        area();
        volumen();
    }


    //methods


    public double getRadio_Circulo() {
        return Radio_Circulo;
    }
    public double getRadio_Casquete() {
        return Radio_Casquete;
    }
    public double getAltura_Casquete() {
        return Altura_Casquete;
    }




    @Override
    protected  void area( ){
        area =  2 * Math.PI * getRadio_Circulo() * getAltura_Casquete();
    }


    @Override
    protected void volumen(){
        volumen = ((1/3.0) * Math.PI * (Math.pow(getAltura_Casquete(),2)) * ((3 * getRadio_Circulo())- getAltura_Casquete()));
    }



    public double Radido_Casquete ( double RadioCasquete, double AlturaCasquete){
        Radio_Casquete  = RadioCasquete;
        Altura_Casquete = AlturaCasquete;
        return ((Math.pow(Radio_Casquete, 2))+ (Math.pow(Altura_Casquete, 2)))/(2 * Altura_Casquete);

    }
    


}
