package Tema1;

public class Ejemplo_1 {

    public static void main(String[] args) {

        File fichero = new File(".\\Tema 1\\crearFichero.txt");
        if (fichero.createNewFile()) {
            System.out.println("Fichero creado: " + fichero.getName());
        } else {
            System.out.println("El fichero ya existe.");
        }

    }
}