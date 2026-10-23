import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


/**
 * Ejercicio5
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
        try {
            
            FileInputStream fis = new FileInputStream("Ejercicio5\\imagen.jpg");
            FileOutputStream fos = new FileOutputStream("Ejercicio5\\imagen_copia.jpg");

            int data;
            int contador = 0;
            long inicio1 = System.currentTimeMillis();
            while ((data = fis.read()) != -1) {
                fos.write(data);
                contador++;
            }
            System.out.println("El archibo ocupa " + contador + " bytes.");
            long final1 = System.currentTimeMillis();
            System.out.println("FileInputStream ha tardado " + (final1 - inicio1) + " ms");

            fis.close();
            fos.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

        try {
            
            BufferedInputStream entrada = new BufferedInputStream(new FileInputStream("Ejercicio5\\imagen.jpg"));
            BufferedOutputStream salida = new BufferedOutputStream(new FileOutputStream("Ejercicio5\\imagen_copia.jpg"));

            byte[] buffer = new byte[4096];
            int bytesLeidos;
            int lineas = 0;

            long inicio2 = System.currentTimeMillis();
            while ((bytesLeidos = entrada.read(buffer)) != -1) {
                salida.write(buffer, 0, bytesLeidos); 
                /*
                 buffer = array que lee 
                 0 = nº de byte donde empieza a leer
                 bytesLeidos = hasta donde quieres que lea
                */
                lineas++;
            }
            System.out.println("El archibo ocupa " + (lineas * 4096) + " bytes.");
            long final2 = System.currentTimeMillis();
            System.out.println("BufferedInputStream º ha tardado " + (final2 - inicio2) + " ms");

            entrada.close();
            salida.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}