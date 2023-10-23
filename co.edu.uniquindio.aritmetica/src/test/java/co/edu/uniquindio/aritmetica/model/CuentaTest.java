package co.edu.uniquindio.aritmetica.model;
import co.edu.uniquindio.aritmetica.dto.CuentaDto;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
    CuentaDto cuentaDto;
    @BeforeEach
    void init (){
        cuentaDto = new CuentaDto("Hugo",8000000);
    }
    @Test
    public void testSaldo (){
        double sueldoMinimo = 1250000;
        double saldoCuenta = cuentaDto.saldo();
        assertTrue(saldoCuenta >= sueldoMinimo);
    }
}
