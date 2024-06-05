public class StaticNestedClass 
{
    public static void main(String[] args)
    {
        MainClass.NestedClass mnc = new MainClass.NestedClass();
        mnc.function();
    }
}


class MainClass 
{
    static class NestedClass
    {
        void function()
        {
            System.out.println("This is Static Nested Class Function");
        }
    }
}