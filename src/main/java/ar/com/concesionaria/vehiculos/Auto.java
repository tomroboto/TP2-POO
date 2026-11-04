package ar.com.concesionaria.vehiculos;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode (callSuper = true)
public class Auto extends Vehiculo {
    final int puertas;  //El auto, a diferencia de la moto, tiene como atributo la cantidad de puertas

    public Auto(String marca, String modelo, double precio, int puertas) {
        super(marca, modelo, precio);
        this.puertas= puertas;
    }

    @Override
    public String toString() {
        return  "Marca: "+this.getMarca()+" // "+           //Especifico el método toString()
                "Modelo: "+this.getModelo()+" // "+         //para que se vea exactamente 
                "Puertas: "+this.getPuertas()+" // "+       //como pide la consigna
                "Precio: "+this.precioString();
    }
}
