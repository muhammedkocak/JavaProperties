import java.util.Scanner;


public class _14_IF_ELSE_STATEMENT {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); //Scanning from the keyboard/input

        System.out.println("Voer uw leeftijd in aub."); //Prints out between the "    "
        int age = keyboard.nextInt(); //Declaring (int) variable age, and the value is linked to the keyboard/input

        if (age >= 18) {
            System.out.println("volwassene");
        }
        else if (age >= 10) {
            System.out.println("tiener");
        }
        else if (age >= 2) {
            System.out.println("kind");
        }
        else {
            System.out.println("baby");
        }


        //keyboard.useLocale(Locale.US);

        System.out.println("Voer uw lengte in aub (bv 1.75)"); //Prints out between the "    "
        double length = keyboard.nextDouble(); //Declaring (int) variable length, and the value is linked to the keyboard/input
        System.out.println("Voer uw gewicht in aub (bv 75)"); //Prints out between the "    "
        int weight = keyboard.nextInt(); //Declaring (int) variable weight, and the value is linked to the keyboard/input

        var bmi = weight / (length * length) ;


        if (bmi > 40) {
            System.out.println("Uw Bmi is " + (int) bmi);
            System.out.println("ziekelijk overgewicht");
        }
        else if (bmi >=30) {
            System.out.println("Uw Bmi is " + (int) bmi);
            System.out.println("obesitas");
        }
        else if (bmi >= 25) {
            System.out.println("Uw Bmi is " + (int) bmi);
            System.out.println("overgewicht");
        }
        else if (bmi >= 20) {
            System.out.println("Uw Bmi is " + (int) bmi);
            System.out.println("ideaal gewicht");
        }
            else {
            System.out.println("Uw Bmi is " + (int) bmi);
            System.out.println("ondergewicht");
            }


        keyboard.close();




   /* public static string giveBmiAdvice(double bmi) {

        return "standard advice";*/
    }
}

