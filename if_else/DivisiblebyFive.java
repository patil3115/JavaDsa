package if_else;
import java.util.Scanner;

public class DivisiblebyFive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number to check if divisible by 5: ");
        int no=sc.nextInt();

        if(no%5==0)
            System.out.print("Is Dividible.");
        else
            System.out.print("Is not Divisible");

    }
}
