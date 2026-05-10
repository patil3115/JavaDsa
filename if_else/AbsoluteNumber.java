package if_else;
import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number to find absolute number: ");
        int no=sc.nextInt();

        //Method 1
//        if(no>=0) {
//            System.out.println(no);
//        }
//        else{
//            System.out.println(-(no));
//        }

        //Method 2
        if(no<0) no=-no;
        System.out.println(no);

    }
}
