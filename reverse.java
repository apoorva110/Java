//reverse number
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);  
        System.out.println("Enter the number: ");
        int a=sk.nextInt();
        int reverse=0;
        while(a!=0){
            int digit=a%10;
            reverse=reverse*10+digit;
            a/=10;
        }
        System.out.println("The reverse number is: "+reverse);
    }
     
}
