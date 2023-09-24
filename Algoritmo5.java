import java.util.Scanner;

public class Algoritmo5 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa las longitudes de los cuatro lados del cuadrilátero:");
        System.out.print("Lado 1: ");
        double lado1 = input.nextDouble();
        System.out.print("Lado 2: ");
        double lado2 = input.nextDouble();
        System.out.print("Lado 3: ");
        double lado3 = input.nextDouble();
        System.out.print("Lado 4: ");
        double lado4 = input.nextDouble();

        if ((lado1 == lado3 && lado2 == lado4) || (lado1 == lado2 && lado3 == lado4) || (lado1 == lado4 && lado2 == lado3)) {
            System.out.println("El cuadrilátero es un trapecio, ya que tiene dos lados paralelos.");
        } else {
            System.out.println("El cuadrilátero no es un trapecio, ya que no tiene dos lados paralelos.");
        }

        input.close();
    }
}
