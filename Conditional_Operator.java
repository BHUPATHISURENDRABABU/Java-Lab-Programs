// import java.util.Scanner;

// public class Conditional_Operator
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a Number : ");
//         int num = sc.nextInt();
//         if(num % 2 == 0)
//         {
//             System.out.println(num+" is Even Number");
//         }
//         else
//         {
//             System.out.println(num+" is Odd Number");
//         }
//     }
// }


import java.util.Scanner;

public class Conditional_Operator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation to perform : ");
        char op = sc.next().charAt(0);
        switch(op)
        {
            case '+' :
            {
                System.out.print("The Addition of "+num1+" and " +num2+" is "+(num1+num2));
                break;
            }
            case '-' :
            {
                System.out.print("The Subtraction of "+num1+" and " +num2+" is "+(num1-num2));
                break;
            }
            case '*' :
            {
                System.out.println("The Multiplication of "+num1+" and " +num2+" is "+(num1*num2));
                break;
            }
            case '/' :
            {
                System.out.println("The Division of "+num1+" and " +num2+" is "+(num1/num2));
                break;
            }
            default :
            {
                System.out.println("You entered wrong Operation");
                break;
            }
        }
    }
}