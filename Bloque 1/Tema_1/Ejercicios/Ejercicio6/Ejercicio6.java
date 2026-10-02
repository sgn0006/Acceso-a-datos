import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("=======================================");
            System.out.println("        ¿Que asiento quiere?");
            System.out.println("=======================================");
            sc.nextLine();
            RandomAccessFile reserva = new RandomAccessFile("Ejercicio6\\asientos.txt", "rw");

            int asiento = Integer.parseInt(sc.nextLine());
            if (asiento > 19) {
                System.out.println("No existe ese asiento");
            } else if (asiento < 0) {
                System.out.println("No existe ese asiento");
            } else if (reserva.readChar() == 'C') {
                System.out.println("Ese asiento ya está ocupado");
            } else {
                reserva.seek(asiento);
                reserva.write('C');
            }
            reserva.close();
            sc.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
