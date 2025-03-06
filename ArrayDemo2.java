import java.util.Scanner;
public class ArrayDemo2
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n,x[];

        n=sc.nextInt(); // Size of the array

        x=new int[n]; // Allocation of memory for that array

        //Read the array
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }

        //Print the array elements
        for(int i=0;i<n;i++){
            System.out.println(x[i]);
        }
    }
}