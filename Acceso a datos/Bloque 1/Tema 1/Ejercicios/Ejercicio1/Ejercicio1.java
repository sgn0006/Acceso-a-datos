import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Ejercicio1 {

    public static void main(String[] args) {

        String texto = "Tema 1\\Ejercicios\\Ejercicio1\\texto.txt";
        String copia = "Tema 1\\Ejercicios\\Ejercicio1\\copia.txt";

        try {

            InputStreamReader reader = new InputStreamReader(new FileInputStream(texto));
            FileOutputStream writer = new FileOutputStream(copia);

            int posicion;

            while ((posicion = reader.read()) != -1) {
                writer.write(posicion);
            }
            reader.close();
            writer.close();
            System.out.println("Se ha escrito correctamente");

        } catch (Exception e) {
            System.err.println("Error al leer o copiar el archivo: " + e.getMessage());
        }

    }
}
