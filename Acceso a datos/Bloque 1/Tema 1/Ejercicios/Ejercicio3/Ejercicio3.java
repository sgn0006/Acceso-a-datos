import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        try {

            String texto = "abcdefghijklmnñopqrstuvwxyz";

            FileWriter escribir = new FileWriter(".\\Ejercicios\\Ejercicio3\\datos.txt");
            escribir.write(texto);
            escribir.close();

            Scanner sc = new Scanner(System.in);

            System.out.println("¿Desde donde quieres empezar?");
            int posi = Integer.parseInt(sc.nextLine());
            System.out.println("Escriba un caracter");
            char caracter = sc.next().charAt(0);

            RandomAccessFile random = new  RandomAccessFile("Ejercicios\\Ejercicio3\\Ejercicio3.java", "rw");
            random.seek(posi);
            random.write(caracter);
            random.close();
            

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
