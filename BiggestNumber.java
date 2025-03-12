import java.util.Scanner;
public class BiggestNumber
{
    public static int findBigger(int x,int y)
    {
        if(x>=y)
            return x;
        else 
            return y;
    } 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int m,n;

        m=sc.nextInt();
        n=sc.nextInt();

        int larger = BiggestNumber.findBigger(m,n);

        System.out.println("The Biggest Number is :"+larger);
    }
}