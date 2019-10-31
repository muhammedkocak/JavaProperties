import java.util.Scanner;

public class _4_RekenkundigeOperatoren { //Class name

    public static void main(String[] args) { //Main method line
        Scanner keyboard = new Scanner(System.in); //Scanning from the keyboard/input

        System.out.println("Voer een getal in aub."); //Prints out between the "    "
        int number1 = keyboard.nextInt(); //Declaring (int) variable number1, and the value is linked to the keyboard/input
        System.out.println("Voer nogmaals een getal in aub."); //Prints out between the "    "
        int number2 = keyboard.nextInt(); //Declaring (int) variable number2, and the value is linked to the keyboard/input

        System.out.println("De som van beide getallen = " + (number1 + number2)); //Prints out between the "    " + result
        System.out.println("Het verschil van beide getallen = " + (number1 - number2)); //Prints out between the "    " + result
        System.out.println("Het product van beide getallen = " + (number1 * number2)); //Prints out between the "    " + + result
        System.out.println("De deling van beide getallen = " + (number1 / number2)); //Prints out between the "    " + + result
        System.out.println("De rest van de deling van beide getallen = " + (number1 % number2)); //Prints out between the "    " + result

        System.out.println("Voer uw lievelings getal in."); //Prints out between the "    "
        number1 = keyboard.nextInt(); //Changing the value in the given input (from keyboard)

        System.out.println("Uw lievelings getal veranderd na de bewerking --getal in " + --number1); //Prints out between the "    " + result

        System.out.println("Voer uw lievelings getal in."); //Prints out between the "    "
        number1 = keyboard.nextInt(); //Changing the value in the given input (from keyboard)

        System.out.println("Uw lievelings getal veranderd na de bewerking getal-- in " + number1--); //Prints out between the "    " + result

        System.out.println("Voer uw lievelings getal in."); //Prints out between the "    "
        number1 = keyboard.nextInt(); //Changing the value in the given input (from keyboard)

        System.out.println("Uw lievelings getal veranderd na de bewerking ++getal in " + ++number1); //Prints out between the "    " + result

        System.out.println("Voer uw lievelings getal in."); //Prints out between the "    "
        number1 = keyboard.nextInt(); //Changing the value in the given input (from keyboard)

        System.out.println("Uw lievelings getal veranderd na de bewerking getal++ in " + number1++); //Prints out between the "    " + result

        char aChar = 'm'; //Declaring (char) variable aChar with value 'm'

        System.out.println("Voer uw lievelings letter in."); //Prints out between the "    "
        char bChar = keyboard.next().charAt(0); //Declaring (char) variable bChar, and the value is linked to the keyboard/input

        System.out.println("Letter 'm' + ingevoerde letter = " + (aChar + bChar)); //Prints out between the "    " + result




        keyboard.close(); //Stops scanning from keyboard/input
    }
}



