//Comparing two numbers using if-else statement
import java.util.*;
class Compare{
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int A=sk.nextInt();
        System.out.println("Enter second number: ");
        int B=sk.nextInt();
        
        if(A>B){
            System.out.println("A is greater than B");
        }
        else if(B>A){
            System.out.println("B is greater than A");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
