//Q- WAP TO CREATE CALCULATOR
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        char c;
        int a,b;
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter first nunmber: ");
        a=sk.nextInt();
        System.out.println("Enter second number: ");
        b=sk.nextInt();
        System.out.println("Press + for addition");
        System.out.println("Press - for subtraction");
        System.out.println("Press * for multiplication");
        System.out.println("Press / for division");
        System.out.println("========================================================================================================");
        c=sk.next().charAt(0);
        System.out.println("========================================================================================================");
        if(c=='+'){
            System.out.println("Addition" +(a+b));
        }else if(c=='-'){
            System.out.println("Subtraction" +(a-b));
        }else if(c=='/'){
            System.out.println("Division" +(a/b));
        }else if(c=='*'){
            System.out.println("Multiplication" +(a*b));

        }else{
            System.out.println("Invalid choice");
        }
        System.out.println("======================================================================================================");
    }
}
