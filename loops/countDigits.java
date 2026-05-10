package loops;

import java.util.Scanner;

public class countDigits {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number to count number of digits: ");
        int n=sc.nextInt();

        int count=0;

        if(n==0) count=1;

        while(n!=0)
        {
           n=n/10;
           count++;
        }
        System.out.println(count);
    }
}
