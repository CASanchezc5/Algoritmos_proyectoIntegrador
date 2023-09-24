/* algoritmo que me calcula el área de un poligono regular, Para calcular el área de un polígono regular, puedes usar la siguiente fórmula general:
Área = (n * s^2) / (4 * tan(π / n))
Donde:
n es el número de lados del polígono.
s es la longitud de un lado del polígono.*/

import java.util.Scanner;
import java.lang.Math;

public class Algoritmo6{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora de área de polígonos regulares");
        System.out.print("Ingrese el número de lados del polígono: ");
        int n = input.nextInt();

        if (n < 3) {
            System.out.println("Un polígono debe tener al menos 3 lados.");
        } else {
            System.out.print("Ingrese la longitud de un lado del polígono: ");
            double s = input.nextDouble();

            double area = calcularAreaPoligonoRegular(n, s);

            System.out.println("El área del polígono regular es: " + area);
        }

        input.close();
    }

    public static double calcularAreaPoligonoRegular(int n, double s) {
        return (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
    }

  
}
