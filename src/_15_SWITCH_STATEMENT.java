import java.util.Scanner;

public class _15_SWITCH_STATEMENT {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); //Scanning from the keyboard/input

        System.out.println("Geef het nummer van de maand in."); //Prints out between the "    "
        int month = keyboard.nextInt(); //Declaring (int) variable month, and the value is linked to the keyboard/input
        int days = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: days = 31; break;
            case 2: days = 28; break;
            case 4:
            case 6:
            case 9:
            case 11: days = 30; break;
            default: System.out.println("Ongeldige invoer!");
        }

        System.out.println(days);


        keyboard.close();

    }
}
