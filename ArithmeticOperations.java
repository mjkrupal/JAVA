import java.util.Scanner;        //built in package
import aec.edu.in.BasicCalculator;
public class ArithmeticOperations
{
   public static void main(String args[])
   {
        int n1,n2;      
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
		n2=sc.nextInt();
		
		BasicCalculator cal=new BasicCalculator();
		System.out.println(cal.add(n1,n2));
		System.out.println(cal.sub(n1,n2));
		System.out.println(cal.div(n1,n2));
		System.out.println(cal.mul(n1,n2));
		
   }

}
