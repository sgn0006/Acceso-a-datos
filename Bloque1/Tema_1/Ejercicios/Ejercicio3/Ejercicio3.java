import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        try {

            String texto = "abcdefghijklmnñopqrstuvwxyz";

            FileWriter escribir = new FileWriter("Ejercicio3\\datos.txt");
            escribir.write(texto);
            escribir.close();


            System.out.println("¿Desde donde quieres empezar?");
            int posi = Integer.parseInt(sc.nextLine());
            System.out.println("Escriba un caracter");
            char caracter = sc.next().charAt(0);

            RandomAccessFile random = new  RandomAccessFile("Ejercicio3\\datos.txt", "rw");
            random.seek(posi);
            random.write(caracter);
            random.close();
            sc.close();
            escribir.close();    

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}