class A{
    public void m1()
    {
        System.out.println("A method");
    }
}
class B extends A{
    public void m1()
    {
        System.out.println("B method");
    }
}
class C extends A{
    public void m1()
    {
        System.out.println("C method");
    }
}
public class DynamicMethodDispatching
{
    public static void main(String args[])
    {
        A a; 
        a = new A();
        a.m1();

        a = new B();
        a.m1();

        a = new C();
        a.m1();
    }
}