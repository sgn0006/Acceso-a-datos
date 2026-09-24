import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.RandomAccessFile;

public class Ejercicio5 {

    public static void main(String[] args) {

        try {
            RandomAccessFile fichero = new RandomAccessFile();
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