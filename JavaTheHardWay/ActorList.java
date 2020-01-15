import java.util.Scanner;

class Actor {
      String name;
      String role;
      String birthdate;
}

public class ActorList {
      public static void main(String[] args) throws Exception {
            String url = "https://learnjavathehardway.org/txt/s01e01-cast.txt";
            // Scanner inFile = new Scanner(new java.io.File("s01e01-cast.txt"));
            Scanner inFile = new Scanner((new java.net.URL(url)).openStream());
            int counter = 0;
            while (inFile.hasNext()) {
                  Actor a = getActor(inFile);
                  System.out.print(a.name + " was born on " + a.birthdate);
                  System.out.println(" and played " + a.role);
                  counter++;
            }
            inFile.close();
            System.out.println("There are a total of " + counter + " records.");
      }

      public static Actor getActor(Scanner input) {
            Actor a = new Actor();
            a.name = input.nextLine();
            a.role = input.nextLine();
            a.birthdate = input.nextLine();

            return a;
      }
}
