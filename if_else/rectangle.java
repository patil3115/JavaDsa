package if_else;
import java.util.Scanner;

public class rectangle {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter length: ");
        double l= sc.nextDouble();

        System.out.print("Enter breadth: ");
        double b=sc.nextDouble();

        double area=l*b;
        double perimeter=2*(l+b);

        if(area>perimeter)
            System.out.print("Area of a rectangle is greater.");
        else
            System.out.print("Perimeter of a rectangle is greater.");
    }
}
