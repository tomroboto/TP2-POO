package ar.com.concesionaria.tests;

import java.util.ArrayList;
import java.util.Comparator;

import ar.com.concesionaria.Concesionaria;
import ar.com.concesionaria.vehiculos.Auto;
import ar.com.concesionaria.vehiculos.Moto;
import ar.com.concesionaria.vehiculos.Vehiculo;

public class testConcesionaria {
    public static void main(String[] args) {
        System.out.println();
        //Creo los vehículos exactamente como los pide la consigna.
        Auto peugeot206= new Auto("Peugeot", "206", 200_000.00, 4);
        Moto hondaTitan= new Moto("Honda", "Titan", 60000.00,125);
        Auto peugeot208= new Auto("Peugeot","208",250000.00, 5);
        Moto yamahaYBR = new Moto("Yamaha","YBR", 80500.50,160);

        //Creo la concesionaria y defino un ArrayList de los vehículos.
        Concesionaria concesionaria= new Concesionaria("Galleta");
        ArrayList<Vehiculo> vehiculos;

        //Cargo los vehículos en un único método sin solicitar ningún ingreso por pantalla.
        concesionaria.agregarVehiculos(peugeot206, hondaTitan, peugeot208, yamahaYBR);
        vehiculos= concesionaria.getVehiculos();

        //Imprimo en pantalla los vehículos que tiene la concesionaria con el formato que pide la consigna.
        vehiculos.forEach(System.out::println);
        System.out.println("\n=============================\n");

        //Utilizando la API Stream selecciono al vehículo más caro, al más barato y alguno que contenga la letra Y del ArrayList vehículos.
        Vehiculo vehiculoCaro=  vehiculos
                                        .stream()
                                        .max(Comparator.comparing(Vehiculo::getPrecio))
                                        .get();
        Vehiculo vehiculoBarato=vehiculos
                                        .stream()
                                        .min(Comparator.comparing(Vehiculo::getPrecio))
                                        .get();
        Vehiculo vehiculoY=     vehiculos
                                        .stream()
                                        .filter(v->v.toString().toLowerCase().contains("y"))
                                        .min(Comparator.comparing(Vehiculo::toString))
                                        .get();
        System.out.println("Vehículo más caro: "+
                            vehiculoCaro.getMarca()+" "+
                            vehiculoCaro.getModelo());

        System.out.println("Vehículo más barato: "+
                            vehiculoBarato.getMarca()+" "+
                            vehiculoBarato.getModelo());

        System.out.println("Vehículo que contiene en el modelo la letra 'Y': "+
                            vehiculoY.getMarca()+" "+
                            vehiculoY.getModelo()+" "+
                            vehiculoY.precioString());

        System.out.println("\n=============================\n");

        //Utilizando el método sorted() ordeno el stream comparándolo por el precio
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        vehiculos
                .stream()
                .sorted(Comparator.comparing(Vehiculo::getPrecio)
                .reversed())
                .forEach(v-> System.out.println(v.getMarca()+" "+v.getModelo()));
        System.out.println("\n=============================\n");

        //Utilizando el método sorted() ordeno el stream comparando por String
        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");
        vehiculos
                .stream()
                .sorted(Comparator.comparing(Vehiculo::toString))
                .forEach(System.out::println);
        System.out.println("\n");
    }
}
