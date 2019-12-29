import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double m, kg, bmi, lb, ft, in;

        System.out.print( "Your height (feet only): ");
        ft = keyboard.nextDouble();

        System.out.print( "Your height (inches): ");
        in = keyboard.nextDouble();
        //convert ft to inches first, then to cm, then meters
        m = (((ft*12)+in) * 2.54)/100;

        System.out.print("Your weight in pounds: ");
        lb = keyboard.nextDouble();
        //convert kg to lb
        kg = lb*0.453592;

        bmi = kg / (m*m);

        System.out.println("Your BMI is " + bmi);
    }
}
