import java.io.File;

public class Ejemplo_2 {

    public static void main(String[] args) {

        try {
            File ficheroOrigen = new File("C:\\Users\\PC114\\Desktop\\Acceso a datos\\Tema 1\\texto.txt");
            File ficheroDestino = new File("C:\\Users\\PC114\\Desktop\\Acceso a datos\\Tema 1\\Ejemplo 2\\texto.txt");

            if (ficheroOrigen.renameTo(ficheroDestino)) {
                System.out.println("El fichero se movió correctamente");
            } else {
                System.out.println("El fichero no pudo moverse");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}