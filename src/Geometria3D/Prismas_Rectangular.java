package Geometria3D;

public class Prismas_Rectangular extends  Geometria3D{
    private double Base1, Base2, Altura;

    public Prismas_Rectangular(double base1, double base2, double altura) {
        Base1 = base1;
        Base2 = base2;
        Altura = altura;
        area();
        volumen();
    }

    public double getBase1() {
        return Base1;
    }
    public double getBase2() {
        return Base2;
    }
    public double getAltura() {
        return Altura;
    }



    @Override
    protected void area (){
        area = 2 * getAltura() * (getBase1() + getBase2()) + 2 * (getBase1() * getBase2());
    }

    @Override
    protected void volumen (){
        volumen = getBase1() * getBase2() * getAltura();
    }
}
