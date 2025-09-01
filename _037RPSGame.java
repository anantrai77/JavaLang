import java.util.Random;
import java.util.Scanner;

public class _037RPSGame {
       public _037RPSGame() {
   }

   public static void main(String[] var0) {
      // 0-->Rock 1-->Paper 2-->Scissor
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor :");
      int var2 = var1.nextInt();
      Random var3 = new Random();
      int var4 = var3.nextInt(3);
      if (var2 == var4) {
         System.out.println("Draw");
      } else if ((var2 != 0 || var4 != 2) && (var2 != 1 || var4 != 0) && (var2 != 2 || var4 != 1)) {
         System.out.println("Computer win");
      } else {
         System.out.println("You win");
      }

      if (var4 == 0) {
         System.out.println("Computer choice : Rock ");
      } else if (var4 == 1) {
         System.out.println("Computer choice : Paper ");
      } else if (var4 == 2) {
         System.out.println("Computer choice : Scissor ");
      }

   }

}
