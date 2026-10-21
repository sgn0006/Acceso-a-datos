import java.io.RandomAccessFile;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        try {
        RandomAccessFile file = new RandomAccessFile("Ejemplo 7\\abecedario.txt", "r");

        file.seek(0);
        byte[] arrayBytes = new byte[3]; // creamos el aaray
        file.read(arrayBytes, 0, 3); // el off es donde empieza el len es hasta donde llega

        System.out.println("Bytes leidos: " + arrayBytes.length);
        System.out.println("Puntero DESPUES de read: " + file.getFilePointer());

        for (int i = 0; i < arrayBytes.length; i++) {
            System.out.println("arayBytes[ " + i + " ] = " //posición en el array
            + arrayBytes[i] + " -> '" //letra en ASCI
            + (char) arrayBytes[i] + "'"); //letras
        }

        file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}