import java.util.Scanner;

public class Algoritmo8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el número de vértices del polígono: ");
        int numVertices = input.nextInt();

        double[] x = new double[numVertices];
        double[] y = new double[numVertices];

        for (int i = 0; i < numVertices; i++) {
            System.out.print("Ingrese la coordenada x del vértice " + (i + 1) + ": ");
            x[i] = input.nextDouble();
            System.out.print("Ingrese la coordenada y del vértice " + (i + 1) + ": ");
            y[i] = input.nextDouble();
        }

        double area = calcularAreaPoligono(x, y, numVertices);
        System.out.println("El área del polígono es: " + area);

        input.close();
    }

    public static double calcularAreaPoligono(double[] x, double[] y, int n) {
        double area = 0;
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            area += x[i] * y[j] - x[j] * y[i];
        }
        area = Math.abs(area) / 2.0;
        return area;
    }
}
