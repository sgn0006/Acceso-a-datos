import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
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
                    Process cal = calculadora.start();

                    System.out.println("====================================");
                    System.out.println("¿Quieres cerrar el programa?");
                    System.out.println("====================================");
                    cerrar = sc.nextLine();

                    if (cerrar.equalsIgnoreCase("si")) {
                        cal.destroyForcibly();
                    }
                    break;
                case 2:
                    ProcessBuilder notepad = new ProcessBuilder("notepad");
                    Process not = notepad.start();

                    System.out.println("====================================");
                    System.out.println("¿Quieres cerrar el programa?");
                    System.out.println("====================================");
                    cerrar = sc.nextLine();

                    if (cerrar.equalsIgnoreCase("si")) {
                        not.destroyForcibly();
                    }
                    break;
                case 3:
                    ProcessBuilder paint = new ProcessBuilder("mspaint");
                    Process pa = paint.start();

                    System.out.println("====================================");
                    System.out.println("¿Quieres cerrar el programa?");
                    System.out.println("====================================");
                    cerrar = sc.nextLine();

                    if (cerrar.equalsIgnoreCase("si")) {
                        pa.destroyForcibly();
                    }
                    break;
                default:
                    break;
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
