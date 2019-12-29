public class CreatingVariables {
    public static void main(String[] args){
      int x, y, age, specialScoops;
      double seconds, e, checking, specialPrice;
      String firstName, lastName, title, flavor, specialName;

      x = 10;
      y = 400;
      age = 39;
      specialScoops = 3;
      specialPrice = 4.59;
      seconds = 4.71;
      e = 2.71818284590452356;
      checking = 1.89;

      firstName = "Graham";
      lastName = "Mitchell";
      title = "Mr.";
      flavor = "cookies and caramel";
      specialName = "Fireplace Companion";

      System.out.println( "The variable x contains " + x);
      System.out.println( "The value " + y + " is stored in the variable y.");
      System.out.println( "The experiment took " + seconds + " seconds.");
      System.out.println( "A favorite irrational # is Euler's number: " + e);
      System.out.println( "Hopefully you have more than $" + checking + "!");
      System.out.println( "My name's " + title + " " + firstName + lastName);
      System.out.println( "Today's ice cream special is the " + specialName + " which includes " + flavor + ". Available for a limited time " + specialScoops +  " scoops for only $" + specialPrice);

    }
}
