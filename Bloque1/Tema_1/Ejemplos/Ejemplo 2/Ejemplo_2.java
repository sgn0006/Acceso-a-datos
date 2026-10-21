import java.io.File;

public class Ejemplo_2 {

    public static void main(String[] args) {

        try {
            String nombreCarpeta = "Backup";
            File ficheroOrigen = new File("Tema 1\\Ejemplos\\crearFichero.txt");
            File carpeta = new File(".\\Tema 1\\Ejemplos\\Ejemplo 2", nombreCarpeta);

            File ficheroDestino = new File("Tema 1\\Ejemplos\\Ejemplo 2\\Backup\\fichero_movido.txt", nombreCarpeta);
            
            carpeta.mkdirs();
            
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