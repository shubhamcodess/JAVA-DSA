package Practice.Recursion.advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintSubSequence {

    public static void main(String[] args) {

        List<Integer> array = Arrays.asList(3, 1, 2);
        List<Integer> subSequence__list = new ArrayList<>();
        int starting__index = 0;
        int array__size = array.size();
        String method__entryPoint__flag = "main";
        System.out.println("Subsequence of " + array.toString() + " is \n");
        print_subSequence__recursion(starting__index, subSequence__list, array, array__size, method__entryPoint__flag);
    }

    private static void print_subSequence__recursion(int starting__index, List<Integer> subSequence__list,
            List<Integer> array, int array__size, String method__entryPoint__flag) {

        System.out.println("print_subSequence__recursion called with -> " + "starting__index : " + starting__index +
                " | " + "subSequence__list : " + subSequence__list + " from " + method__entryPoint__flag);

        if (starting__index == array__size) {
            System.out.println("Base case executed");
            System.out.println("\t\tresultant subsequence ---> " + subSequence__list);
            return;
        }
        subSequence__list.add(array.get(starting__index));
        System.out.println(array.get(starting__index) + " is being added to subSequence__list");
        print_subSequence__recursion(starting__index + 1, subSequence__list, array, array__size, "take-case");
        System.out.println("recursion --Take case-- ended");
        System.out.println(
                subSequence__list.get(subSequence__list.size() - 1) + " is being removed from subSequence__list");
        subSequence__list.remove(subSequence__list.size() - 1);
        print_subSequence__recursion(starting__index + 1, subSequence__list, array, array__size, "not-take-case");
        System.out.println("recursion --Not Take case-- ended");

    }
}
