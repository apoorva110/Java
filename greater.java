//Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class greater {
    public static int getGreater(int a, int b){
        Scanner sk=new Scanner(System.in);
        if(a>b){
            return a;}
        else{
            return b;}

    }
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int a =sk.nextInt();
        int b=sk.nextInt();
        System.out.println(getGreater(a,b));
    }
}

