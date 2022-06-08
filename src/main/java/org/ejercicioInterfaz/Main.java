package org.ejercicioInterfaz;public class Main {
    public static void main(String[] args) {
        System.out.println("------------------Delfin-------------------");
        Delfin delfin = new Delfin("Dolphin", 3, 'M');
        delfin.verInformacion(); // Método implementado en la interfaz
        delfin.jugar();// Sobrecarga del método
        delfin.comer();// Sobrecarga del método
        delfin.dormir();// Método implementado en la interfaz

        System.out.println("------------------Gato-------------------");
        Gato gato = new Gato("Michu", 1, 'M');
        gato.verInformacion();// Método implementado en la interfaz
        gato.jugar();// Método implementado en la interfaz
        gato.comer();// Sobrecarga del método
        gato.dormir();// Sobrecarga del método

        System.out.println("------------------Perro-------------------");
        Perro perro = new Perro("Akira", 5, 'F');
        perro.verInformacion();// Método implementado en la interfaz
        perro.jugar();// Sobrecarga del método
        perro.comer();// Sobrecarga del método
        perro.dormir();// Sobrecarga del método
    }
}