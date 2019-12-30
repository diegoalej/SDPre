import java.util.Scanner;

public class Objective4Lab4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = keyboard.nextInt();

        if (number % 2 == 0) {
          System.out.println("The number is even");
        }
        else  {
          System.out.println("The number is odd");
        }
    }
}
