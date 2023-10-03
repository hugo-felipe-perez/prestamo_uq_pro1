package co.edu.uniquindio.prestamo.model;

import java.util.ArrayList;
import java.util.List;

public class PrestamoUq {
    private String nombre;
    List<Cliente> listaClientes = new ArrayList<>();
    public PrestamoUq(String nombre) {
        this.nombre = nombre;
    }

    public PrestamoUq() {
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

    public void setListaClientes(List<Cliente> listaCliente) {
        this.listaClientes = listaCliente;
    }

    /**
     * metodo para crear un cliente
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @return boolean
     */
    public boolean crearCliente (String nombre, String apellido, String cedula, int edad){
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setCedula(cedula);
        cliente.setEdad(edad);
        getListaClientes().add(cliente);
        return true;
    }

    /**
     * Metodo para obtener los clientes
     * @return List<Cliente>
     */
    public List<Cliente> obtenerClientes() {
        return getListaClientes();
    }
    @Override
    public String toString() {
        return "PrestamoUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    /**
     * Metodo para eliminar un cliente
     * @param cedula
     */
    public void eliminarCliente(String cedula) {
        int tamanioLista = getListaClientes().size();
        for(int i=0; i<tamanioLista; i+=1){
            Cliente cliente = getListaClientes().get(i);
            if(cliente.getCedula().equalsIgnoreCase(cedula)){
                getListaClientes().remove(i);
                break;
            }
        }
    }
}
