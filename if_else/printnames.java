package if_else;
import java.util.Scanner;

public class printnames {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number to check divisibilty: ");
        double no=sc.nextDouble();

        if(no%5==0 || no%3==0) System.out.print("Apurva.");
        else if(no%3==0) System.out.print("Renu.");
        else if(no%5==0) System.out.print("Riya.");
        else System.out.print("Isha.");
    }
}
