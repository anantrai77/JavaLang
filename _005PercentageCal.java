
import java.util.Scanner;

public class _005PercentageCal {
    public static void main(String[] args) {
        float sum;
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter subject 1 marks :");
        float a = sr.nextInt();
        System.out.println("Enter subject 2 marks :");
        float b = sr.nextInt();
        System.out.println("Enter subject 3 marks :");
        float c = sr.nextInt();
        System.out.println("Enter subject 4 marks :");
        float d = sr.nextInt();
        System.out.println("Enter subject 5 marks :");
        float e = sr.nextInt();
        sum = (a+b+c+d+e)/500*100;
        System.out.println("Percentage is "+sum);
        }
}
