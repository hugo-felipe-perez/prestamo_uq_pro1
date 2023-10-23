package programacion1.aritmetica;

import co.edu.uniquindio.aritmetica.model.Aritmetica;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AritmeticaTest {
    private Aritmetica aritmetica;
    @BeforeEach
    public void init(){
        aritmetica = new Aritmetica();
    }

    @Test
    public void sumaValorEsperadoTest (){

        double resultado = aritmetica.suma(2,2);
        double esperado = 4;
        Assertions.assertEquals(esperado,resultado);
        //assertTrue(esperado > resultado);
    }
    @Test
    public void sumaValorMayorTest (){

        double resultado = aritmetica.suma(2,2);
        double esperado = 4;
        //Assertions.assertEquals(esperado,resultado);
        assertTrue(esperado > resultado);
    }
}
