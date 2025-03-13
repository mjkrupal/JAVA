import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch
{
    public static int binarysearch(int arr[],int key){
        int left =0;
        int right = arr.length-1;
        if(left<=right){
            int mid=(left+right)/2;

            if(arr[mid]==key) return mid;
            else if(arr[mid]>key) left = mid+1;
            else right = mid-1;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);

        int n,x[];
        n=sc.nextInt();
        x=new int[n];

        //Reading of array elements
        for(int i=0;i<n;i++){
            x[i]=sc.nextInt();
        }
        Arrays.sort(x);
        int key;
        key=sc.nextInt();


        int result = binarysearch(x,key);
        if (result == -1 )
            System.out.println("Element is not found in the array");
        else
            System.out.println(key+" is found at "+result+" index");
    }
}