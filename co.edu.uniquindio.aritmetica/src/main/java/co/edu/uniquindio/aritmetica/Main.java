package co.edu.uniquindio.aritmetica;

import co.edu.uniquindio.aritmetica.model.Aritmetica;

public class Main {
    public static void main(String[] args) {
        Aritmetica aritmetica = inicializarDatosPrueba();
        System.out.println(aritmetica.suma(5,4));
        System.out.println(aritmetica.resta(6.3,8.5));
        System.out.println(aritmetica.multipicacion(3.8,4.5));
        System.out.println(aritmetica.division(85,46));
        resultadoEsperadoSuma(aritmetica);


    }

    private static Aritmetica inicializarDatosPrueba() {
        Aritmetica aritmetica = new Aritmetica();
        return  aritmetica;
    }
    private static void resultadoEsperadoSuma (Aritmetica aritmetica){
        double resultado = aritmetica.suma(2,2);
        if (resultado == 4){
            System.out.println("el resultado esperado si es: "+resultado);
        }
        else {
            System.out.println(resultado+" no es el resultado esperado");
        }
    }

}