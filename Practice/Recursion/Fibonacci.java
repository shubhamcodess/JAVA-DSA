package Practice.Recursion;

public class Fibonacci {

    public static void main(String[] args) {
        int number = 11;
        System.out.println("FIbonacci Series of " + number + " is : " + fibonacci__recursion(number));
        ;
    }

    public static int fibonacci__recursion(int number) {

        if (number < 0) {
            return -1;
        }

        if (number == 0 || number == 1) {
            return number;
        }

        return fibonacci__recursion(number - 1) + fibonacci__recursion(number - 2);

    }

}
