//Write a Java program that takes three numbers from the user and prints the greatest number.
import java.util.*;
public class Greatest {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        System.out.println("The first number: ");
        int a = sk.nextInt();
         System.out.println("The second number: ");
        int b = sk.nextInt();
         System.out.println("The third number: ");
        int c = sk.nextInt();
        if(a>b && a>c){
            System.out.println("a is greater");
        }
        else if(b>a && b>c){
            System.out.println("b is graeter");
        }
        else{
            System.out.println("c is greater");
        }
    }
}
