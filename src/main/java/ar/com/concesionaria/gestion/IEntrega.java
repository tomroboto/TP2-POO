package ar.com.concesionaria.gestion;

import java.util.ArrayList;

import ar.com.concesionaria.vehiculos.Vehiculo;

public interface IEntrega {
    //Defino las funciones que va a pedir la entrega
    public abstract void imprimirVehiculos();
    public abstract void vehiculoMasCaro();
    public abstract void vehiculoMasBarato();
    public abstract ArrayList<Vehiculo> buscadorVehiculos(String busqueda);
    public abstract void ordenarVehiculosPrecio();
    public abstract void ordenarVehiculosNombre();
}
