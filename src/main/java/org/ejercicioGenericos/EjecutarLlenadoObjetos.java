package org.ejercicioGenericos;

import java.util.HashSet;
import java.util.Set;

public class EjecutarLlenadoObjetos {
    public static void main(String[] args){

        ArrayList<String> coleccion = new ArrayList<String>(4);
        /*coleccion.agregarElemento(new Empleado("Byron","Guamani", "0985050493"));
        coleccion.agregarElemento(new Empleado("Maria","El inca", "0985050493"));
        coleccion.agregarElemento(new Empleado("Julio","El Recreo", "0985050493"));
        coleccion.agregarElemento(new Empleado("Daniel","Condado", "0985050493"));*/
        coleccion.agregarElemento("Maria");
        coleccion.agregarElemento("Julio");
        coleccion.agregarElemento("Daniel");
        coleccion.agregarElemento("Byron");

        String valor = coleccion.obtenerElemento(2);
        //Empleado valor = coleccion.obtenerElemento(2);
        //System.out.println(valor);
        Set<String> elementos = new HashSet<>();
        elementos.add("E");
        elementos.add("E");
        System.out.println(elementos);
    }
}
