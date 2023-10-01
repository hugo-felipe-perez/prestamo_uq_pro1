package co.edu.uniquindio.prestamo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrestamoUq {
    private String nombre;
    List<Cliente> listaClientes = new ArrayList<>();
    List<Objeto> listaObjetos = new ArrayList<>();

    public PrestamoUq() {
    }

    public PrestamoUq(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Objeto> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<Objeto> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    public boolean crearCliente (String nombre, String apellido, String cedula, int edad){
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setCedula(cedula);
        cliente.setEdad(edad);
        getListaClientes().add(cliente);
        return true;
    }
    public boolean crearObjeto (String nombre){
        Objeto objeto = new Objeto();
        objeto.setNombre(nombre);
        getListaObjetos().add(objeto);
        return true;
    }
    @Override
    public String toString() {
        return "PrestamoUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
    public static void mostrarMenu() {
        System.out.println("1 - Crear Objeto");
        System.out.println("2 - Actualizar nombre obajeto");
        System.out.println("3 - Eliminar objeto");
        System.out.println("4 - Leer objeto");
        System.out.println("5 - Salir");
    }
    private static int leerEntero(String mensaje) {
        int dato = 0;
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato = Integer.parseInt(captura);
        return dato;
    }


}
