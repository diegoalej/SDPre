import java.util.Scanner;

public class ItemNotFound {
    public static void main(String[] args) {
          Scanner keyboard = new Scanner(System.in);

          String [] heroes = {
                "Abderus", "Achilles", "Aeneas", "Ajax", "Amphitryon",
                "Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
                "Eleusis", "Eunostus", "Ganymede", "Hector", "Iolaus", "Jason",
                "Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus"
          };
          String guess;
          boolean found = false;

          System.out.println("Pop quiz! \nName any *mortal* hero from Greek mythology: ");
          guess = keyboard.next();

          for (String hero : heroes ) {
                if (guess.equals(hero)){
                    System.out.println("That's one of them!");
                    found = true;
                }
          }

          if (found == false) {
                System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
          }

          String [] fruit = {
                "Orange", "Pear", "Peach", "Mango", "Avocado",
                "Grape", "Banana", "Coconut", "Apple", "Guava",
                "Avocado", "Grape", "Apricot", "Grapefruit", "Apple", "Avocado",
                "Papaya", "Strawberry", "Blackberry", "Blueberry", "Tomato"
          };
          String fruitGuess;
          int counter = 0;
          System.out.println("Pop quiz! \nName any fruit to find in inventory: ");
          fruitGuess = keyboard.next();

          for (int i = 1; i < fruit.length ; i++ ) {
                if (fruit[i].equals(fruitGuess)) {
                  System.out.println("We have it!");
                  counter++;
                }
          }
          //Conditional if fruit was not found
          if (counter < 1) {
            System.out.println("Sorry, we do not have that fruit.");
          }

    }
}
