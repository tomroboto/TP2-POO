package ar.com.concesionaria.tests;

import ar.com.concesionaria.gestion.Concesionaria;
import ar.com.concesionaria.vehiculos.Auto;
import ar.com.concesionaria.vehiculos.Moto;
import ar.com.concesionaria.vehiculos.Vehiculo;

public class TestConcesionaria {
    public static void main(String[] args) {
        System.out.println();
        //Creo los vehículos exactamente como los pide la consigna.
        Auto peugeot206= new Auto("Peugeot", "206", 200_000.00, 4);
        Moto hondaTitan= new Moto("Honda", "Titan", 60_000.00,125);
        Auto peugeot208= new Auto("Peugeot","208",250_000.00, 5);
        Moto yamahaYBR = new Moto("Yamaha","YBR", 80_500.50,160);

        //Creo la concesionaria
        Concesionaria concesionaria= new Concesionaria("Galleta");

        //Cargo los vehículos en un único método sin solicitar ningún ingreso por pantalla.
        concesionaria.agregarVehiculos(peugeot206, hondaTitan, peugeot208, yamahaYBR);
  
        //Imprimo en pantalla los vehículos que tiene la concesionaria con el formato que pide la consigna.
        concesionaria.imprimirVehiculos();
        System.out.println("\n=============================\n");

        //Utilizando la API Stream selecciono al vehículo más caro, al más barato y alguno que contenga la letra Y del ArrayList vehículos.
        concesionaria.vehiculoMasCaro();
        concesionaria.vehiculoMasBarato();
        Vehiculo vehiculoY= concesionaria.buscadorVehiculos("y").get(0);
        System.out.println("Vehículo que contiene en el modelo la letra 'Y': "+
                            vehiculoY.getMarca()+" "+
                            vehiculoY.getModelo()+" "+
                            vehiculoY.precioString());
        System.out.println("\n=============================\n");

        //Utilizando el método sorted() ordeno el stream comparándolo por el precio
        concesionaria.ordenarVehiculosPrecio();
        System.out.println("\n=============================\n");

        //Utilizando el método sorted() ordeno el stream comparando por String
        concesionaria.ordenarVehiculosNombre();
        System.out.println("\n");

    }
}
