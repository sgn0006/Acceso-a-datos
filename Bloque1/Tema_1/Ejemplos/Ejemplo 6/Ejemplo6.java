import java.io.RandomAccessFile;

public class Ejemplo6 {

    public static void main(String[] args) {

        try {
            RandomAccessFile file = new RandomAccessFile("Ejemplo 6\\abecedario.txt", "rw");
            file.seek(5);

            System.out.println("Puntero ANTES de leer: " + file.getFilePointer());
            int unbyte = file.read();
            
            System.out.println("Puntero DESPUES de leer: " + file.getFilePointer());
            System.out.println(unbyte);

            file.write('4');
            System.out.println("Puntero DESPUES de escribir: " + file.getFilePointer());
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}