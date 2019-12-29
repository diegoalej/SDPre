import java.util.Scanner;

public class RudeQuestions {
    public static void main(String[] args){
        String name, favColor;
        int age;
        double weight, income;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Hello. What is your name? " );
        name = keyboard.next();

        System.out.print( "Hi, " + name + "! How old are you? ");
        age = keyboard.nextInt();

        System.out.println("So you're " + age + " eh? That's not very old.");
        System.out.print("How much do you weigh, " + name + "? ");
        weight = keyboard.nextDouble();

        System.out.println(weight + "! Better keep that quiet!!");
        System.out.print("Finally, what's your income, " + name + "? ");
        income = keyboard.nextDouble();

        System.out.print("Hopefully that is " + income + " per hour");
        System.out.println(" and not per year!") ;
        System.out.print("Thanks for answering my rude questions, one more thing, what is you favorite color? ");
        favColor = keyboard.next();

        System.out.println("Well , " + name + ", your choice of " + favColor + " shows you have terrible taste.");

        //it does not break, my guess is since a double can hold the int it does not lose anything
        //no, a string can hold any character or number
        //typing in a character breaks the most possible questions since it expects an int or double

    }
}
