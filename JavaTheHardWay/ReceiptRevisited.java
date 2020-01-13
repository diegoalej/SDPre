import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisited {
      public static void main(String[] args) throws Exception {
            PrintWriter fileout = new PrintWriter("receipt.txt");
            Scanner keyboard = new Scanner(System.in);
            double ppGallon = 2.88;
            double total = 0;
            System.out.println("Gas costs $" + ppGallon + " per gallon.");
            System.out.print("How many gallons do you want? ");
            double amountOfGas = keyboard.nextDouble();
            total = amountOfGas*ppGallon;
            System.out.println("Total cost: $" +total);


            fileout.println("+------------------------+");
            fileout.println("|                        |");
            fileout.println("|      CORNER STORE      |");
            fileout.println("|                        |");
            fileout.println("|  2014-06-25 04:38PM    |");
            fileout.println("|                        |");
            fileout.println("| Gallons:      "+amountOfGas+"     |");
            fileout.println("| Price/gallon: $ "+ppGallon+"   |");
            fileout.println("|                        |");
            fileout.println("| Fuel total:   $"+total+"  |");
            fileout.println("|                        |");
            fileout.println("+------------------------+");
            fileout.close();

            System.out.println("\nWriting customized receipt to 'receipt.txt'... done");
      }

}
