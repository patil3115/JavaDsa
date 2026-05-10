package loops;
import java.util.Scanner;

public class Table {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number to print the table of: ");
        int n=sc.nextInt();

//        //Method 1: Most Optimised
        for(int i=n;i<=n*10;i=i+n)
        {
            System.out.print(i+" ");
        }

        //Method 2: Least Optimised
//        for(int i=1;i<=n*10;i++)
//        {
//            if(i%n==0)
//            {
//                System.out.print(i+" ");
//            }
//        }

        //Method 3: Most Optimized alternative
//        for(int i=1;i<=10;i++)
//        {
//            System.out.print(i*n+" ");
//        }
    }
}
