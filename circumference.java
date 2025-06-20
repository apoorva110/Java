//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class circumference {
    public static Double getCircumference(Double radius){
        return 3.14*radius*2;
    }
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        Double radius=sk.nextDouble();
        System.out.println(getCircumference(radius));
    }
}
