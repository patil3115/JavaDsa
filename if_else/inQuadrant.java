package if_else;
import java.util.Scanner;

public class inQuadrant {
    public static void main(String Args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter x axis: ");
        int x=sc.nextInt();

        System.out.print("Enter y axis: ");
        int y=sc.nextInt();

        System.out.print("("+""+x+" "+y+")");

        if(x==0 && y==0)
            System.out.print("Given point is at Origin.");
        else if(x>0 && y>0)
            System.out.print("Given point is in First Quadrant.");
        else if(x>0 && y<0)
            System.out.print("Given point is in Fourth Quadrant.");
        else if(x<0 && y>0)
            System.out.print("Given point is in Second Quadrant.");
        else if(x<0 && y<0)
            System.out.print("Given point is in Third Quadrant.");
        else if(x>0 && y==0 || x<0 && y==0)
            System.out.print("Given point is on X-Axis.");
        else
            System.out.print("Given point is on Y-Axis.");
    }
}
