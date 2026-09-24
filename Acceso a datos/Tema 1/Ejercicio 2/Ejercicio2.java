public class Ejemplo_2 {

    public static void main(String[] args) {

        File ficheroOrigen = new File(".\\Tema 1\\crearFichero.txt");
        File ficheroDestino = new File(".\\Tema 1\\crearFichero.txt");

        try {
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