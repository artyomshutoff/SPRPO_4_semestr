import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int n = scan.nextInt();

        double[][] coords = new double[n][2];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter point coordinates: ");
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            coords[i][0] = x;
            coords[i][1] = y;
        }

        double S = 0;
        int last = n - 1;

        for (int i = 0; i < n; i++) {
            S += coords[last][0] * coords[i][1] - coords[last][1] * coords[i][0];
            last = i;
        }

        S /= 2;
        S = Math.abs(S);;

        System.out.print("Calculated area: " + S);
    }

}
