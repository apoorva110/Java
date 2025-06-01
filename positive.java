import java.util.*;
public class positive {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sk.nextInt();
        if(a>0){
            System.out.println("Number is +ve");
        }
        else if(a=0){
            System.out.println("number is zero");
        }
        else{
            System.out.println("Number is negative");
        }
    }
}
