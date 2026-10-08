import java.io.FileReader;
import java.io.StreamTokenizer;

public class Ejemplo1 {

    public static void main(String[] args) {

        try {

            StreamTokenizer streamTokenizer = new StreamTokenizer(new FileReader("Tema_2\\Ejemplos\\Ejemplo1\\datos.txt"));
            streamTokenizer.eolIsSignificant(true);

            int palabras = 0;
            int numeros = 0;
            while (streamTokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                if (streamTokenizer.ttype == StreamTokenizer.TT_WORD) {
                    System.out.println("Palabra: " + streamTokenizer.sval); // token de tipo palabra
                    palabras ++;
                } else if (streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                    System.out.println("Número: " + streamTokenizer.nval); // token de tipo número
                    numeros ++;
                } else if (streamTokenizer.ttype == StreamTokenizer.TT_EOL) {
                    System.out.println("Salto de linea"); // fin de línea
                }
            }
            System.out.println("Hay " + palabras + " y " + numeros + " numeros");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
