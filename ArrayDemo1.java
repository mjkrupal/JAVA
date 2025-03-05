public class ArrayDemo1
{
    public static void main(String args[]){
        /*int x[]= new int[10];
        System.out.println(x[0]); //Default value 0 is printed
        */

       int x[]={10,20,30,40,50};
       System.out.println(x[1]);// 20

       System.out.println(x[4]);// 50

      /* System.out.println(x[5]);// Exception in thread "main" 
                                //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
                                //at ArrayDemo1.main(ArrayDemo1.java:11)*/
        
        System.out.println(x.length);

        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
    }
}