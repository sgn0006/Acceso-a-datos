
import java.io.File;

public class Ejemplo_1 {

    public static void main(String[] args) {

        try {
            File fichero = new File("C:\\Users\\PC114\\Desktop\\Acceso a datos\\Tema 1\\Ejemplo 1\\texto.txt");
            
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