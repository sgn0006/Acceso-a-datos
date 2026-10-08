import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class Ejercicio1 {

    public static void main(String[] args) {

        try {

            LineNumberReader ln = new LineNumberReader(
                    new FileReader("Bloque1\\Tema_2\\Ejercicios\\Ejercicio3\\texto.txt"));

            String linea;

            while ((linea = ln.readLine()) != null) {
                StreamTokenizer st = new StreamTokenizer(new StringReader(linea));
                int palabras = 0;
                int numeros = 0;

                System.out.println("Linea numero: " + ln.getLineNumber());
                System.out.println(linea);

                while (st.nextToken() != StreamTokenizer.TT_EOF) {
                    if (st.ttype == StreamTokenizer.TT_WORD) {
                        palabras++;
                    } else if (st.ttype == StreamTokenizer.TT_NUMBER) {
                        numeros++;
                    }
                }
                System.out.println("Palabras: " + palabras + ", números: " + numeros);
            }
            ln.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
