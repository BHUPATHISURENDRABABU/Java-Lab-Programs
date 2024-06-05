public class ClassInFun 
{
    public static void main(String[] args)
    {
        Outer outClass = new Outer();
        outClass.fun();
    }
    
}


class Outer
{
    void fun()
    {
        class Inner
        {
            void display()
            {
                System.out.println("This is class inside the function");
            }
        }
        Inner inClass = new Inner();
        inClass.display();
    }
}
