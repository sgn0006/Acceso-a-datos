import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int navegador = 0;
            String url = "";
            String rutaChrome = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
            String rutaBrave = "C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe";
            String rutaEdge = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";

            System.out.println("====================================");
            System.out.println(" Buenas que navegador quieres usar:");
            System.out.println("1.- Google Chrome");
            System.out.println("2.- Brave");
            System.out.println("3.- Microsoft Edge");
            System.out.println("====================================");
            navegador = Integer.parseInt(sc.nextLine());

            System.out.println("====================================");
            System.out.println("Dime la url de la pagina que quieras ver");
            System.out.println("====================================");
            url = sc.nextLine();

            switch (navegador) {
                case 1:
                    ProcessBuilder chrome = new ProcessBuilder(rutaChrome, url);
                    chrome.start();
                    break;
                case 2:
                    ProcessBuilder brave = new ProcessBuilder(rutaBrave, url);
                    brave.start();
                    break;
                case 3:
                    ProcessBuilder edge = new ProcessBuilder(rutaEdge, url);
                    edge.start();
                    break;
                default:
                    break;
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
