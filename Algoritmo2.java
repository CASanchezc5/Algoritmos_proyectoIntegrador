//ELEGIR UNA FIGURA GEOMETRICA ENTRE: PRISMA, CUBO, CILINDRO Y ESFERA Y LUEGO HALLAR EL VOLUMEN DE CADA UNO PIDIENDO LOS DATOS QUE SE NECESITAN PARA SACAR EL VOLUMEN DE CADA UNO

import java.util.Scanner;
import java.lang.Math;

public class Algoritmo2{
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("selecciona una figura geometrica: ");
        System.out.println("1. cubo");
        System.out.println("2. cilindro");
        System.out.println("3. esfera");
        System.out.println("4. cono");
        System.out.println("5. prisma");

        int opcion = input.nextInt();
        double volumen = 0;

        switch (opcion) {
            case 1:
                System.out.print("ingresa el lado del cubo:");
                double ladoCubo = input.nextDouble();
                volumen = Math.pow(ladoCubo, 3);
                break;
            case 2:
                System.out.print("ingresa el radio del cilindro:");
                double radioCilindro = input.nextDouble();
                System.out.print("ingresa la altura del cilindro:");
                double alturaCilindro = input.nextDouble();
                volumen = Math.PI*Math.pow(radioCilindro, 2)*alturaCilindro;
                break;
            case 3:
                System.out.print("ingresa el radio de la esfera:");
                double radioEsfera = input.nextDouble();
                volumen = (4.0/3.0) * Math.PI*Math.pow(radioEsfera, 3);
                break;
            case 4:
                System.out.print("ingresa el radio del cono:");
                double radioCono = input.nextDouble();
                System.out.print("ingresa la altura del cono:");
                double alturaCono = input.nextDouble();
                volumen = (1.0/3.0) * Math.PI*Math.pow(radioCono, 2)*alturaCono;
                break;
            case 5:
                System.out.print("ingresa el area de la base del prisma:");
                double areaBasePrisma = input.nextDouble();
                System.out.print("ingresa  la altura del prisma:");
                double alturaPrisma = input.nextDouble();
                volumen = areaBasePrisma*alturaPrisma;
                break;
        
        
            default:
                System.out.println("Opcion invalida");
                break;
        }

        System.out.println("el volumen de la figura seleccionada es: "+volumen);

        input.close();
    }
}