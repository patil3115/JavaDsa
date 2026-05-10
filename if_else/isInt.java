package if_else;
import java.util.Scanner;

public class isInt{
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number to check: ");
        double no=sc.nextDouble();   //no=95.5

        int x=(int)no;  //x=95

        if(no-x==0)
            System.out.println("Is an integer.");
        else
            System.out.println("Is not an integer.");
    }
}