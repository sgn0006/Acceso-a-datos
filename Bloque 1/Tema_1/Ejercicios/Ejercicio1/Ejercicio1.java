public class Ejercicio1 {

    public static void main(String[] args) {

        /* 
        El metodo destroy() le pide a Windows que cierre el programa y el metodo destroyForcibly() 
        hace lo mismo pero con más ganas ambos pueden fallar por que a Windows (por politicá de seguridad) no le apetezca
        */
        try {
            // Ejecutamos la Calculadora de Windows
            ProcessBuilder calculadora = new ProcessBuilder("calc");
            Process cal = calculadora.start();


            // Esperamos un poco para que la Calculadora se abra por completo
            Thread.sleep(2000);
            cal.destroyForcibly();

            // Ejecutamos el block de notas de Windows
            ProcessBuilder notepad = new ProcessBuilder("notepad");
            Process not =  notepad.start();

            // Esperamos un poco para que el block de notas se abra por completo
            Thread.sleep(2000);
            not.destroyForcibly();

            // Ejecutamos el Paint de Windows
            ProcessBuilder paint = new ProcessBuilder("mspaint");
            Process pa = paint.start();

            // Esperamos un poco para que el Paint se abra por completo
            Thread.sleep(2000);
            pa.destroyForcibly();

            // Ejecutamos NetBeans que no es de Windows
            ProcessBuilder NetBeans = new ProcessBuilder("C:\\Program Files\\NetBeans-19\\netbeans\\bin\\netbeans64.exe");
            Process net = NetBeans.start();

            // Esperamos un poco para que el Paint se abra por completo
            Thread.sleep(2000);
            net.destroyForcibly();
        } catch (Exception e) {}
    }
}