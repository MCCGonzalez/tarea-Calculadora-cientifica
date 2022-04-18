import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {
    private double a;
    private double b;
    private double r;
    private double h;
    double esperado;


    @Test
    void perimetroCuadrado() {
        a=2;
        esperado=8;
        assertEquals(esperado,calculator.PerimetroCuadrado(a));
    }

    @Test
    void areaCuadrado() {
        a=2;
        esperado=4;
        assertEquals(esperado,calculator.AreaCuadrado(a));
    }

    @Test
    void perimetroRectangulo() {
        a=4;
        b=2;
        esperado=12;
        assertEquals(esperado,calculator.PerimetroRectangulo(a,b));
    }

    @Test
    void areaRectangulo() {
        a=4;
        b=2;
        esperado=8;
        assertEquals(esperado,calculator.AreaRectangulo(a,b));
    }

    @Test
    void perimetroCírculo() {
        double r=3;
        double esperado=18.85;
        assertEquals(esperado,calculator.PerimetroCírculo(r));
    }

    @Test
    void areaCírculo() {
        double r=3;
        double esperado=28.27;
        assertEquals(esperado,calculator.AreaCírculo(r));
    }

    @Test
    void areaEsfera() {
        double r=5;
        double esperado=314.16;
        assertEquals(esperado,calculator.AreaEsfera(r));
    }

    @Test
    void volumenEsfera() {
        double r=3;
        double esperado=523.60;
        assertEquals(esperado,calculator.VolumenEsfera(r));
    }

    @Test
    void areaCubo() {
        double a=2;
        double esperado=24;
        assertEquals(esperado,calculator.AreaCubo(a));
    }

    @Test
    void volumenCubo() {
        double a=2;
        double esperado=8;
        assertEquals(esperado,calculator.VolumenCubo(a));
    }

    @Test
    void areaCono() {
        double r=3;
        double h=5;
        double esperado=83.23;
        assertEquals(esperado,calculator.AreaCono(r,h));
    }

    @Test
    void volumenCono() {
        double r=3;
        double h=5;
        double esperado=47.12;
        assertEquals(esperado,calculator.VolumenCono(r,h));
    }
}