
import java.util.Scanner;

public class _062HandleSpecExc {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0]=7;
        marks[1]=5;
        marks[2]=6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();

        try {
            System.out.println("The value of array index entered is : "+marks[ind]);
            System.out.println("The value of array-value/number is : "+marks[ind]/number);
        } 
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occured");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Others Exception occured");
            System.out.println(e);
        }
    }
}
