import java.util.Scanner;

public class ArrayLinearSearch {
      public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            int [] orderNumbers = { 12345, 54321, 101010, 8765309, 31415, 27828};
            int toFind;
            boolean found = false;

            System.out.println("There are " + orderNumbers.length + " orders in the database.");
            System.out.print("Orders: ");
            for ( int num : orderNumbers ) {
                  System.out.print(num + " ");
            }
            System.out.println();

            System.out.print("Which order to find? ");
            toFind = keyboard.nextInt();

            for ( int num : orderNumbers ) {
                  if (num == toFind) {
                        System.out.println(num + " found.");
                        found = true;
                  }
            }
            //Conditional to print single message if not found
            if (found == false) {
                System.out.println("Order not found.");
            }
      }
}
