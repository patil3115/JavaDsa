package loops;
import java.util.Scanner;

public class oddNum {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter limit till you want to print numbers: ");
        int n=sc.nextInt();

        //Method 1........In this method loops runs from 1 to all the way to the l which is not the best solution as it increases time complexity.
//        for(int i=1;i<=n;i++)
//        {
//            if(i%2!=0)
//            {
//                System.out.print(i+" ");
//            }
//        }

        //Method 2
        for(int i=1;i<=n;i=i+2)
        {
            System.out.print(i+" ");
        }
    }
}
