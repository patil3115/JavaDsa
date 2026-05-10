package pattern_printing.triangle;

import java.util.Scanner;

public class Flipalfa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int a=n;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print((char)(i+96)+" ");
            }
            a--;
            System.out.println(" ");
        }
    }
}
