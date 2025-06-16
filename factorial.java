//WAP TO CALCULATE FACTORIAL OF A GIVEN NUMBERre
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sk.nextInt();
        int result=1;
        for(int i=2;i<=n;i++){
            result*=i;
        }
        System.out.println("The factorial of given number is: " +result);
    }
}
