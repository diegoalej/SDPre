public class ArrayIntro {
      public static void main(String[] args) {
            String [] planets = { "Mercury", "Venus", "Earth", "Mars",
                                  "Jupiter", "Saturn", "Uranus", "Neptune" };

            for (String p : planets ) {
                  System.out.println( p + "\t" + p.toUpperCase());
            }

            String [] colors = { "Blue", "Red", "Green" };
            System.out.println("Some basic colors are: ");
            for (String a : colors ) {
                  System.out.println(a.toLowerCase());
            }
      }
}
