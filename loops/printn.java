package loops;
import java.util.Scanner;

public class printn {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Starting Value of AP: ");
        int a=sc.nextInt();

        System.out.print("Enter limit of AP: ");
        int n=sc.nextInt();

        System.out.print("Enter Common Difference two numbers: ");
        int d=sc.nextInt();

//        //Method 1: Iterates n times but need extra calculation of the limiter for For loop
//        //Calculate limit for For loop. i.e...(a)n=a+(n-1)d
 //       int l=a+(n-1)*d;

//        if(d>0)  //To print positive AP
//        {
//            for(int i=a;i<=l;i+=d)
//            {
//                System.out.print(i+" ");
//            }
//        }
//        else  //To print negative AP
//        {
//            for(int i=a;i>=l;i+=d)
//            {
//                System.out.print(i+" ");
//            }
//        }

        //Method 2:
//        if(d>0)
//        {
//            for(int i=a;i<=l;i+=d)
//            {
//                System.out.print(i+" ");
//            }
//        }
//        else {
//            for(int i=a;i>=l;i+=d)
//            {
//                System.out.print(i+" ");
//            }
//        }

        //Method 3: Indipendent of i
        for(int i=1;i<=n;i++)
        {
            System.out.print(a +" ");
            a=a+d;
        }

    }
}
