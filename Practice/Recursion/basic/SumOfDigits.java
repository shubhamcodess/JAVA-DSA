package Practice.Recursion.basic;

public class SumOfDigits {

    public static void main(String[] args) {
        int number = 9398123;
        System.out.println("Sum of digits of " + number + " is " + sumOfDigits__recursion(number));
    }

    public static int sumOfDigits__recursion(int number) {

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 0;
        }

        return (number % 10) + sumOfDigits__recursion(number / 10);

    }
}
