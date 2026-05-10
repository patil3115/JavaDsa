package if_else;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        System.out.print((no%2==0) ? "Even" : "Odd");
    }
}
