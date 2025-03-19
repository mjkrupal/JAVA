import java.util.Scanner;
public class Calculator
{
    public static int add(int x,int y)
    {
        return x+y;
    }
    public static int sub(int x,int y)
    {
        return x-y;
    }
    public static int mul(int x,int y){
        return x*y;
    }
    public static int div(int x,int y){
        return x/y;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m,n;

        m=sc.nextInt();
        n=sc.nextInt();
        int p=Calculator.add(m,n);
        int q=Calculator.sub(m,n);
        int r=Calculator.mul(m,n);
        int s=Calculator.div(m,n);

        System.out.println("Sum = "+p);
        System.out.println("Diff = "+q);
        System.out.println("Prod = "+r);
        System.out.println("Div = "+s);

        sc.close();
    }
}