public class Class 
{
    public static void main(String[] args) 
    {
        String[] a = {"Suri", "Shiva", "Umesh", "Akhil"};
        One one1 = new One();
        one1.main(a);
    }
}


class One
{
    public static void main(String[] args)
    {
        System.out.println(args[0]);
    }
}