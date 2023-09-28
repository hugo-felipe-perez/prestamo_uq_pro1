package co.edu.uniquindio.prestamo;

import co.edu.uniquindio.prestamo.model.PrestamoUq;

public class Main {
    public static void main(String[] args) {
        PrestamoUq prestamoUq = inicializarDatosPrueba();
    }
    private static  PrestamoUq inicializarDatosPrueba(){
        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Prestame rapido");
        return prestamoUq;
    }
}