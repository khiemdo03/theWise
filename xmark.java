import java.util.Scanner;

public class xmark {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int n_Asterisks;
      int i; // Assigned loop counters and number
      int j;

      n_Asterisks = 5;

      while (((n_Asterisks % 2) == 1) && (n_Asterisks > 3)) { // Use (while) instead of (if) to loop
         System.out.print("What is the value of n? ");
         n_Asterisks = scnr.nextInt();

         if (((n_Asterisks % 2) == 1) && (n_Asterisks > 3)) // Restate to not (print) unless the statement is right
            for (i = 0; i < n_Asterisks; i = i + 1) { // 0 - n_Asterisks
               for (j = 0; j <= n_Asterisks; j = j + 1) { // 0 - n_Asterisks
                  if ((i == j) || (i + j == n_Asterisks - 1)) // if i is 0, then j is 0 (or) for ex: 3 + 3 = 7 - 1
                     System.out.print("*"); // print if one of the condition is True
                  else
                     System.out.print(" "); // if not, print space
               }
               System.out.println(); // Until j is out, print new line, and loop again
            }
      }
      System.out.println("Error : n must be an odd number greater than 3");
   }
}
// Khiem Do // 30 code lines