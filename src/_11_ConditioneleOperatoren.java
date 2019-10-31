import java.util.Scanner;

public class _11_ConditioneleOperatoren { //Class name
    public static void main(String[] args) { //Main method line

        Scanner keyboard = new Scanner(System.in); //Scanning from the keyboard/input

        System.out.println("Voer getal1 in aub."); //Prints out between the "    "
        int number1 = keyboard.nextInt(); //Declaring (int) variable number1, and the value is linked to the keyboard/input
        System.out.println("Voer getal2 in aub."); //Prints out between the "    "
        int number2 = keyboard.nextInt(); //Declaring (int) variable number2, and the value is linked to the keyboard/input
        System.out.println("Voer getal3 in aub."); //Prints out between the "    "
        int number3 = keyboard.nextInt(); //Declaring (int) variable number3, and the value is linked to the keyboard/input

        System.out.println("getal1 : " + number1); //Prints out between the "    " + the value of variable number1
        System.out.println("getal2 : " + number2); //Prints out between the "    " + the value of variable number2
        System.out.println("getal3 : " + number3); //Prints out between the "    " + the value of variable number1

        System.out.println("(getal1 < getal2) ? getal1 : getal2 --> " + ((number1 < number2) ?number1:number2)); //Prints out between the " " + IF number1 lower than number2, print number1 otherwise number2
        System.out.println("(getal1 < getal3) ? getal1 : getal3 --> " + ((number1 < number3) ?number1:number3)); //Prints out between the " " + IF number1 lower than number3, print number1 otherwise number3
        System.out.println("(getal2 < getal1) ? getal2 : getal1 --> " + ((number2 < number1) ?number2:number1)); //Prints out between the " " + IF number2 lower than number1, print number otherwise number1
        System.out.println("(getal2 < getal3) ? getal2 : getal3 --> " + ((number2 < number3) ?number2:number3)); //Prints out between the " " + IF number2 lower than number3, print number2 otherwise number3
        System.out.println("(getal3 < getal1) ? getal3 : getal1 --> " + ((number3 < number1) ?number3:number1)); //Prints out between the " " + IF number3 lower than number1, print number3 otherwise number1
        System.out.println("(getal3 < getal2) ? getal3 : getal2 --> " + ((number3 < number2) ?number3:number2)); //Prints out between the " " + IF number3 lower than number2, print number3 otherwise number2





    }

}
