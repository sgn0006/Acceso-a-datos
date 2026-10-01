package Ejercicios.Ejercicio4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ejercicio4 {

    public static void main(String[] args) {

        int tamano = 4*1024;
        byte[] buffer = new byte[tamano];

        try {
            
            BufferedInputStream entrada = new BufferedInputStream(new FileInputStream("Ejercicios\\Ejercicio4\\imagen.png"));
            BufferedOutputStream salida = new BufferedOutputStream(new FileOutputStream("Ejercicios\\Ejercicio4\\imagen_copia.png"));

            int leidos;
            int bloque = 1;
            while ((leidos = entrada.read(buffer)) != -1) {
                salida.write(buffer, 0, leidos);
                System.out.println("Fin de bloque " + bloque + ", se han leido " + leidos + " bytes.");
            }

            System.out.println("Se han leido " + bloque + " bloques.");
            entrada.close();
            salida.close();

        } catch (Exception e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
