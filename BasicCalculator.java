package aec.edu.in;
public class BasicCalculator
{
    public int add(int x,int y)
     {
         return x+y;
     }
    public int sub(int x,int y)
    {
        return x-y;
    }
    public int mul(int x,int y)
    {
        return x*y;
    }
    public int div(int x,int y)
     {
           if(y!=0)
             return x/y;
           else
             return 0;
     }
}
