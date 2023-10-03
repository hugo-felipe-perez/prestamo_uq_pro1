package co.edu.uniquindio.prestamo;

import co.edu.uniquindio.prestamo.model.Cliente;
import co.edu.uniquindio.prestamo.model.PrestamoUq;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrestamoUq prestamoUq= inicializarDatosPrueba();

        //CRUD

        //Ceate
        crearCliente("Hugo ","Perez","103812",21,prestamoUq);
        crearCliente("Alberto","lopez","237272",73,prestamoUq);
        crearCliente("hajsu","jahsa","83283",83,prestamoUq);
        crearCliente("kdkss","ksaksa","83931",22,prestamoUq);
        //Read
        mostrarInformacionCliente(prestamoUq);
        //Update

        //Delete
        eliminarCliente(prestamoUq,"83931");
        System.out.println("---> Informacion luego de eliminar: ");
        mostrarInformacionCliente(prestamoUq);
    }




    private static PrestamoUq inicializarDatosPrueba() {
        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Prestamo Rapido");
        return  prestamoUq;
    }
    private static void crearCliente(String nombre, String apellido, String cedula,
                                     int edad, PrestamoUq prestamoUq) {
        prestamoUq.crearCliente(nombre,apellido,cedula,edad);
    }
    private static void mostrarInformacionCliente(PrestamoUq prestamoUq) {
        List<Cliente> listaClientes = prestamoUq.obtenerClientes();
        int tamanioLista = prestamoUq.getListaClientes().size();
        for (int i=0; i<tamanioLista;i+=1){
            Cliente cliente = prestamoUq.getListaClientes().get(i);
            System.out.println("Cliente: "+cliente.toString());
        }
    }
    private static void eliminarCliente(PrestamoUq prestamoUq,String cedula) {
        prestamoUq.eliminarCliente(cedula);
    }
}