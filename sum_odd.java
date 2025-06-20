//Write a function to print the sum of all odd numbers from 1 to n
import java.util.*;
public class sum_odd {
    public static void main(String[] args) {
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
System.out.println("The sum of odd numbers is: "+sum);
    }
}
