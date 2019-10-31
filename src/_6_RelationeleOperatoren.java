import java.util.Scanner;

public class _6_RelationeleOperatoren { //Class name
    public static void main(String[] args) { //Main method line

        Scanner keyboard = new Scanner(System.in); //Scanning from the keyboard/input

        System.out.println("Voer getal1 in aub."); //Prints out between the "    "
        int number1 = keyboard.nextInt(); //Declaring (int) variable number1, and the value is linked to the keyboard/input
        System.out.println("Voer getal2 in aub."); //Prints out between the "    "
        int number2 = keyboard.nextInt(); //Declaring (int) variable number2, and the value is linked to the keyboard/input

        System.out.println("getal1 : " + number1); //Prints out between the "    " + the value of variable number1
        System.out.println("getal2 : " + number2); //Prints out between the "    " + the value of variable number2
        System.out.println("getal1 < getal2 : " + (number1 < number2)); //Prints out between the "    " + result (true/false) litler than (lt)
        System.out.println("getal1 <= getal2 : " + (number1 <= number2)); //Prints out between the "    " + result (true/false)
        System.out.println("getal1 > getal2 : " + (number1 > number2)); //Prints out between the "    " + + result (true/false) greater than (gt)
        System.out.println("getal1 >= getal2 : " + (number1 >= number2)); //Prints out between the "    " + + result (true/false)
        System.out.println("getal1 == getal2 : " + (number1 == number2)); //Prints out between the "    " + result (true/false)
        System.out.println("getal1 != getal2 : " + (number1 != number2)); //Prints out between the "    " + result (true/false)

        keyboard.close(); //Stops scanning from keyboard/input
    }
}
