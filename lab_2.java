import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int a = scan.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int b = scan.nextInt();

        int[] A = new int[a * b];

        for (int i = 0; i < a * b; i++) {
            if (i % b == 0) {
                System.out.print("Fill in the " + (i / b + 1) +" line: ");
            }
            A[i] = scan.nextInt();
        }

        System.out.println("\nInput matrix: ");
        for (int i = 0; i < a * b; i++) {
            if (i % b == 0) {
                System.out.print("\n");
            }
            System.out.print(A[i] + " ");
        }

        System.out.println("\n\nTransposed matrix: ");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a * b; j += b) {
                System.out.print(A[i + j] + " ");
            }
            System.out.print("\n");
        }

    }

}
