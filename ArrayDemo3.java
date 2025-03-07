import java.util.Scanner;
public class ArrayDemo3
{
    public static int calculatesum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static int calculateprod(int arr[]){
        int prod=1;
        for(int i=0;i<arr.length;i++){
            prod*=arr[i];
        }
        return prod;
    }
    public static int calculateEvensum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
            sum=sum+arr[i];
            }
        }
        return sum;
    }
    public static int calculateOddsum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
            sum=sum+arr[i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n,x[];
        n=sc.nextInt();
        x=new int[n];

        //Read the input
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }

        int result1=ArrayDemo3.calculatesum(x);
        System.out.println("Sum of Elements: "+result1);

        int result2=ArrayDemo3.calculateprod(x);
        System.out.println("Product of Elements: "+result2);

        int result3=ArrayDemo3.calculateEvensum(x);
        System.out.println("Sum of Even Elements: "+result3);

        int result4=ArrayDemo3.calculateOddsum(x);
        System.out.println("Sum of Odd Elements: "+result4);
    }
}