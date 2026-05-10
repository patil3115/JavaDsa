package loops;
import java.util.Scanner;

public class sumofDigits {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        int sum=0;

        if(n==0) sum=0;

        while(n!=0)
        {
            int d=n%10;  //last digit of a number.
            n=n/10;  //remaining number after removal of last digit
            sum=sum+d;
        }

        System.out.print("Sum of digits is "+sum);
    }
}
