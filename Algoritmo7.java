import java.util.Scanner;

public class Algoritmo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el valor de la diagonal mayor: ");
        double diagonalMayor = scanner.nextDouble();
        
        System.out.print("Ingresa el valor de la diagonal menor: ");
        double diagonalMenor = scanner.nextDouble();
        
        double perimetro = 4 * Math.sqrt((diagonalMayor * diagonalMayor + diagonalMenor * diagonalMenor) / 4);
        
        System.out.println("El perímetro del rombo es: " + perimetro);
    }
}
