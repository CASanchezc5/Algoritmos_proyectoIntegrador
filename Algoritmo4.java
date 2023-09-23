// algoritmo que me de a elejir entre un triangulo isoceles y un triangulo equilatero y cuando el usuario lo elige saque el area del respectivo triangulo

import java.util.Scanner;

public class Algoritmo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selecciona el tipo de triángulo:");
        System.out.println("1. Triángulo equilátero");
        System.out.println("2. Triángulo isósceles");

        int opcion = input.nextInt();

        if (opcion == 1) {
            calcularAreaTrianguloEquilatero(input);
        } else if (opcion == 2) {
            calcularAreaTrianguloIsosceles(input);
        } else {
            System.out.println("Opción no válida.");
        }

        input.close();
    }

    public static void calcularAreaTrianguloEquilatero(Scanner input) {
        System.out.println("Ingresa la longitud de un lado del triángulo equilátero:");
        double lado = input.nextDouble();

        double area = (Math.sqrt(3) / 4) * Math.pow(lado, 2);

        System.out.println("El área del triángulo equilátero es: " + area);
    }

    public static void calcularAreaTrianguloIsosceles(Scanner input) {
        System.out.println("Ingresa la longitud de la base del triángulo isósceles:");
        double base = input.nextDouble();
        System.out.println("Ingresa la longitud de uno de los lados iguales:");
        double ladoIgual = input.nextDouble();

        double area = (base / 2) * Math.sqrt(Math.pow(ladoIgual, 2) - Math.pow(base / 2, 2));

        System.out.println("El área del triángulo isósceles es: " + area);
    }
}
