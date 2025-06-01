//Q - WAP TO SWAP TWO VARIABLES
import java.util.*;
public class swapping {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sk.nextInt();
        System.out.println("Enter second number: ");
        int b= sk.nextInt();
        System.out.println("Before swapping");
        System.out.printf("A = %d B = %d",a,b);
        int c = a;
        a = b;
        b = c;
        System.out.println("\n After swapping: ");
        System.out.printf("A = %d B = %d",a,b);
    }
}
