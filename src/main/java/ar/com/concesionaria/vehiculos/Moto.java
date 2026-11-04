package ar.com.concesionaria.vehiculos;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode (callSuper = true)
public class Moto extends Vehiculo{
    final int cilindrada;   //La moto, a diferencia del auto, tiene como atributo el número de cilindrada

    public Moto(String marca, String modelo, double precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada=cilindrada;
    }

    @Override
    public String toString() {
        return  "Marca: "+this.getMarca()+" // "+               //Especifico el método toString()
                "Modelo: "+this.getModelo()+" // "+             //para que se vea exactamente 
                "Cilindrada: "+this.getCilindrada()+"c // "+    //como pide la consigna
                "Precio: "+this.precioString();
    }

}
