package Practice.Recursion.basic;

public class Power {

    public static void main(String[] args) {
        int base = 5;
        int exp = 4;

        System.out.println(base + " ^ " + exp + " = " + power__recursion(base, exp));
    }

    public static int power__recursion(int base, int exp) {

        if (exp < 0) {
            return -1;
        }
        if (exp == 0) {
            return 1;
        }
        return base * power__recursion(base, (exp - 1));

    }

}
