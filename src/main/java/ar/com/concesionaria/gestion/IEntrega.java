package ar.com.concesionaria.gestion;

import java.util.ArrayList;

import ar.com.concesionaria.vehiculos.Vehiculo;

public interface IEntrega {
    //Defino las funciones que va a pedir la entrega
    public abstract void imprimirVehiculos();
    public abstract ArrayList<Vehiculo> vehiculoMasCaro();
    public abstract ArrayList<Vehiculo> vehiculoMasBarato();
    public abstract ArrayList<Vehiculo> buscadorVehiculos(String busqueda);
    public abstract ArrayList<Vehiculo> ordenarVehiculosPrecio();
    public abstract ArrayList<Vehiculo> ordenarVehiculosNombre();
}
