package loops;
import java.util.Scanner;

public class alphaAscii {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        for(char ch='a';ch<='z';ch++)
        {
            System.out.println(ch+0 +" "+ch);
        }

        for(char ch='A';ch<='Z';ch++)
        {
            System.out.println(ch+0 +" "+ch);
        }
    }
}
