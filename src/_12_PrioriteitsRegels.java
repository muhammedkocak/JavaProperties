public class _12_PrioriteitsRegels { //Class name
    public static void main(String[] args) { //Main method line

        int number = 15<10?1:0;

        int a = 1;
        int b = 2;
        //              a=2  2     1  false    2
        int result = ((++a * b-- + b) < 2 )? --a : ++b;

        System.out.println(result);


    }
}
