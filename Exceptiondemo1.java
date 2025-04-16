import java.util.Scanner;
public class Exceptiondemo1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x=0,y=0,z=0;
        try{
            x = sc.nextInt();
            y = sc.nextInt();
            z = x/y;
        }
        catch(Exception e)
        {
            System.out.println("Y value should be non zero");
        }
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        
        System.out.println("Result = "+z);
        System.out.println("Task Completed");
        sc.close();
    }
}