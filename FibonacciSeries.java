import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        generateFibonacci(n);
    }

    public static void generateFibonacci(int n) {
        int num1 = 0, num2 = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");

            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }
}
