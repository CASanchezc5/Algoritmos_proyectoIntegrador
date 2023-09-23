//para hallar el perimetro de un rectangulo

import java.util.Scanner;

public class Algoritmo3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo: ");
        float base = input.nextFloat();

       System.out.print("Ingrese la altura del rectangulo: ");
        float altura = input.nextFloat(); 

        float perimetro = 2*(base * altura);
        System.out.print("El perimetro del rectangulo es: "+perimetro);

        input.close();
    }
}
