
//Scanner
import java.util.Scanner;

//Importe de figuras 2D
import Geometria2D.Circulo;
import Geometria2D.Cuadrado;
import Geometria2D.Decagono;
import Geometria2D.Endecagono;
import Geometria2D.Heptagono;
import Geometria2D.Hexagono;
import Geometria2D.Octogono;
import Geometria2D.Pentagono;
import Geometria2D.Rectangulo;
import Geometria2D.Triangulo;

//Importe de figuras 3D
import Geometria3D.Casquete;
import Geometria3D.Cilindros;
import Geometria3D.Cono;
import Geometria3D.Cubos;
import Geometria3D.Esfera;
import Geometria3D.Octahedro;
import Geometria3D.Piramide;
import Geometria3D.Prisma_Triangular;
import Geometria3D.Prismas_Rectangular;
import Geometria3D.Tetrahedro;

public class Main {
    //Figuras 2D
    private static Circulo circulo = new Circulo();
    private static Cuadrado cuadrado = new Cuadrado();
    private static Decagono decagono = new Decagono();
    private static Endecagono endecagono = new Endecagono();
    private static Heptagono heptagono = new Heptagono();
    private static Hexagono hexagono = new Hexagono();
    private static Octogono octogono = new Octogono();
    private static Pentagono pentagono = new Pentagono();
    private static Rectangulo rectangulo = new Rectangulo();
    private static Triangulo triangulo = new Triangulo();

    //Figuras 3D
    private static Casquete casquete = new Casquete();
    private static Cilindros cilindros = new Cilindros();
    private static Cono cono = new Cono();
    private static Cubos cubo = new Cubos();
    private static Esfera esfera = new Esfera();
    private static Octahedro octahedro = new Octahedro();
    private static Piramide piramide = new Piramide();
    private static Prisma_Triangular prisma_triangular = new Prisma_Triangular();
    private static Prismas_Rectangular prisma_rectangular = new Prismas_Rectangular();
    private static Tetrahedro tetrahedro = new Tetrahedro();

    //SCANNER
    private static Scanner sn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int opcion = menu_principal();
        double lado, altura, apotema, base1, base2, radio1,radio2, altura_inclinada;

        while (opcion != 3){

            if (opcion == 1){
                int opcion2 = menu_Geometria2D();
                while (opcion2 !=11){

                    if (opcion == 1) {
                        System.out.println("Circulo");
                        System.out.println("Ingrese el radio del circulo ");
                        radio1 = sn.nextDouble();


                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(circulo.Area_Cir(radio1));
                        System.out.println("");
                        System.out.println("Diametro");
                        System.out.println(circulo.Diametro_Cir(radio1));
                        System.out.println("");
                        System.out.println("Perimetro");
                        System.out.println(circulo.Perimetro_Cir(radio1));
                    }

                    else if (opcion == 2) {
                        System.out.println("Cuadrado");
                        System.out.println("Ingrese el valor  de un lado de su cuadrado ");
                        lado = sn.nextDouble();
                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(cuadrado.Area_Cuad(lado));
                        System.out.println("");
                        System.out.println("Diagonal");
                        System.out.println(cuadrado.Diagonal_Cuad(lado));
                        System.out.println("");
                        System.out.println("Perimetro");
                        System.out.println(cuadrado.Perimetro_Cuad(lado));



                    } else if (opcion == 3) {
                        System.out.println("Decagono");
                        System.out.println("Ingrese el valor de su lado ");
                        lado = sn.nextDouble();
                        System.out.println("Ingrese el valor de su apotema");
                        apotema = sn.nextDouble();

                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(decagono.area(apotema, lado));
                        System.out.println("");
                        System.out.println("Apotema");
                        System.out.println(decagono.apotema(lado));
                        System.out.println("");
                        System.out.println("Perimetro");
                        System.out.println(decagono.perimetro(lado));

                    } else if (opcion == 4) {
                        System.out.println("Endecagono");
                        System.out.println("Ingrese el valor de su lado ");
                        lado = sn.nextDouble();
                        System.out.println("Ingrese el valor de su apotema");
                        apotema = sn.nextDouble();

                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(endecagono.area(lado, apotema));
                        System.out.println("");
                        System.out.println("Angulos interiores");
                        System.out.println(endecagono.angulos_interiores());
                        System.out.println("");
                        System.out.println("Perimetro");
                        System.out.println(endecagono.perimetro(lado));

                    } else if (opcion == 5) {
                        System.out.println("Heptagono");
                        System.out.println("Ingrese el valor de su lado ");
                        lado = sn.nextDouble();
                        System.out.println("Ingrese el valor de su apotema");
                        apotema = sn.nextDouble();

                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(heptagono.area(lado, apotema));
                        System.out.println("");
                        System.out.println("Apotema");
                        System.out.println(heptagono.apotema(lado));
                        System.out.println("");
                        System.out.println("Perimetro");
                        System.out.println(heptagono.perimetro(lado));

                    } else if (opcion == 6) {
                        System.out.println("Hexagono");
                        System.out.println("Ingrese el valor de su lado ");
                        lado = sn.nextDouble();
                        System.out.println("Ingrese el valor de su apotema");
                        apotema = sn.nextDouble();

                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(hexagono.area(lado, apotema));
                        System.out.println("");
                        System.out.println("Apotema");
                        System.out.println(hexagono.apotema(lado));
                        System.out.println("");
                        System.out.println("Perimetro");
                        System.out.println(hexagono.perimetro(lado));

                    } else if (opcion == 7) {
                        System.out.println("Octogono");
                        System.out.println("Ingrese el valor de su lado ");
                        lado = sn.nextDouble();
                        System.out.println("Ingrese el valor de su apotema");
                        apotema = sn.nextDouble();

                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(octogono.area(lado, apotema));
                        System.out.println("");
                        System.out.println("Apotema");
                        System.out.println(octogono.apotema(lado));
                        System.out.println("");
                        System.out.println("Perimetro");
                        System.out.println(octogono.perimetro(lado));

                    } else if (opcion == 8) {
                        System.out.println("Pentagono");
                        System.out.println("Ingrese el valor de su lado ");
                        lado = sn.nextDouble();
                        System.out.println("Ingrese el valor de su apotema");
                        apotema = sn.nextDouble();

                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(pentagono.Area_Pent(lado, apotema));
                        System.out.println("");
                        System.out.println("Apotema");
                        System.out.println(pentagono.Apotema_Pent(lado));
                        System.out.println("");
                        System.out.println("Perimetro");
                        System.out.println(pentagono.Perimetro_Pent(lado));

                    } else if (opcion == 9) {
                        System.out.println("Rectangulo");
                        System.out.println("Ingrese el valor de su base ");
                        base1 = sn.nextDouble();
                        System.out.println("Ingrese el valor de su altura");
                        altura = sn.nextDouble();
                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(rectangulo.Area_Rec(base1, altura));
                        System.out.println("");
                        System.out.println("Diagonal");
                        System.out.println(rectangulo.Diagonal_Rec(base1, altura));
                        System.out.println("");
                        System.out.println("Perimetro");
                        System.out.println(rectangulo.Perimetro_Rec(base1, altura));

                    } else if (opcion == 10) {
                        System.out.println("Triangulo");
                        System.out.println("Ingrese el valor de su lado ");
                        lado = sn.nextDouble();
                        System.out.println("Ingrese el valor de su base ");
                        base1 = sn.nextDouble();
                        System.out.println("Ingrese el valor de su altura");
                        altura = sn.nextDouble();
                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(triangulo.area(base1, altura));
                        System.out.println("");
                        System.out.println("Perimetro");
                        System.out.println(triangulo.perimetro(lado));
                    }

                    opcion2 = menu_Geometria2D();
                }
            }

            else{

                int opcion3 = menu_Geometria3D();
                while (opcion3 != 11){

                    if (opcion == 1){
                        System.out.println("Casquete");
                        System.out.println("Ingrese el radio del circulo del casquete");
                        radio1 = sn.nextDouble();
                        System.out.println("Ingrese el radio del ciruclo del casquete");
                        radio2 = sn.nextDouble();
                        System.out.println("Ingrese la altura del casquete");
                        altura = sn.nextDouble();

                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(casquete.Calcular_Area_Casquete(radio1, altura));
                        System.out.println("");
                        System.out.println("Volumen");
                        System.out.println(casquete.Volumen_Casquete(radio1, altura));
                        System.out.println("");
                        System.out.println("Radio del casquete");
                        System.out.println(casquete.Radido_Casquete(radio2, altura));


                    }

                    else if (opcion == 2){
                        System.out.println("cilindro");
                        System.out.println("Ingrese el radio del cilindro");
                        radio1 = sn.nextDouble();
                        System.out.println("Ingrese la altura del cilindro");
                        altura = sn.nextDouble();


                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(cilindros.area(radio1, altura));
                        System.out.println("");
                        System.out.println("Volumen");
                        System.out.println(cilindros.volumen(radio1, altura));
                        System.out.println("");
                        System.out.println("Superficie lateral");
                        System.out.println(cilindros.superficie_latera(radio1, altura));

                    }
                    else if (opcion == 3) {
                        System.out.println("Cono");
                        System.out.println("Ingrese el radio del cono");
                        radio1 = sn.nextDouble();
                        System.out.println("Ingrese la altura inclinada del cono");
                        altura_inclinada = sn.nextDouble();
                        System.out.println("Ingrese la altura del cono");
                        altura = sn.nextDouble();

                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(cono.Area(radio1, altura_inclinada));
                        System.out.println("");
                        System.out.println("Volumen");
                        System.out.println(cono.Volumen(radio1, altura));
                        System.out.println("");
                        System.out.println("Superficie lateral");
                        System.out.println(cono.superficie_latera(radio1, altura));

                    }
                    else if (opcion == 4) {
                        System.out.println("Cubo");
                        System.out.println("Ingrese el cuanto vale el lado de su cubo");
                        lado = sn.nextDouble();

                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(cubo.area(lado));
                        System.out.println("");
                        System.out.println("Volumen");
                        System.out.println(cubo.volumen(lado));
                        System.out.println("");
                        System.out.println("Superficie");
                        System.out.println(cubo.superficie(lado));

                    }
                    else if (opcion == 5) {
                        System.out.println("Esfera");
                        System.out.println("Ingrese el radio del circulo de la esfera");
                        radio1 = sn.nextDouble();

                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(esfera.area(radio1));
                        System.out.println("");
                        System.out.println("Volumen");
                        System.out.println(esfera.volumen(radio1));
                        System.out.println("");


                    }
                    else if (opcion == 6) {
                        System.out.println("Octaedro");
                        System.out.println("Ingrese el cuanto vale el lado de su octaedro");
                        lado = sn.nextDouble();

                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(octahedro.area(lado));
                        System.out.println("");
                        System.out.println("Volumen");
                        System.out.println(octahedro.altura(lado));
                        System.out.println("");
                        System.out.println("Superficie");
                        System.out.println(octahedro.volumen(lado));

                    }
                    else if (opcion == 7) {
                        System.out.println("Piramide");
                        System.out.println("Ingrese el cuanto vale el lado de su piramide");
                        lado = sn.nextDouble();
                        System.out.println("Ingrese la altura de su piramide");
                        altura = sn.nextDouble();

                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(piramide.area(lado, altura));
                        System.out.println("");
                        System.out.println("Volumen");
                        System.out.println(piramide.volumen(lado, altura));
                        System.out.println("");
                        System.out.println("Superficie");
                        System.out.println(piramide.superficie_latera(lado, altura));

                    }
                    else if (opcion == 8) {
                        System.out.println("Prisma triangular");
                        System.out.println("Ingrese el cuanto vale el lado de su prisma");
                        lado = sn.nextDouble();
                        System.out.println("Ingrese la altura de su prisma");
                        altura = sn.nextDouble();

                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(prisma_triangular.area(lado, altura));
                        System.out.println("");
                        System.out.println("Volumen");
                        System.out.println(prisma_triangular.volumen(lado, altura));
                        System.out.println("");

                    }
                    else if (opcion == 9) {
                        System.out.println("Prisma rectangular");
                        System.out.println("Ingrese la base 1 de su prisma rectangular");
                        base1 = sn.nextDouble();
                        System.out.println("Ingrese la base 2 de su prisma rectangular");
                        base2 = sn.nextDouble();
                        System.out.println("Ingrese la altura del casquete");
                        altura = sn.nextDouble();

                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(prisma_rectangular.area(base1, base2, altura));
                        System.out.println("");
                        System.out.println("Volumen");
                        System.out.println(prisma_rectangular.volumen(base1, base2, altura));
                        System.out.println("");

                    }
                    else if (opcion == 10) {
                        System.out.println("Tetraedro");
                        System.out.println("Ingrese el cuanto vale el lado de su tetraedro");
                        lado = sn.nextDouble();
                        System.out.println("Ingrese la altura de su tetraedro");
                        altura = sn.nextDouble();

                        System.out.println("");
                        System.out.println("Area");
                        System.out.println(tetrahedro.area(lado, altura));
                        System.out.println("");
                        System.out.println("Volumen");
                        System.out.println(tetrahedro.volumen(lado, altura));
                        System.out.println("");


                    }

                    opcion3 = menu_Geometria3D();
                }

            }

            opcion = menu_principal();
        }




    }

    private static int menu_principal(){
        int opcion = 0;
        while (opcion < 1 || opcion > 3){
            System.out.println("Menu Geometria");
            System.out.println("1.- Figuras 2D");
            System.out.println("2.- Figuras 3D");
            System.out.println("3.- Salir");
            System.out.println("ingrese una opcion ");
            opcion = sn.nextInt();

            if (opcion < 1 || opcion > 3){
                System.out.println("Ingrese valores entre 1 y 3");
            }
        }
        return opcion;
    }

    private static int menu_Geometria2D (){
        int opcion = 0;
        while (opcion < 1 || opcion > 11){
            System.out.println("Menu Geometria");
            System.out.println("1.- Triangulo");
            System.out.println("2.- Cuadrado");
            System.out.println("3.- Circulo");
            System.out.println("4.- Rectangulo");
            System.out.println("5.- Pentagono");
            System.out.println("6.- Hexagono");
            System.out.println("7.- Heptagono");
            System.out.println("8.- Octogono");
            System.out.println("9.- Decagono");
            System.out.println("10.- Endecagono");
            System.out.println("11.- Salir");
            System.out.println("ingrese una opcion ");
            opcion = sn.nextInt();

            if (opcion < 1 || opcion > 11){
                System.out.println("Ingrese valores entre 1 y 3");
            }
        }
        return opcion;
    }

    private static int menu_Geometria3D (){
        int opcion = 0;
        while (opcion < 1 || opcion > 11){
            System.out.println("Menu Geometria");
            System.out.println("1.- Casquete");
            System.out.println("2.- Cilindros");
            System.out.println("3.- Cono");
            System.out.println("4.- Cubo");
            System.out.println("5.- Esfera");
            System.out.println("6.- Octahedro");
            System.out.println("7.- Piramide");
            System.out.println("8.- Prisma");
            System.out.println("9.- Prisa_Triangular");
            System.out.println("10.- Tetrahedro");
            System.out.println("11.- Salir");
            System.out.println("ingrese una opcion ");
            opcion = sn.nextInt();

            if (opcion < 1 || opcion > 11){
                System.out.println("Ingrese valores entre 1 y 3");
            }
        }
        return opcion;
    }


}