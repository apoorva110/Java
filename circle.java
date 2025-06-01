//Q- WAP TO CALCULATE AREA & CIRCUMFERENCE OF A CIRCLE

import java.util.Scanner;

public class circle{
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        System.out.println("Radius of circle is: ");
        float r = sk.nextFloat();
        float c = (2*3.14f*r);
        System.out.println("The circumference of circle is " +c);
        float a = 3.14f*r*r;
        System.out.println("The area of cirlce is: " +a);
    }
}
