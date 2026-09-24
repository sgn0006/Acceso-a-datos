import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Ejemplo5 {

    public static void main(String[] args) {

        String path = "./images.jpg";
        String pathEscritura = "./imagescopia.jpg";

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