package org.ejercicioInterfaz;

public class Perro implements IAnimal{
    public Perro(String nombre, double edad, char genero){
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
    public void dormir() {
        System.out.println("Voy a dormir en la cama con mi dueño zZzZZz");
    }

    @Override
    public void jugar() {
        System.out.println("No me gusta jugar soy un perrito aburrido");
    }

    @Override
    public void comer() {
        System.out.println("Voy a comer croquetitas");
    }
    public void verInformacion(){
        System.out.println(verInformacionDetallada(nombre, edad, genero));
    }
}
