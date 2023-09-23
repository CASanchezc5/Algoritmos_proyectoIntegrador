//CALCULAR EL AREA DE UN TRIANGULO

import java.util.Scanner;

public class Algoritmo1{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      float area, base, altura;

      System.out.print("Introduzca la base del triangulo: ");
      base = input.nextFloat();

      System.out.print("Introduzca la altura del triangulo: ");
      altura = input.nextFloat();

      area = base * altura /2;
      System.out.println("El area del triangulo es: "+area);

      input.close();
    }
}