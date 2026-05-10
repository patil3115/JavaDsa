package if_else;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();

        if(no%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
