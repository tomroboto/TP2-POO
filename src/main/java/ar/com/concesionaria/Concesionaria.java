package ar.com.concesionaria;

import java.util.ArrayList;

import ar.com.concesionaria.vehiculos.Vehiculo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString 

public class Concesionaria {
    @Setter 
    private String nombre;
    private final ArrayList<Vehiculo> vehiculos= new ArrayList<>();

    public Concesionaria(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Función que agrega uno o más vehículos a la lista de la concesionaria
     * utilizando los VarArgs
     * @param vehiculosNuevos vehiculo(s) que va(n) a ser agregado(s).
     */
    public void agregarVehiculos(Vehiculo... vehiculosNuevos){
        for(Vehiculo v:vehiculosNuevos) vehiculos.add(v);
    }
    /**
     * Función que elimina uno o más vehículos de la lista de la concesionaria
     * utilizando los VarArgs
     * @param vehiculosRemovidos vehiculo(s) que va(n) a ser eliminado(s). 
     */
    public void eliminarVehiculo(Vehiculo... vehiculosRemovidos){
        for(Vehiculo v:vehiculosRemovidos) vehiculos.remove(v);
    }
}
