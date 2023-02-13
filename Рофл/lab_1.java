import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = scan.nextInt();
        System.out.print("Enter the second number:");
        int b = scan.nextInt();
        int sum = a + b;
        System.out.print("Sum of two numbers: " + sum);
    }

}
