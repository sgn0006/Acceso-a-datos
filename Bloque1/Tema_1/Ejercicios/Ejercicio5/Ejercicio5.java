import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicio5 {

    public static void main(String[] args) {
        
        try {
            
            String comando = "ping medac,es";

            ProcessBuilder cmd = new ProcessBuilder("cmd" , "/c", comando );
            Process proceso = cmd.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
            String linea;

            while ((linea = reader.readLine()) !=null) {
                System.out.println(linea);
            }

            int exitCode = proceso.waitFor();
            System.out.println("Comando terminado con código de salida: " + exitCode);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}