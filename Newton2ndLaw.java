import java.util.Arrays;
import java.util.Scanner;

public class Newton2ndLaw {

   public static Scanner scnr = new Scanner(System.in);

   public static void main(String[] arg) {

      while (true) {
         System.out.print("Missing variable: ");
         String rawInput = scnr.next();
         if (checkValidInput(rawInput)) {
            char missingVariable = rawInput.charAt(0);
            Newton2ndCalculation(missingVariable);
            break;
         } else {
            System.out.println("Not a valid input, try again: ");
         }
      }
   }

   public static boolean checkValidInput(String rawInput) {
      String[] validInputs = {"F", "m", "a"};
      return ((rawInput.length() == 1) && (Arrays.asList(validInputs).contains(rawInput)));
   }

   public static void Newton2ndCalculation(char missingVariable) {
      double F;
      double m;
      double a;

      switch (missingVariable) {
         case 'F':
            System.out.print("Value of m (in kg): ");
            m = scnr.nextDouble();
            System.out.print("Value of a (in m/s^2): ");
            a = scnr.nextDouble();
            System.out.println("The value of the missing variable is: " + (m * a) + " Newtons");
            break;
         case 'm':
            System.out.print("Value of F (in N): ");
            F = scnr.nextDouble();
            System.out.print("Value of a (in m/s^2): ");
            a = scnr.nextDouble();
            System.out.println("The value of the missing variable is: " + (F / a) + " kg");
            break;
         case 'a':
            System.out.print("Value of F (in N): ");
            F = scnr.nextDouble();
            System.out.print("Value of m (in kg): ");
            m = scnr.nextDouble();
            System.out.println("The value of the missing variable is: " + (F / m) + " m/s^2");
            break;
      }
   }
}
