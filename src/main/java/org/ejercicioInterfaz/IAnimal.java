package org.ejercicioInterfaz;

public interface IAnimal {
    default String verInformacionDetallada(String nombre, double edad, char genero){
        return "Nombre: " + nombre + ", edad: "+edad + ",genero: " + genero;
    }
    default void dormir(){
        System.out.println("Estoy durmiendo.. z Z z Z");
    }
    default void jugar(){
        System.out.println("Estoy jugando!! Yujuuu");
    };
    void comer();
}
