//CALCULAR EL ÁREA O PERIMETRO DE UN ROMBO

import java.util.Scanner;

public class Algoritmo7 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Elije área o perimetro del rombo");
        System.out.println("Area");
        System.out.println("Perimetro");
        
        String opcion = input.nextLine();
        
        
        if("Perimetro".equals(opcion)){
            System.out.println("Ingrese un lado");
            double lado = input.nextDouble();
            double perimetro = 4 * lado;
            System.out.println("El perimetro del rombo es: "+perimetro);
        }else if("Area".equals(opcion)){
            System.out.println("Ingrese la Diagonal Mayor");
            double diagMayor = input.nextDouble();
            System.out.println("Ingrese la Diagonal Menor");
            double diagMenor = input.nextDouble();
            double area = (diagMayor * diagMenor)/2;
            System.out.println("El área del rombo es: "+area);
            
        }else{
            System.out.println("Opción no valida");
        }
               
    }
    
}
