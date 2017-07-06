import java.io.*;
import java.util.*;
public class Area {
    public static void main(String args[])
    {
        Area a=new Area();
        int rad,br,ht,lg,bt;
        Scanner s=new Scanner(System.in);
        rad=s.nextInt();
         br=s.nextInt();
          ht=s.nextInt();
           lg=s.nextInt();
            bt=s.nextInt();
        
        int circle=a.Areac(rad);
        int triangle=a.Areat(br, ht);
        int rect=a.Arear(lg, bt);
        System.out.println(circle);
          System.out.println(triangle);
            System.out.println(rect);
    }

    private int Areac(int r)
    {
   int ca=(int) (3.14*r*r);
        return ca;
    }
    private int Areat(int b,int h)
    {
        double ta=b*h*0.5;
        return (int) ta;
    }
   private int Arear(int l,int b)
   {
       double ra=l*b;
        return (int) ra;
   }
}
