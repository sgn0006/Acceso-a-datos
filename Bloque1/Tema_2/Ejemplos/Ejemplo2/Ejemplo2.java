import java.io.LineNumberReader;
import java.io.FileReader;

public class Ejemplo2 {
    
    public static void main(String[] args) {
        
        try {
            
            LineNumberReader ln = new LineNumberReader(new FileReader("Ejemplo2\\datos.txt"));
            String line;
            while ((line = ln.readLine()) != null) {
                System.out.println("Número de linea: " + ln.getLineNumber());
                // getLineNumber sirve para mostrar el número de linea exacto
                System.out.println(line);
                // el readLine muestra lo que tiene la linea
            }


        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
