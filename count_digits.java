//Q- WAP TO COUNT NUMBER OF DIGITS IN THE GIVEN NUMBER

import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sk.nextInt();
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        System.out.println("Number of digits in the given number: " +count);
    }
}
