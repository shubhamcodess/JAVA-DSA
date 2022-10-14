package Practice.Recursion.basic;

public class Palindrome {

    public static void main(String[] args) {
        String string = "hannah";
        System.out.println("\"" + string + "\"" + " is " + (isPalindrome__recursion(string) ? "" : "not ")
                + "a Palindrome String");
    }

    public static boolean isPalindrome__recursion(String string) {

        if (string.isEmpty() || string.length() == 1) {
            return true;
        }
        if (string.charAt(0) == string.charAt(string.length() - 1)) {
            return isPalindrome__recursion(string.substring(1, string.length() - 1));
        }

        return false;

    }
}
