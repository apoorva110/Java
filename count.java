//count of digit
import java.util.*;
public class count {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sk.nextInt();
        int count=0;
        while(a!=0){
            a/=10;
            count++;
        }
        System.out.println("The count of digit is: "+count);
    }
}
