package Practice.Recursion.advance;

public class GenerateBrackets {

    public static void main(String[] args) {

        int N = 3;
        String output = new String();
        int open__count = 0;
        int close__count = 0;
        int curr__index = 0;
        generate_brackets__recursion(output, N, open__count, close__count, curr__index);
    }

    private static void generate_brackets__recursion(String output, int n, int open__count, int close__count,
            int curr__index) {

        // base
        if (curr__index == (2 * n)) {
            System.out.println(output);
        }

        if (open__count < n) {
            generate_brackets__recursion(output + "(", n, open__count + 1, close__count, curr__index + 1);
        }

        if (close__count < open__count) {
            generate_brackets__recursion(output + ")", n, open__count, close__count + 1, curr__index + 1);
        }

    }
}
