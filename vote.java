//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;
public class vote {
    public static boolean getAge(int age){
        if(age>=18){
            return true;}
        
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int age=sk.nextInt();
        System.out.println(getAge(age));

    }
}
