package loops;
import java.util.Scanner;

public class oddDivisible {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the range: ");
        int r=sc.nextInt();

        for(int i=1;i<=r;i=i+2)
        {
            if(i%3==0) System.out.print(i+" ");
        }
    }
}
