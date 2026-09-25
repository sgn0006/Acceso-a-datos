import java.io.File;

public class Ejemplo3 {

    public static void main(String[] args) {
        try {

            String nombreCarpeta = "NuevaCarpeta";
            File carpeta = new File("Ejemplo 3\\Ejemplo3.java", nombreCarpeta);

            if (carpeta.exists()){
                System.out.println("La carpeta " + carpeta.getName() + " ya existe");
            }else {
                carpeta.mkdirs();
                System.out.println("La carpeta " + carpeta.getName() + " se ha creado");
                System.out.println("Ruta absoluta " + carpeta.getAbsolutePath());
                System.out.println("Ruta relativa " + carpeta.getPath());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
