import java.lang.Math;
import java.util.Scanner;

public class calculator {
    public static void SistemaEcuaciones(){
        double A,B,C,D,E,F;
        A=Valor();
        B=Valor();
        C=Valor();
        D=Valor();
        E=Valor();
        F=Valor();
        if(Check_SE(A, B, C, D)){
            System.out.println("La ecuacion no tiene solucion, ingrese nuevos valores.");
            SistemaEcuaciones();
        }else{
            if(SistemaEcuacionesD(A,B,D,E)==0){
                System.out.println("La ecuacion no tiene solucion, ingrese nuevos valores.");
                SistemaEcuaciones();
            }else {
                System.out.println("El valor de X es: " + (SistemaEcuacionesDx(B, C, E, F) / SistemaEcuacionesD(A, B, D, E)));
                System.out.println("El valor de Y es: " + (SistemaEcuacionesDy(A, C, D, F) / SistemaEcuacionesD(A, B, D, E)));

            }
        }

    }
    public static boolean Check_SE(double A,double B,double C,double D){
        double check = (A*D) - (B*C);
        if(check == 0){
            return true;
        }else{
        return false;
    }
    }
    public static double SistemaEcuacionesD(double A, double B, double D, double E){
        return ((A * E) - (B * D));
    }

    public static double SistemaEcuacionesDx(double B, double C,double E, double F){
        return ((C * E) - (B * F));
    }
    public static double SistemaEcuacionesDy(double A, double C, double D, double F){
        return ((A * F) - (C * D));
    }

    public static double PerimetroCuadrado(double a){
        return a*4;
    }
    public static double AreaCuadrado(double a){
        return a*a;
    }

    public static double PerimetroRectangulo(double a,double b){
        return a*2+b*2;
    }
    public static double AreaRectangulo(double a,double b){
        return a*b;
    }

    public static double PerimetroCírculo(double r){
        double resultado= (2*Math.PI*r);
        return Math.round(resultado * 100.0)/100.0;
    }
    public static double AreaCírculo(double r){
        return Math.PI*Math.pow(r,2);
    }

    public static double AreaEsfera(double r){
        return 4*Math.PI*Math.pow(r,2);
    } //Probar Area y Volumen
    public static double VolumenEsfera(double r){
        return (4*Math.PI*Math.pow(r,3))/3;
    }

    public static double AreaCubo(double a){
        return (Math.pow(a,2)*6);
    }
    public static double VolumenCubo(double a){
        return Math.pow(a,3);
    }

    public static double AreaCono(double r,double h){ //radio y altura
        double base= Math.PI*Math.pow(r,2);
        double Hlateral= Math.sqrt((Math.pow(h,2)+Math.pow(r,2)));
        double AreaLatetal= Math.PI*r*Hlateral;
        return base+AreaLatetal;
    }
    public static double VolumenCono(double r,double h){ //radio y altura
        double base= Math.PI*Math.pow(r,2);
        return base*h/3;
    }
    public static double Valor() { //Para valores en general.
        Scanner entrada = new Scanner(System.in);
        boolean condicion;
        do {
            try {
                double valor = entrada.nextDouble();
                return valor;
            } catch (Exception e) {
                System.out.println("3RR0R: El valor ingresado no valido. Verifique el dato ingresado");
                double valor = Valor();
                return valor;
            }
        } while (condicion);
    }

    public static double ValorOptimo() { //Para figuras geometricas
        Scanner entrada = new Scanner(System.in);
        boolean condicion = true;
        do {
            try {
                double valor = entrada.nextDouble();
                if (valor >= 0) {
                    return valor;
                } else {
                    System.out.println("Error: El valor no ha de ser menor que 0. Reintente.");
                }
            } catch (Exception e) {
                System.out.println("3RR0R: El valor ingresado no valido. Verifique el dato ingresado");
                double valor = ValorOptimo();
                return valor;
            }
        } while (condicion);
        return -0.37707;
    }

    public static void MenuPrincipal(){
        int option;
        switch (option=1){
            case 1: //operaciones elementales
                MenuOperaciones();
                break;
            case 2: //mayor,menor
                MenuMyM();
                break;
            case 3: // Ecuacion Cuadratica

                break;
            case 4: //Figuras: Perimetro,Area y Volumen
                MenuFiguras();
                break;
            case 5: //Sistema de ecuaciones

                break;
            case 6: // Ecuacion de la recta

                break;
            default: //Bucle
                MenuPrincipal();
                break;
        }
    }
    public static void MenuOperaciones(){
        int option;
        switch (option=1){
            case 1: //Suma
                break;
            case 2: //resta
                break;
            case 3: //Multiplicar
                break;
            case 4: //Division
                break;
            case 5: //Potencia
                break;
            default: //Regreso al menu principal.
                MenuPrincipal();
                break;
        }

    }
    public static void MenuMyM(){
        int option;
        switch (option=1){
            case 1: //Mayor
                break;
            case 2: //Menor
                break;
            default: //Regreso al menu principal.
                MenuPrincipal();
                break;
        }
    }
    public static void MenuFiguras(){
        int option;
        switch (option=1){
            case 1: //Cuadrado
                break;
            case 2: //Rectangulo
                break;
            case 3: //Circulo
                break;
            case 4: //Esfera
                break;
            case 5: //Cubo
                break;
            case 6: //Cono
                break;
            default: //Regreso al menu principal.
                MenuPrincipal();
                break;
        }

    }
}