interface Inf1
{
    void m1();   //abstract method

    default void m2()
    {
        System.out.println("This is default method");
    }
    static void m3()
    {
        System.out.println("This is static method");
    }
}
class Test implements Inf1
{
    public void m1()
    {
        System.out.println("This is a abstract method");
    }
}
public class DefaultMethodsdemo
{
    public static void main(String args[])
    {
        Test t = new Test();
        t.m1();
        t.m2();
        Inf1.m3();
    }
}