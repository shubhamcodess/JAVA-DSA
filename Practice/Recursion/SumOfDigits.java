package Practice.Recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        int number = 9398123;
        System.out.println("Sum of digits of " + number + " is " + sumOfigits__recursion(number));
    }

    public static int sumOfigits__recursion(int number) {

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 0;
        }

        return (number % 10) + sumOfigits__recursion(number / 10);

    }
}
