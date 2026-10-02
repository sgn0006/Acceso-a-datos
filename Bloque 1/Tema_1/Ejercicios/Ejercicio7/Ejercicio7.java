import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            String comando = "taskkill /F /IM ";
            int app = 0;
            String cerrar = "";

            System.out.println("====================================");
            System.out.println(" Buenas que app quieres usar:");
            System.out.println("1.- Calculadora");
            System.out.println("2.- Paint");
            System.out.println("3.- Notas");
            System.out.println("====================================");
            app = Integer.parseInt(sc.nextLine());

            switch (app) {
                case 1:
                    ProcessBuilder calculadora = new ProcessBuilder("calc");
                    calculadora.start();
                    comando += "CalculatorApp.exe";
                    break;
                case 2:
                    ProcessBuilder notepad = new ProcessBuilder("notepad");
                    notepad.start();
                    comando += "notepad.exe";

                    break;
                case 3:
                    ProcessBuilder paint = new ProcessBuilder("mspaint");
                    paint.start();
                    comando += "mspaint.exe";

                    break;
                default:
                    break;
            }
            System.out.println("====================================");
            System.out.println("¿Quieres cerrar el programa?");
            System.out.println("====================================");
            cerrar = sc.nextLine();

            if (cerrar.equalsIgnoreCase("si")) {
                ProcessBuilder cmd = new ProcessBuilder("cmd", "/c", comando);
                cmd.start();

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
