import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.RandomAccessFile;

public class Ejemplo6 {

    public static void main(String[] args) {

        try {
            RandomAccessFile fichero = new RandomAccessFile(".\\Tema1\\Ejercicio 6\\abecedario");
            file.seek(5);

            System.out.println("Puntero ANTES de leer: " + file.getFilePointer());
            int unbyte = file.read();
            
            System.out.println("Puntero DESPUES de leer" + file.getFilePointer());
            System.out.println(unbyte);

            File.write("X");
            System.out.println("Puntero DESPUES de escribir" + file.getFilePointer());
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}