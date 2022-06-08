package org.ejercicioInterfaz;

public class Delfin implements IAnimal{
    public Delfin(String nombre, double edad, char genero){
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
        System.out.println("Estoy jugando en el Agua!! ");
    }

    @Override
    public void comer() {
        System.out.println("Que rico comer pescado :D");
    }

    public void verInformacion(){
        System.out.println(verInformacionDetallada(nombre, edad, genero));
    }
}
