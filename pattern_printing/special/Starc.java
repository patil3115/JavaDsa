package pattern_printing.special;

import java.util.Scanner;

public class Starc {
    public static void main(String Args[]) {
            Scanner sc=new Scanner(System.in);

            System.out.print("Enter odd number: ");
            int n=sc.nextInt();

            int a=n;

            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(i==j || i+j==n+1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
    }
}
