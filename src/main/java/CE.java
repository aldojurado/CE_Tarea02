import java.util.Scanner;
import java.lang.Math;

public class CE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una opción:");
        System.out.println("1. Problema de coloración BLI");
        System.out.println("2. Problema de codificación");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println("Ingrese el nombre del archivo: ");
            String rutaIngresada = scanner.next();
            Coloracion coloracion = new Coloracion(rutaIngresada);
            //Es posible cambiar el critero de término de ambas búsquedas, en este caso BLI 100 iteraciones y BE 50 iteraciones.
            coloracion.busquedaLocalIterada(100,50);
        } else if (opcion == 2) {
            Funciones f = new Funciones();
            int nBits = 25;
            int a = 0;
            int b = 1;
            double[] x = { 0.5, 0.75, 0.25, 0.10 };
            int[] xCodificado = f.codifica(x, nBits, a, b);
            double[] xDecod = f.decodifica(xCodificado, nBits, a, b);
            for (int i = 0; i < xDecod.length; i++) {
                System.out.println(xDecod[i]);
            }
        } else {
            System.out.println("Opción inválida");
        }
    }

    public static void verificaDatos(String[] args) {

    }

}
