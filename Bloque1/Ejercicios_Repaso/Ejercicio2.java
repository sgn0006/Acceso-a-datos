
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio2 {

    /*
    Crea un programa que procese un archivo de texto llamado documento.txt:
    Utiliza BufferedReader para leer el archivo línea por línea e imprimir únicamente las líneas que tengan más de 20 caracteres.
    Utiliza FileInputStream con un array de bytes/caracteres de tamaño fijo y 
    muestra por pantalla cuántos bloques exactos hicieron falta para leer todo el documento.
     */
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("imagen.png"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("imagen_copia.png"));
            String linea;
            int copia = 0;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                
            }
            br.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
