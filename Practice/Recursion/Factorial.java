package Practice.Recursion;

public class Factorial {

    public static void main(String[] args) {

        int number = 10;
        System.out.println("Factorial of " + number + " is : " + factorial__recursion(number));

    }

    public static int factorial__recursion(int number) {

        if (number < 0) {
            return -1;
        }

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial__recursion(number - 1);

    }

}