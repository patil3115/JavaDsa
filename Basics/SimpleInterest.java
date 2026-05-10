package Basics;
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Principle Amount: ");
        double p=sc.nextDouble();

        System.out.print("Enter Interest Rate: ");
        double r=sc.nextDouble();

        System.out.print("Time in years: ");
        double t=sc.nextDouble();

        System.out.print("Simple interest is: ");
        double SI=(p*r*t)/100.0;
        System.out.print(SI);


    }
}

