
import java.io.File;

public class Ejemplo_1 {

    public static void main(String[] args) {

        try {
            File fichero = new File("Tema 1\\Ejemplos\\Ejemplo 1");
            
            if (fichero.createNewFile()) {
                System.out.println("Fichero creado: " + fichero.getName());
            } else {
                System.out.println("El fichero ya existe.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}