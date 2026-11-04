package ar.com.concesionaria.vehiculos;

import java.text.DecimalFormat;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode 

//Sobrescribo el método toString() e implemento la interfaz Comparable
public abstract class Vehiculo implements Comparable<Vehiculo>{
    //La marca y el modelo los declaro como final porque no se modifican, el precio en cambio puede cambiar
    final String marca;
    final String modelo;
    @Setter
    double precio;

    //Declaro el método toString como abstracto para asegurar que quienes hereden esta clase lo implementen.
    @Override
    public abstract String toString();

    @Override
    public int compareTo(Vehiculo vehiculo) {
        String vehiculoActual=this.getMarca()+" "+          //Aprovecho el compareTo de la clase String.
                                this.getModelo()+" "+      //Creo dos Strings con el formato: marca modelo precio
                                this.getPrecio();         //Un String con el vehículo actual y otro con el vehículo a comparar
        String otroVehiculo= vehiculo.getMarca()+" "+
                                vehiculo.getModelo()+" "+
                                vehiculo.getPrecio();
        return vehiculoActual.compareTo(otroVehiculo);
    }

    public String precioString(){
        DecimalFormat df= new DecimalFormat("###,###.00"); //Función que devuelve un String con el precio
        return "$"+df.format(this.precio);                         //escrito exactamente de la forma requerida
    }
}
