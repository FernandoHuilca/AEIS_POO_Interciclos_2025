package Test;

import Calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculadoraTest {
    Calculadora calculadora;
    @BeforeEach
    void setUp() {
         calculadora = new Calculadora();
    }

    @Test
    public void sumarDosEnterosTest(){
       //Dado: que exite una calculadora y dos enteros
        int a = 1;
        int b = 2;
        //Cuando: Voy a sumar estos numeros (1+2)
        int resultado = calculadora.sumarDosNumerosEnteros(a, b);
        //Entonces: Espero que el resultado sea 3
        assertEquals(3, resultado);
    }

    @Test
    public void restarDosEnterosTest(){
        //Dado: que exite una calculadora y dos enteros
        int a = 1;
        int b = 2;
        //Cuando: Voy a restar estos numeros (1-2)
        int resultado = calculadora.restarDosEnteros(a, b);
        //Entonces: Espero que el resultado sea -1
        assertEquals(-1, resultado);
    }
    @Test
    public void potenciaEntera(){
        assertTrue(true);
    }



}
