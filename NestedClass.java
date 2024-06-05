public class NestedClass 
{
    public static void main(String[] args)
    {
        MainClass mc = new MainClass();
        MainClass.NestedClass mnc = mc.new NestedClass();
        mnc.function();
    }
}


class MainClass
{
    class NestedClass
    {
        void function()
        {
            System.out.println("This is a Nested class Function");
        }
    }
}