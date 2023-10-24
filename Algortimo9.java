//Este algoritmo calculará la longitud de la hipotenusa de un triángulo rectángulo dado las longitudes de los dos catetos. 
import java.util.Scanner;

public class TeoremaDePitagoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Este programa calculará la longitud de la hipotenusa de un triángulo rectángulo.");
        System.out.print("Ingresa la longitud del primer cateto: ");
        double cateto1 = input.nextDouble();

        System.out.print("Ingresa la longitud del segundo cateto: ");
        double cateto2 = input.nextDouble();

        // Usamos un bucle while para asegurarnos de que las entradas sean números positivos
        while (cateto1 <= 0 || cateto2 <= 0) {
            System.out.println("Por favor, ingresa longitudes positivas para los catetos.");
            System.out.print("Ingresa la longitud del primer cateto: ");
            cateto1 = input.nextDouble();
            System.out.print("Ingresa la longitud del segundo cateto: ");
            cateto2 = input.nextDouble();
        }

        // Calculamos la longitud de la hipotenusa utilizando el teorema de Pitágoras
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        System.out.println("La longitud de la hipotenusa es: " + hipotenusa);

        input.close();
    }
}
