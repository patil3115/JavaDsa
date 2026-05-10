package loops;
import java.util.Scanner;

public class nTimes {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter how many times to print: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            System.out.println(i+". Yashika.");
        }
    }
}
