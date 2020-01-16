import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

class Room {
      int roomNumber;
      String roomName;
      String description;
      int numExits;
      String[] exits = new String[10];
      int[] destinations = new int[10];
}

public class TextAdventureFinal {
      public static void main(String[] args) throws Exception {
            Scanner keyboard = new Scanner(System.in);

            //initialize rooms from file
            Room[] rooms = loadRoomsFromFile("text-adventure-rooms.txt");

            //showAllRooms(rooms); for debugging

            //condition to see if there is a saved game
            int currentRoom = 0;
            File savedFile = new File("saved-game.txt");
            if (savedFile.exists() && savedFile.length() > 0) {
                  System.out.print("A saved game exists, would you like to continue? \nType 'yes' to continue or any other char to start over: ");
                  String continueGame = keyboard.nextLine();
                  if (continueGame.equals("yes")) {
                    Scanner temporaryS = new Scanner(savedFile);
                    currentRoom = temporaryS.nextInt();
                    temporaryS.close();
                  }
            }
            else
            System.out.println("Ok, no saved game, from the top, let's play!");
            //Ok, let's play
            // int currentRoom = 0;
            String ans;
            while (currentRoom >= 0) {
                  Room cur = rooms[currentRoom];
                  System.out.print(cur.description);
                  System.out.print("Type destination options from above or 'sq' to save and quit \n> ");
                  ans = keyboard.nextLine();

                  // conditional to save game and quit
                  if (ans.equals("sq")) {
                        saveAndQuit(cur);
                        System.out.println("Thanks for playing, game has been saved (saved-game.txt).");
                        break;
                  }

                  //see if what they typed matches any of our exit names
                  boolean found = false;
                  for (int i = 0; i < cur.numExits ; i++ ) {
                        if (cur.exits[i].equals(ans)) {
                              //if so change our next room to that exit's room number
                              currentRoom = cur.destinations[i];
                              found = true;
                        }
                  }
                  if (!found) {
                        System.out.println("Sorry, I don't understand.");
                  }
            }
      }

      public static Room[] loadRoomsFromFile(String filename) {
            Scanner file = null;
            try {
                  file = new Scanner(new java.io.File(filename));
            }
            catch(java.io.IOException e) {
                  System.err.println("Can't open '" + filename + "' for reading.'");
                  System.exit(1);
            }

            int numRooms = file.nextInt();
            Room[] rooms = new Room[numRooms];

            //initialize rooms from file
            int roomNum = 0;
            while (file.hasNext()) {
                  Room r = getRoom(file);
                  if (r.roomNumber != roomNum) {
                        System.err.println("Just read room # " + r.roomNumber + ", but " + roomNum + " was expected.");
                        System.exit(2);
                  }
                  rooms[roomNum] = r;
                  roomNum++;
            }
            file.close();
            return rooms;
      }

      public static void showAllRooms(Room[] rooms) {
            for ( Room r : rooms ) {
                  String exitString = "";
                  for (int i = 0; i < r.numExits ;i++ ) {
                        exitString += "\t" + r.exits[i] + " (" + r.destinations[i] + ")";
                  }
                  System.out.println(r.roomNumber + " )" + r.roomName);
                  System.out.println(exitString);
            }
      }

      public static Room getRoom(Scanner f) {
            //any rooms left in the file?
            if (!f.hasNextInt()) {
                  return null;
            }
            Room r = new Room();
            String line;

            // read in the room # for error-checking later
            r.roomNumber = f.nextInt();
            f.nextLine(); //skip "\n" after room #

            r.roomName = f.nextLine();

            // read in the room's description
            r.description = "";
            while ( true) {
                  line = f.nextLine();
                  if (line.equals("%%")) {
                        break;
                  }
                  r.description += line + "\n";
            }

            // finally, we'll read in the exits`
            int i = 0;
            while (true) {
                  line = f.nextLine();
                  if (line.equals("%%")) {
                        break;
                  }
                  String[] parts = line.split(":");
                  r.exits[i] = parts[0];
                  r.destinations[i] = Integer.parseInt(parts[1]);
                  i++;
            }
            r.numExits = i;

            //should be done, return the room
            return r;
      }

      public static void saveAndQuit(Room saved) throws Exception {
            PrintWriter output = new PrintWriter(new File("saved-game.txt"));
            output.println(saved.roomNumber);
            output.close();
      }
}
