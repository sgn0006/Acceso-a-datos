import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio2 {
    
    public static void main(String[] args) {

        String path = "Tema 1\\Ejercicios\\Ejercicio2\\image.jpg";
        String pathEscritura = "Tema 1\\Ejercicios\\Ejercicio2\\image_copia.png";

        try {
            FileReader lectura = new FileReader(path);
            FileWriter escritura = new FileWriter(pathEscritura);

            int data;
            int num = 0;

            while ((data = lectura.read()) != -1) {
                num++;
                escritura.write(data);
                //System.out.print(data);
            }
            System.out.println(num);
            lectura.close();
            escritura.close();
            
        } catch (Exception e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }    
    }
}
