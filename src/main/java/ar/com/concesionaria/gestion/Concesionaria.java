package ar.com.concesionaria.gestion;

import java.util.ArrayList;
import java.util.Comparator;

import ar.com.concesionaria.vehiculos.Vehiculo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString 

public class Concesionaria implements IEntrega{
    @Setter 
    private String nombre;
    private final ArrayList<Vehiculo> vehiculos= new ArrayList<>();

    public Concesionaria(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Función que agrega uno o más vehículos a la lista de la concesionaria
     * utilizando los VarArgs.
     * @param vehiculosNuevos vehiculo(s) que va(n) a ser agregado(s).
     */
    public void agregarVehiculos(Vehiculo... vehiculosNuevos){
        for(Vehiculo v:vehiculosNuevos) vehiculos.add(v);
    }

    /**
     * Función que elimina uno o más vehículos de la lista de la concesionaria
     * utilizando los VarArgs.
     * @param vehiculosRemovidos vehiculo(s) que va(n) a ser eliminado(s). 
     */
    public void eliminarVehiculo(Vehiculo... vehiculosRemovidos){
        for(Vehiculo v:vehiculosRemovidos) vehiculos.remove(v);
    }

    /**
     * Función que recorre el ArrayList de vehículos e imprime cada uno.
     */
    @Override
    public void imprimirVehiculos() {
        vehiculos.forEach(System.out::println);        
    }
    
    /**
     * Función que imprime por consola el vehículo con el precio más alto.
     */
    @Override
    public void vehiculoMasCaro() {
        Vehiculo vehiculoCaro=  vehiculos
                                .stream()
                                .max(Comparator.comparing(Vehiculo::getPrecio))
                                .get();
        System.out.println("Vehículo más caro: "+
                            vehiculoCaro.getMarca()+" "+
                            vehiculoCaro.getModelo());
    }

    /**
     * Función que imprime por consola el vehículo con el precio más bajo.
     */
    @Override
    public void vehiculoMasBarato() {
        Vehiculo vehiculoBarato=vehiculos
                                        .stream()
                                        .min(Comparator.comparing(Vehiculo::getPrecio))
                                        .get();
        System.out.println("Vehículo más barato: "+
                            vehiculoBarato.getMarca()+" "+
                            vehiculoBarato.getModelo());
    }

    /**
     * Función que recibe un String y busca en el ArrayList
     * si algún vehiculo lo contiene.
     * @param busqueda cadena de texto que se va a buscar en los vehiculos.
     */
    @Override 
    public ArrayList<Vehiculo> buscadorVehiculos(String busqueda) {
        ArrayList<Vehiculo> resultado= new ArrayList<>();
        vehiculos
                .stream()
                .filter(v->v.toString().toLowerCase().contains(busqueda))
                .forEach(resultado::add);
        return resultado;
    }

    /**
     * Función que ordena los vehiculos por precio y los imprime por consola
     * comenzando por el más alto.
     */
    @Override
    public void ordenarVehiculosPrecio() {
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        vehiculos
                .stream()
                .sorted(Comparator.comparing(Vehiculo::getPrecio)
                .reversed())
                .forEach(v-> System.out.println(v.getMarca()+" "+v.getModelo()));
    }

    /**
     * Función que ordena los vehiculos alfabéticamente y los imprime por consola
     */
    @Override
    public void ordenarVehiculosNombre() {
        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");
        vehiculos
                .stream()
                .sorted(Comparator.comparing(Vehiculo::toString))
                .forEach(System.out::println);
    }
}
