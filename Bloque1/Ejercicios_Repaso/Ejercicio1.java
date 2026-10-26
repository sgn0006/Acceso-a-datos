
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Ejercicio1 {

    /*
    Escribe un programa que cree un archivo llamado notas_estudiantes.txt. 
    Pide al usuario que introduzca por consola los nombres de tres alumnos junto con sus notas finales ,
     y guarda cada entrada en una línea diferente dentro del archivo. 
    Si el archivo ya existe, el programa debe sobreescribir el contenido previo.
     */

    public static void main(String[] args) {

        try {

            String nombre = "";
            int nota1 = 0;
            int nota2 = 0;
            int nota3 = 0;
            double nota = 0;

            Scanner sc = new Scanner(System.in);

            BufferedWriter bfw = new BufferedWriter(new FileWriter("Ejercicio1.txt"));

            for (int i = 0; i < 3; i++) {
                System.out.println("Dime el nombre de un alumno");
                nombre = sc.nextLine();
                System.out.println("Dime sus tres notas trimestrales");
                nota1 = Integer.parseInt(sc.nextLine());
                nota2 = Integer.parseInt(sc.nextLine());
                nota3 = Integer.parseInt(sc.nextLine());

                nota = ((nota1 + nota2 + nota3) / 3);

                bfw.write("El alumno: " + nombre + " ha sacado, un" + nota);

            }

            sc.close();
            bfw.close();

            System.out.println("Se ha escrito en el fichero");

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
