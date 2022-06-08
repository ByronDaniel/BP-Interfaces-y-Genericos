package org.ejercicioInterfaz;

public class Gato implements IAnimal{
    public Gato(String nombre, double edad, char genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    String nombre;
    double edad;
    char genero;
    @Override
    public String verInformacionDetallada(String nombre, double edad, char genero) {
        return IAnimal.super.verInformacionDetallada(nombre, edad, genero);
    }

    @Override
    public void jugar() {
        IAnimal.super.jugar();
    }

    @Override
    public void comer() {
        System.out.println("Soy un gatito aniñado y estoy comiendo pepitas con sabor a ratón jeje");
    }
    public void verInformacion(){
        System.out.println(verInformacionDetallada(nombre, edad, genero));
    }

    @Override
    public void dormir(){
        System.out.println("Voy a dormir en el techo zZzzZZ");
    }
}
