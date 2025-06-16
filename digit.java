//SUM OF DIGIT
import java.util.*;
public class digit {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a=sk.nextInt();
        int sum=0;
        while(a!=0){
            int digit=a%10;
            sum+=digit;
            a/=10;
        }
        System.out.println("The sum of digit of a given number is: "+sum);
    }
}
