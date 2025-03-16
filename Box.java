public class Box
{
    int l,b,h,area,vol;
    public Box()
    {
        l=b=h=1;
    }
    public Box (int n)
    {
        l=b=h=n;
    }
    public Box (int p,int q,int r)
    {
        l=p;
        b=q;
        h=r;
    }
    public void showDimensions()
    {
        System.out.println(l+" "+b+" "+h);
    }
    public void calcArea()
    {
        area = 2*(l*b+b*h+l*h);
    }
    public void calcVolume()
    {
        vol=l*b*h;
    }
    public static void main(String args[])
    {
        Box b1 = new Box();
        Box b2 = new Box(4);
        Box b3 = new Box(2,3,4);

        b1.calcArea();
        b1.calcVolume();

        b2.calcArea();
        b2.calcVolume();

        b3.calcArea();
        b3.calcVolume();

        b1.showDimensions();
        System.out.println("Area = "+b1.area);
        System.out.println("volume = "+b1.vol);

        b2.showDimensions();
        System.out.println("Area = "+b2.area);
        System.out.println("volume = "+b2.vol);

        b3.showDimensions();
        System.out.println("Area = "+b3.area);
        System.out.println("volume = "+b3.vol);
    }
}