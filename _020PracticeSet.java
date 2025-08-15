
import java.util.Scanner;

public class _020PracticeSet {
    public static void main(String[] args) {
        //Q1
        /*int a = 10;
        if (a==11) {
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }
        }*/

        //Q2
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter subject1 marks : ");
        int s1 = sc.nextInt();
        System.out.print("Enter subject2 marks : ");
        int s2 = sc.nextInt();
        System.out.print("Enter subject3 marks : ");
        int s3 = sc.nextInt();
        float t = (s1+s2+s3)/3.0f;
        System.out.println("Your percentage is : "+t);
        if(s1 >= 33 && s2 >=33 && s3>=33 && t>=40){
            System.out.println("You are passed");
        }
        else{
            System.out.println("You are failed");
        }*/

        //Q3
        /*float tax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter income in lakhs : ");
        float income = sc.nextFloat();
        if(income<=2.5f){
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5.0f){
            tax = tax + 0.05f*(income-2.5f);
        }
        else if(income>5.0f && income<=10.0f){
            tax = tax + 0.05f*(5.0f-2.5f);
            tax = tax + 0.2f*(income-5.0f);
        }
        else if(tax>10.0f){
            tax = tax + 0.05f*(5.0f-2.5f);
            tax = tax + 0.2f*(10.0f-5.0f); 
            tax = tax + 0.3f*(income-10.0f); 
        }
        System.out.println("Total tax is "+tax);
        */

        //Q4
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter day : ");
        int day = sc.nextInt();
        switch(day){ //Enhanced Switch case hence no need of break
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }*/

        //Q5
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }*/

        //Q6
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter website : ");
        String website = sc.next();

        if(website.endsWith(".org")){
            System.out.println("This is organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is an commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is indian website");
        }

    }
}
