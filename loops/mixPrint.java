package loops;
import java.util.Scanner;

public class mixPrint {
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter limit: ");
        int n=sc.nextInt();
        int temp=n;

        for(int i=1;i<=n;i++)
        {
            System.out.println(i);

            if(temp>=1)
            {
                System.out.println(temp);
                temp--;
            }
        }

    }
}
