package loops;
import java.util.Scanner;

public class mix {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        int temp=n;
        int r=0;

        while(temp!=0)
        {
            r=r*10;
            r=r+(temp%10);
            temp=temp/10;
        }

        System.out.println(r);

        int sum=n+r;

        System.out.print("Sum is: "+sum);
    }
}
