package Practice.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArray {

    public static void main(String[] args) {

        int[] numbers__array = { 1, 2, 3, 4 };
        int size = numbers__array.length;
        System.out.println("product of array is : "
                + productOfArray__recursion(numbers__array, size));

    }

    public static int productOfArray__recursion(int array[], int size) {

        if (size <= 0) {
            return 1;
        }
        return array[size - 1] * productOfArray__recursion(array, size - 1);
    }
}
