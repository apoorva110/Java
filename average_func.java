//Enter 3 numbers from the user & make a function to print their average
import java.util.*;
public class average_func {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
    int a=sk.nextInt();
    int b=sk.nextInt();
    int c=sk.nextInt();
    int average=(a+b+c)/3;
    System.out.println("the average is: "+average);
}
}
