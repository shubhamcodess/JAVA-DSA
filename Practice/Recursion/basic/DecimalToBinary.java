package Practice.Recursion.basic;

public class DecimalToBinary {

    public static void main(String[] args) {

        int decimal = 11;
        System.out.println("Decimal Representation of " + decimal + " is : " + decimalToBinary__recurion(decimal));
    }

    public static int decimalToBinary__recurion(int binary) {

        if (binary == 0) {
            return 0;
        }
        return binary % 2 + 10 * decimalToBinary__recurion(binary / 2);

    }
}
