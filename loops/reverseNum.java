package loops;

import java.util.Scanner;

public class reverseNum {
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt();  //n=6821

        int r=0;

        while(n!=0)
        {
            r=r*10;
            r=r+(n%10);
            n=n/10;
        }

        System.out.print(r);
    }
}
