package Basics;
import java.util.Scanner;

public class SumofNumbers {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a: ");
        int a=sc.nextInt();

        System.out.print("Enter b: ");
        int b=sc.nextInt();

        System.out.print("Enter c: ");
        int c=sc.nextInt();

        System.out.print("Sum is: ");
        int sum=a+b+c;
        System.out.print(sum);
    }
}
