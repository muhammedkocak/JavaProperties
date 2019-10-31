import java.io.IOException;

public class _15_SWITCH_STATEMENT_PART_2 {
    public static void main(String[] args)  throws IOException {
        System.out.println("Enter character ");
        char c = (char) System.in.read();
        int score = 0;

        switch (c) {
            case 'g':
            case 'd':
                score = 2; break;

            case 'b':
            case 'c':
            case 'm':
            case 'p':
                score = 3; break;

            case 'f':
            case 'h':
            case 'v':
            case 'w':
            case 'y':
                score = 4; break;

            case 'k':
                score = 5; break;

            case 'j':
            case 'x':
                score = 8; break;

            case 'q':
            case 'z':
                score = 10; break;

            default:
                score = 1;
        }

        System.out.println("The scrabble-score = " + score);

    }
}
