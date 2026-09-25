import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Ejemplo5 {

    public static void main(String[] args) {

        String path = "Ejemplo 5\\94e04c3c0c5b2863e321df9de64bfe2b.jpg";
        String pathEscritura = "Ejemplo 5\\94e04c3c0c5b2863e321df9de64bfe2b.jpg";

        try {
            FileInputStream lectura = new FileInputStream(path);
            FileOutputStream escritura = new FileOutputStream(pathEscritura);

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