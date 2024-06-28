import java.util.Scanner;

public class Arithmetic_Operators{
    public static void main(String[] args) {
        int a,b,c;
        String op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        b = sc.nextInt();
        c = a + b;
        System.out.println("Enter the Operator +, -, *, /, % ");
        op = sc.next();
        s

        System.out.println("The Addition of "+a+" and "+b+" are "+ (a+b));
        System.out.println("The Subtraction of "+a+" and "+b+" are "+ (a-b));
        System.out.println("The Multiplication of "+a+" and "+b+" are "+ (a*b));
        System.out.println("The Division of "+a+" and "+b+" are "+ (a/b));
        System.out.println("The Modulo of "+a+" and "+b+" are "+ (a%b));
    }
}