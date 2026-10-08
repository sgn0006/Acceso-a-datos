import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime que linea quieres que lea.");
            String nlinea = sc.nextLine();

            LineNumberReader ln = new LineNumberReader(new FileReader("Bloque1\\Tema_2\\Ejercicios\\Ejercicio2\\Entrada.txt"));
            String linea;

            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
