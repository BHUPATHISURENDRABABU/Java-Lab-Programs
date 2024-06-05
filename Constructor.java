public class Constructor 
{
    public static void main(String[] args)
    {
        NewClass obj = new NewClass();
    }
}

class NewClass
{
    NewClass()
    {
        System.out.println("This executes automatically");
    }
}