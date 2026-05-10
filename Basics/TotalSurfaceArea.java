package Basics;
import java.util.*;

public class TotalSurfaceArea {
    public static void main(String[] args) {
        System.out.print("Enter length: ");
        Scanner sc= new Scanner(System.in);
        double l=sc.nextDouble();
        //System.out.println(l);

        System.out.print("Enter breadth: ");
        double b=sc.nextDouble();
       // System.out.println(b);

        System.out.print("Enter height: ");
        double h=sc.nextDouble();
        //System.out.println(h);

        System.out.print("Total Surface Area is: ");
        double TSA=2*(l*b + b*h + h*l);
        System.out.println(TSA);

    }
}
