import java.util.Scanner;
//Khiem Do

public class Volume {

   public static double getVolumeOfSphere(double x) { // Method to calculate the sphere volume

      double volume = Math.pow(x, 3) * Math.PI * (4.0 / 3.0); // calculate final answer
      return volume;
   }

   public static void main(String[] args) { // Method to get the input and provide the output
      Scanner scnr = new Scanner(System.in);
      double radius;

      System.out.print("Enter the radius of the sphere: ");

      radius = scnr.nextDouble();

      System.out.printf("That sphere has a volme of %.2f ", getVolumeOfSphere(radius)); // Get only 2 decimal digits
   }
}
// Hope this is better