import java.util.Scanner;

public class DictionaryOrder {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        String name;

        System.out.print("Make up the name of a programming language! ");
        name = keyboard.nextLine();

        if (name.toLowerCase().compareTo("c++") < 0) {
          System.out.println(name + " comes BEFORE c++");
        }
        if (name.toLowerCase().compareTo("c++") == 0) {
          System.out.println(name + "c++ isn't a made up language!");
        }
        if (name.toLowerCase().compareTo("c++") > 0) {
          System.out.println(name + " comes AFTER c++");
        }

        if (name.toLowerCase().compareTo("go") < 0) {
          System.out.println(name + " comes BEFORE go");
        }
        if (name.toLowerCase().compareTo("go") == 0) {
          System.out.println(name + "go isn't a made up language!");
        }
        if (name.toLowerCase().compareTo("go") > 0) {
          System.out.println(name + " comes AFTER go");
        }

        if (name.toLowerCase().compareTo("java") < 0) {
          System.out.println(name + " comes BEFORE java");
        }
        if (name.toLowerCase().compareTo("java") == 0) {
          System.out.println(name + "java isn't a made up language!");
        }
        if (name.toLowerCase().compareTo("java") > 0) {
          System.out.println(name + " comes AFTER java");
        }

        if (name.toLowerCase().compareTo("lisp") < 0) {
          System.out.println(name + " comes BEFORE lisp");
        }
        if (name.toLowerCase().compareTo("lisp") == 0) {
          System.out.println(name + "lisp isn't a made up language!");
        }
        if (name.toLowerCase().compareTo("lisp") > 0) {
          System.out.println(name + " comes AFTER lisp");
        }

        if (name.toLowerCase().compareTo("python") < 0) {
          System.out.println(name + " comes BEFORE python");
        }
        if (name.toLowerCase().compareTo("python") == 0) {
          System.out.println(name + "python isn't a made up language!");
        }
        if (name.toLowerCase().compareTo("python") > 0) {
          System.out.println(name + " comes AFTER python");
        }

        if (name.toLowerCase().compareTo("ruby") < 0) {
          System.out.println(name + " comes BEFORE ruby");
        }
        if (name.toLowerCase().compareTo("ruby") == 0) {
          System.out.println(name + "ruby isn't a made up language!");
        }
        if (name.toLowerCase().compareTo("ruby") > 0) {
          System.out.println(name + " comes AFTER ruby");
        }

        if (name.toLowerCase().compareTo("visualbasic") < 0) {
          System.out.println(name + " comes BEFORE visualbasic");
        }
        if (name.toLowerCase().compareTo("visualbasic") == 0) {
          System.out.println(name + "visualbasic isn't a made up language!");
        }
        if (name.toLowerCase().compareTo("visualbasic") > 0) {
          System.out.println(name + " comes AFTER visualbasic");
        }

      }
    }
