import java.util.Scanner;

public class IsVoteEligible 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year : ");
        int year = sc.nextInt();
        int age = calcAge(year);
        if(age > 18)
        {
            System.out.println("You are eligible for vote");
        }
        else
        {
            System.out.println("You are not eligible for vote");
        }
    }

    static int calcAge(int year)
    {
        return 2023 - year;
    }
}
