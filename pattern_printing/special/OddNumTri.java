package pattern_printing.special;

import java.util.Scanner;

public class OddNumTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int a=1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println(" ");
        }
    }
}
