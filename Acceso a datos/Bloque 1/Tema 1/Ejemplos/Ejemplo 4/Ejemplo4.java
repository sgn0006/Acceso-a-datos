import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Ejemplo4 {

    public static void main(String[] args) {

        String path = "./Tema 1/Ejemplos/Ejemplo 4/texto.txt";
        String pathEscritura = "./Tema 1/Ejemplos/Ejemplo 4/texto.txt";

        try {
            //FileReader fr = new FileReader(path);
            InputStreamReader fr = new InputStreamReader(new FileInputStream(path));
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
            fr.close();
            System.out.println("\\nLectura completada.");
        } catch (Exception e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        try {
            //FileWriter fw = new FileWriter(pathEscritura);
            FileWriter fw = new FileWriter(pathEscritura);
            fw.write("Esto es un ejemplo de escritura");
            fw.close();
            System.out.println("Fichero escrito correctamente.");
        } catch (Exception e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}