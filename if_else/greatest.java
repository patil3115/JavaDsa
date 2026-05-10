package if_else;
import java.util.Scanner;

public class greatest{
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1=sc.nextInt();

        System.out.print("Enter second number: ");
        int n2=sc.nextInt();

        System.out.print("Enter third number: ");
        int n3=sc.nextInt();

        if(n1==n2 && n2==n3)
            System.out.println("All Same Values are present.");
        else if(n1==n2 || n1==n3 || n2==n3)
            System.out.println("Two Same Values are present.");

        if(n1>=n2 && n1>=n3)
            System.out.print("n1 is greatest.");
        else if(n2>=n1 && n2>=n3)
            System.out.print("n2 is greatest.");
        else
            System.out.print("n3 is greatest.");

    }
}