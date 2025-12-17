
import java.util.Scanner;

public class _067PS14 {
    public static void main(String[] args) {
        //Q1
        //int a = 45 //Syntax error
       //int age = 78;
       //int  year_born = 2000-78;//logical error
       //System.out.println(6/0);//Runtime error

       //Q2
    //    try{
    //     int a = 666/0;
    //    }
    //    catch(IllegalArgumentException e){
    //     System.out.println("hehe");
    //    }
    //    catch(ArithmeticException e){
    //     System.out.println("haha");
    //    }

       //Q3
       boolean flag = true;
       int [] marks = new int[3];
       marks[0]=45;
       marks[1]=23;
       marks[2]=57;
       Scanner sc = new Scanner(System.in);
       int index;
       int i=0;
       while(flag && i<5){
        try{
            System.out.println("The value of index");
            index = sc.nextInt();
            System.out.println("The value of marks[index] is "+marks[index]);
            break;
        }
        catch(Exception e){
            System.out.println("Invalid indxe");
            i++;
        }
       }
       if(i>=5){
        System.out.println("Error");
       }
    }
}
