import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class CaesarCipher {
      /**
        * Returns the character shifted by the given number of letters.
        */
      public static char shiftLetter(char c, int n){
        int u = c;

        if (!Character.isLetter(c))
            return c;

        u = u + n;
        if(Character.isUpperCase(c) && u > 'Z'
            || Character.isLowerCase(c) && u > 'z') {
                  u -= 26;
        }
        if(Character.isUpperCase(c) && u < 'A'
            || Character.isLowerCase(c) && u < 'a') {
                  u += 26;
        }
        return (char)u;
      }

      public static void main(String[] args) throws Exception {
            Scanner keyboard = new Scanner(System.in);
            String plaintext, cipher = "";
            int shift;

            //Get the string from file (only reading first line since not working w/arrays)
            Scanner freshFile = new Scanner(new File("toBeDeciphered.txt"));
            plaintext = freshFile.nextLine();
            freshFile.close();
            // System.out.print("Message: ");
            // plaintext = keyboard.nextLine();

            //Get the shift from the user
            System.out.print("Shift (0-26): ");
            shift = keyboard.nextInt();

            for(int i=0; i<plaintext.length(); i++) {
                  cipher += shiftLetter(plaintext.charAt(i), shift);
            }
            //Get the new file name from user and write cipher to file
            System.out.print("What would you like your cipher to be saved as? ");
            String newFileName = keyboard.next();
            PrintWriter showCipher = new PrintWriter(new File(newFileName + ".txt"));
            showCipher.println(cipher);
            // System.out.println(cipher);
            showCipher.close();
      }
}
