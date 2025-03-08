import java.util.Scanner;
public class ArrayDemo4
{
    public static void AddArray(int x1[], int x2[],int size){
        for(int i=0;i<size;i++){
            System.out.println( x1[i]+x2[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n1,x1[],n2,x2[];
        n1=sc.nextInt();
        n2=sc.nextInt();
        x1=new int[n1];
        x2=new int[n2];

        int size=n1<n2?n1:n2;
         
        for(int i=0;i<n1;i++){
            x1[i]=sc.nextInt();
        }

        for(int i=0;i<n2;i++){
            x2[i]=sc.nextInt();
        }

        ArrayDemo4.AddArray(x1,x2,size);
    }
}