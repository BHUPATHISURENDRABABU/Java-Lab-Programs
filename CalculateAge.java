import java.util.*;
public class CalculateAge {

	public static void main(String[] args) {

        try{
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter your age : ");
            int age=sc.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("Wrong input");
        }
	
		finally{
			System.out.println("Your are eligible");
		}
	}

}