public class ArithmeticOperations 
{

    static int add(int a, int b)
    {
        return a+b;
    }

    static int sub(int a, int b)
    {
        return a-b;
    }

    static int mul(int a, int b)
    {
        return a*b;
    }

    static int div(int a, int b)
    {
        return a/b;
    }

    static int modulo(int a,int b)
    {
        return a%b;
    }


    public static void main(String[] args)
    {
        System.out.println(add(10,20));
        System.out.println(sub(100,50));
        System.out.println(mul(10,5));
        System.out.println(div(50,10));
        System.out.println(modulo(10,3));
    }
}
