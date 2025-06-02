//Write a Java program to solve quadratic equations (use if, else if and else).
import java.util.*;
class Equation{
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = sk.nextDouble();
        System.out.println("Enter b: ");
        double b=sk.nextDouble();
        System.out.println("Enter c: ");
        double c=sk.nextDouble();
        double result = b*b-a*4*c;
        if(result>0.0){
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The roots of the equations are:" +r1+ " and " +r2);
        }
        else if(result==0.0){
            double r1= -b/(2.0*a);
            System.out.println("The root is " +r1 );
        }
        else{
            System.out.println("The real roots does not exist");
        }
        }

    }
