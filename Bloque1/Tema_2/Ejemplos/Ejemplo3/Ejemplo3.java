import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ejemplo3 {

    public static void main(String[] args) {

        try {
            // Guardamos las cosas en el archivo salida.txt y si ne existe, lo creamos
            DataOutputStream dps = new DataOutputStream(
                    new FileOutputStream("Bloque 1\\Tema_2\\Ejemplos\\Ejemplo3\\salida.txt"));
            dps.writeInt(123);
            dps.writeInt(987);
            dps.writeFloat(123.45F);
            dps.writeLong(953325447);
            dps.writeDouble(9.3);
            dps.close();

            // Leemos lo que queramos del archivo salida.txt
            DataInputStream dis = new DataInputStream(
                    new FileInputStream("Bloque 1\\Tema_2\\Ejemplos\\Ejemplo3\\salida.txt"));
            int entero1 = dis.readInt();
            int entero2 = dis.readInt();
            float numeroFloat = dis.readFloat();
            long numeroLong = dis.readLong();
            double numeroDouble = dis.readDouble();

            dis.close();
            System.out.println("Los números enteros son: " + entero1 + " y también: " + entero2);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}