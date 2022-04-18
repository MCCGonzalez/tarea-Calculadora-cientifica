import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Menu();
    }
    public static void Menu() {
        Scanner sn = new Scanner(System.in);
        int opcion = 0;
        try {
            System.out.println("""
                    [1] Operaciones aritméticas\s
                    [2] Ecuación cuadrática\s
                    [3] Figuras geométricas \s
                    [4] Sistema ecuaciones lineales\s
                    [5] Ecuación de la recta\s
                    [6] Salir\s
                    \s""");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();
        } catch (Exception e) {
            System.out.println("Ingrese un numero valido");
            System.out.println("-------------------------");
            Menu();
        }
        switch (opcion) {
            case 1:
                Scanner leer = new Scanner(System.in);
                int opcion1 = 0;
                try {
                    do {
                        System.out.println("Elija la opreacion a realizar");
                        System.out.println("[1] Para sumar");
                        System.out.println("[2] Para restar");
                        System.out.println("[3] Para dividir");
                        System.out.println("[4] Para multiplicar");
                        System.out.println("[5] Para calcular el mayor o menor entre dos numeros");
                        System.out.println("[6] Para calcular potencia");
                        System.out.println("[7] Para calcular porcentaje de un numero");

                        opcion1 = leer.nextInt();
                    }while (!(opcion1 >=1 && opcion1<=7));
                }catch (Exception e){
                    System.out.println("Ingrese un numero valido");
                    System.out.println("------------------------");
                    Menu();
                }
                switch (opcion1) {
                    case 1:
                        Suma();
                        break;
                    case 2:
                        Resta();
                        break;
                    case 3:
                        Div();
                        break;
                    case 4:
                        Mult();
                        break;
                    case 5:
                        MayorMenor();
                        break;
                    case 6:
                        Potencia();
                        break;
                    case 7:
                        Porcentaje();
                        break;
                }
                break;
            case 2:
                EcCuadratica();
                break;
            case 3:
                MenuFiguras();
                break;
            case 4:
                SistemaEcuaciones();
                break;
            case 5:
                EcRecta();
                break;
            case 6:
                break;
        }
    }

    public static void EcRecta() {
        System.out.println("Calculo de pendiente");
        Scanner leer = new Scanner(System.in);
        double x1, y1, x2, y2;
        try {
            System.out.println("Ingresa el valor del punto x1");
            x1 = leer.nextDouble();
            System.out.println("Ingresa el valor del punto y1");
            y1 = leer.nextDouble();
            System.out.println("Ingresa el valor del punto x2");
            x2 = leer.nextDouble();
            System.out.println("Ingresa el valor del punto y2");
            y2 = leer.nextDouble();

            System.out.println("Ecuacion para sacar pendiente: m = (y2 - y1) / (x2 - x1)");
            System.out.println("m = (" + y2 + " - " + y1 + ")/(" + x2 + " - " + x1 + ")");

            double m = (y2 - y1) / (x2 - x1);
            System.out.println("m = " + m);
            System.out.println("Calculamos ahora (y-y1) =m (x-x1)");

            double b = y1 - (m * x1);

            System.out.println("La ecuación de la recta para los puntos p1(" + x1 + ", " + y1 + ") y p2(" + x2 + ", " + y2 + ") es:");
            System.out.println("Y = " + m + "X + " + b);
        } catch (Exception e) {
            System.out.println("Ingrese un valor numerico");
            EcRecta();
        }
    }


    public static double Porcentaje() {
        Scanner leer = new Scanner(System.in);
        double a, b, resultado = 0;
        try {
            System.out.println("Ingrese el valor que le quieras sacar porcentaje");
            a = leer.nextDouble();
            System.out.println("Ingrese el porcentaje");
            b = leer.nextDouble();
            resultado = (b * 0.01) * (a);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Ingresa un valor numerico");
            Porcentaje();
        }
        return resultado;
    }

    public static double Potencia() {
        Scanner leer = new Scanner(System.in);
        double a, b, resultado = 0;
        try {
            System.out.println("Ingrese el valor de la base");
            a = leer.nextDouble();
            System.out.println("Ingrese el valor del exponente");
            b = leer.nextDouble();
            resultado = Math.pow(a, b);
            System.out.println("Potencia: " + resultado);
        } catch (Exception e) {
            System.out.println("Ingresa un valor numerico");
            Potencia();
        }
        return resultado;
    }

    public static void MayorMenor() {
        Scanner leer = new Scanner(System.in);
        double a, b;
        try {
            System.out.println("Ingrese el valor de a");
            a = leer.nextDouble();
            System.out.println("Ingrese el valor de b");
            b = leer.nextDouble();
            if (a > b) {
                System.out.println("El numero mayor es: " + a + " y el numero menor es: " +b);
            } else if (a < b) {
                System.out.println("El numero mayor es:" + b+ " y el numero menor es: " +a);
            } else if (a == b) {
                System.out.println("Los numeros son iguales");
            }
        } catch (Exception e) {
            System.out.println("Ingresa un valor numerico");
            MayorMenor();
        }
    }

    public static double Div() {
        Scanner leer = new Scanner(System.in);
        double a, b, resultado = 0;
        try {
            System.out.println("Ingrese el valor de a");
            a = leer.nextDouble();
            System.out.println("Ingrese el valor de b");
            b = leer.nextDouble();
            resultado = a / b;
            System.out.println("Division: " + resultado);
        } catch (Exception e) {
            System.out.println("Ingresa un valor numerico");
            Div();
        }
        return resultado;
    }

    public static double Mult() {
        Scanner leer = new Scanner(System.in);
        double a, b, resultado = 0;
        try {
            System.out.println("Ingrese el valor de a");
            a = leer.nextDouble();
            System.out.println("Ingrese el valor de b");
            b = leer.nextDouble();
            resultado = a * b;
            System.out.println("Multiplicación: " + resultado);
        } catch (Exception e) {
            System.out.println("Ingresa un valor numerico");
            Mult();
        }
        return resultado;
    }

    public static double Resta() {
        Scanner leer = new Scanner(System.in);
        double a, b, resultado = 0;
        try {
            System.out.println("Ingrese el valor de a");
            a = leer.nextDouble();
            System.out.println("Ingrese el valor de b");
            b = leer.nextDouble();
            resultado = a - b;
            System.out.println("Resta: " + resultado);
        } catch (Exception e) {
            System.out.println("Ingresa un valor numerico");
            Resta();
        }
        return resultado;
    }

    public static double Suma() {
        Scanner leer = new Scanner(System.in);
        double a, b, resultado = 0;
        try {
            System.out.println("Ingrese el valor de a");
            a = leer.nextDouble();
            System.out.println("Ingrese el valor de b");
            b = leer.nextDouble();
            resultado = a + b;
            System.out.println("Suma: " + resultado);
        } catch (Exception e) {
            System.out.println("Ingresa un valor numerico");
            Suma();
        }
        return resultado;
    }

    private static double EcCuadratica() {
        Scanner leer = new Scanner(System.in);
        double a, b, c;
        double determinante = 0;
        try {
            System.out.println("ax^2 + bx + c");
            System.out.println("Ingrese el valor para a");
            a = leer.nextDouble();
            System.out.println("Ingrese el valor de bx");
            b = leer.nextDouble();
            System.out.println("Ingrese el valor de c");
            c = leer.nextDouble();
            determinante = Math.pow(b, 2) - (4 * a * c);
            if (determinante > 0) {
                double x1 = (b * (-1) + Math.sqrt(determinante)) / (2 * a);
                double x2 = (b * (-1) - Math.sqrt(determinante)) / (2 * a);
                System.out.println("El resultado de x1 es: " + x1 + " y el de x2 es: " + x2);


            } else {
                System.out.println("Como el discriminante es menor que 0 no tiene una solucion real");
            }
        } catch (Exception e) {
            System.out.println("Ingresa un valor númerico");
            EcCuadratica();
        }
        return determinante;
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

    public static int Opcion(int menoropcion, int mayoropcion) { //Para figuras geometricas
        Scanner entrada = new Scanner(System.in);
        boolean condicion = true;
        do {
            try {
                int valor = entrada.nextInt();
                if (valor >= menoropcion && valor <= mayoropcion) {
                    return valor;
                } else {
                    System.out.println("Error: Opción no valida. Reintente.");
                }
            } catch (Exception e) {
                System.out.println("3RR0R: El valor ingresado no valido. Verifique el dato ingresado");
                int valor = Opcion(menoropcion, mayoropcion);
                return valor;
            }
        } while (condicion);
        return 1;
    }

    public static double Valor() { //Para figuras geometricas
        Scanner entrada = new Scanner(System.in);
        boolean condicion;
        do {
            try {
                double valor = entrada.nextDouble();
                if (valor >= 0) {
                    condicion = false;
                    return valor;
                } else {
                    System.out.println("Error: El valor no ha de ser menor que 0. Reintente.");
                    condicion = true;
                }
            } catch (Exception e) {
                System.out.println("3RR0R: El valor ingresado no valido. Verifique el dato ingresado");
                return Valor();
            }
        } while (condicion);
        return -0.37707;
    }
    public static double ValorGeneral() { //Para valores en general.
        Scanner entrada = new Scanner(System.in);
        boolean condicion= false;
        do {
            try {
                double valor = entrada.nextDouble();
                return valor;
            } catch (Exception e) {
                System.out.println("3RR0R: El valor ingresado no valido. Verifique el dato ingresado");
                double valor = ValorGeneral();
                condicion= true;
                return valor;
            }
        } while (condicion);
    }

    public static void SistemaEcuaciones(){
        double A,B,C,D,E,F;
        System.out.println("Ax + By = C");
        System.out.println("DX + Ey = F");
        System.out.println("Ingrese el valor A.");
        A=ValorGeneral();
        System.out.println("Ingrese el valor B.");
        B=ValorGeneral();
        System.out.println("Ingrese el valor C.");
        C=ValorGeneral();
        System.out.println("Ingrese el valor D.");
        D=ValorGeneral();
        System.out.println("Ingrese el valor E.");
        E=ValorGeneral();
        System.out.println("Ingrese el valor F.");
        F=ValorGeneral();
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



    public static void MenuFiguras(){
        System.out.println("""
                    [1] Cuadrado\s
                    [2] Rectangulo\s
                    [3] Circulo \s
                    [4] Esfera\s
                    [5] Cubo\s
                    [6] Cono\s
                    \s""");
        int option=Opcion(1,7);
        double a;
        double b;
        double r;
        double h;
        switch (option){
            case 1: //Cuadrado
                System.out.println("""
                    [1] Perimetro\s
                    [2] Area\s
                    \s""");
                int option1=Opcion(1,2);
                switch (option1){
                    case 1:                         //Perimetro
                        System.out.println("Ingrese el lado:");
                        a= Valor();
                        System.out.println("El perimetro del cuadrado es: " + PerimetroCuadrado(a));
                        break;
                    case 2:                         //Area
                        System.out.println("Ingrese el lado:");
                        a= Valor();
                        System.out.println("El area del cuadrado es: " + AreaCuadrado(a));
                        break;
                    default:
                       break;
                }
                break;
            case 2:
                System.out.println("""
                    [1] Perimetro\s
                    [2] Area\s
                    \s""");//Rectangulo
                int option2 =Opcion(1,2);
                switch (option2){
                    case 1: //Perimetro
                        System.out.println("Ingrese el lado1:");
                        a= Valor();
                        System.out.println("Ingrese el lado2:");
                        b= Valor();
                        System.out.println("El perimetro del rectangulo es: " + PerimetroRectangulo(a, b));
                        break;
                    case 2:                         //Area
                        System.out.println("Ingrese el lado1:");
                        a= Valor();
                        System.out.println("Ingrese el lado2:");
                        b= Valor();
                        System.out.println("El area del rectangulo es: " + AreaRectangulo(a, b));
                        break;
                    default:
                        break;
                }
                break;
            case 3: //Circulo
                System.out.println("""
                    [1] Perimetro\s
                    [2] Area\s
                    \s""");
                int option3 =Opcion(1,2);
                switch (option3){
                    case 1:                         //Perimetro
                        System.out.println("Ingrese el radio:");
                        r= Valor();
                        System.out.println("El perimetro del circulo es: " + PerimetroCírculo(r));
                        break;
                    case 2:                         //Area
                        System.out.println("Ingrese el radio:");
                        r= Valor();
                        System.out.println("El area del circulo es: " + AreaCírculo(r));
                        break;
                    default:
                        break;
                }
                break;
            case 4: //Esfera
                System.out.println("""
                    [1] Area\s
                    [2] Volumen\s
                    \s""");
                int option4 =Opcion(1,2);
                switch (option4){
                    case 1:                         //Area
                        System.out.println("Ingrese el radio:");
                        r= Valor();
                        System.out.println("El area de la esfera es: " + AreaEsfera(r));
                        break;
                    case 2:                         //Volumen
                        System.out.println("Ingrese el radio:");
                        r= Valor();
                        System.out.println("El volumen de la esfera es: " + VolumenEsfera(r));
                        break;
                    default:
                        break;
                }
                break;
            case 5: //Cubo
                System.out.println("""
                    [1] Area\s
                    [2] Volumen\s
                    \s""");
                int option5 =Opcion(1,2);
                switch (option5){
                    case 1:                         //Area
                        System.out.println("Ingrese el lado:");
                        a= Valor();
                        System.out.println("El area del cubo es: " + AreaCubo(a));
                        break;
                    case 2:                         //Volumen
                        System.out.println("Ingrese el lado:");
                        a= Valor();
                        System.out.println("El volumen del cubo es: " + VolumenCubo(a));
                        break;
                    default:
                        break;
                }
                break;
            case 6: //Cono
                System.out.println("""
                    [1] Area\s
                    [2] Volumen\s
                    \s""");
                int option6 =Opcion(1,2);
                switch (option6){
                    case 1:                         //Area
                        System.out.println("Ingrese el radio:");
                        r= Valor();
                        System.out.println("Ingrese la altura:");
                        h= Valor();
                        System.out.println("El area del cono es: " + AreaCono(r, h));
                        break;
                    case 2:                         //Volumen
                        System.out.println("Ingrese el radio:");
                        r= Valor();
                        System.out.println("Ingrese la altura:");
                        h= Valor();
                        System.out.println("El volumen del cono es: "+ VolumenCono(r, h));
                        break;
                    default:
                        break;
                }
                break;
            default: //Regreso al menu principal.
                Menu();
                break;
        }

    }
}
