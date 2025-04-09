class Animal
{
    public void eat()
    {
        System.out.println("Animal is eating");
    }
    public void sound()
    {
        System.out.println("Animal is making sound");
    }
}
class Dog extends Animal
{
    public void sound()
    {
        System.out.println("Bow Bow.....");
    }
}
class Tiger extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("Tiger is roaring....");
    }
}
public class DynamicMethodDispatchDemo
{
    public static void main(String args[])
    {
        Animal a = new Animal();
        a.eat();
        a.sound();

        a = new Dog();
        a.eat();
        a.sound();

        a = new Tiger();
        a.eat();
        a.sound();
    }
}
