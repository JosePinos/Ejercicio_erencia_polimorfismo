package Geometria3D;

public class Prismas_Rectangular {
    private double Base1, Base2, Altura;

    public double area (double base1, double base2, double altura ){
        Base1 = base1;
        Base2 = base2;
        Altura = altura;
        return 2 * Altura * (Base1 + Base2) + 2 * (Base1 * Base2);

    }
    public double volumen (double base1, double base2, double altura){
        Base1 = base1;
        Base2 = base2;
        Altura = altura;
        return Base1 * Base2 * Altura;
    }
}
