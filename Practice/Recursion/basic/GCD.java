package Practice.Recursion.basic;

public class GCD {

    public static void main(String[] args) {

        int number__1 = 8;
        int number__2 = 4;

        System.out.println(
                "GCD of ( " + number__1 + " , " + number__2 + " ) is : " + gcd__recursion(number__1, number__2));
    }

    public static int gcd__recursion(int number__1, int number__2) {

        if (number__1 < 0 || number__2 < 0) {
            return -1;
        }

        if (number__2 == 0) {
            return number__1;
        }

        return gcd__recursion(number__2, (number__1 % number__2));
    }

}
