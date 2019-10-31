public class _7_LogischeOperatoren {
    public static void main(String[] args) {

        boolean itsRaining = true;
        boolean sunShining = true;
        boolean itsCloudy = true;

        boolean result = itsRaining && sunShining;

        if (result) {
            System.out.println("We get a rainbow");

        }
        result = itsRaining || sunShining;

        if (result) {
            System.out.println("Its raining or sun is shining");
        }
        if (itsRaining || sunShining && itsCloudy) {
            System.out.println("Its fenomenon outside");
        }

        int brightnessOutside = 70;

        if (itsRaining || ((brightnessOutside>50 && sunShining)) != itsCloudy) {
            System.out.println("Its nice day outside");
        }
    }
}
