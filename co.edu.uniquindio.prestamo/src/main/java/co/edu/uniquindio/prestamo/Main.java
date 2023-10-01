package co.edu.uniquindio.prestamo;

import co.edu.uniquindio.prestamo.model.Objeto;
import co.edu.uniquindio.prestamo.model.PrestamoUq;

public class Main {
    public static void main(String[] args) {
        PrestamoUq prestamoUq = inicializarDatosPrueba();
        Objeto objeto1 = inicializarDatosPrueba2("Libro");
        Objeto objeto2 = inicializarDatosPrueba2("Computador");
        Objeto objeto3 = inicializarDatosPrueba2("pieza electronica");
    }
    private static  PrestamoUq inicializarDatosPrueba(){
        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Prestame rapido");
        return prestamoUq;
    }
    private static Objeto inicializarDatosPrueba2(String nombre){
        Objeto objeto = new Objeto();
        objeto.setNombre(nombre);
        return objeto;
    }
}