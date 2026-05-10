package loops;
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int n=sc.nextInt();

        boolean flag=true;

//        for(int i=2;i<=n-1;i++)
//        {
//            if(n%i==0)
//            {
//                flag=false;
//                break;
//            }
//        }

        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                flag=false;
                break;
            }
        }

        if(n<=1) System.out.println("Number is neither Prime nor Composite.");
        else if(flag==true) System.out.println("Number is Prime.");
        else System.out.println("Number is Composite.");
    }
}
