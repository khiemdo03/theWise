
import java.util.Scanner;
/**
 * @author Khiem
 */
public class forjavadoc {
    /**
     * @param args
     * This is a program for adding numbers
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                                         
        /** 
         * This is the main method, to execute the java program
         */

        int x = input.nextInt();
        int y = input.nextInt();
        int sum = x + y;
        /**
         * Store input from user and add them up
         * @return null
         */

        System.out.println("Sum is " + sum);


    }
} 