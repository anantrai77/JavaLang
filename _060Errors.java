
import java.util.Scanner;

public class _060Errors {
    public static void main(String[] args) {
        //Syntax Error
        //int a = 5 error: No semicolon
       // System.out.println(a);
       
       //Logical Error
       //Print all prime no. 1 to 10
       System.out.println(2);
       for(int i=1; i<5; i++){
        System.out.println(2*i+1);
       }

       //Runtime Error--> also called Exceptional
       int k;
       Scanner sc = new Scanner(System.in);
       k=sc.nextInt(); //k=0
       System.out.println("Integer part of 1000 divided by k is "+1000/k); 
    }
}
