package MaximumSubarraySum;

import java.util.Arrays;

public class MaximumSubarraySum {

    public static void main(String[] args) {
        /*
        The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence
        in an array or list of integers:
        Example:
        Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}); should be 6: {4, -1, 2, 1}

        Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of
        the whole array. If the list is made up of only negative numbers, return 0 instead.

        Empty list is considered to have zero greatest sum. Note that the empty list or array is also a
        valid sublist/subarray.
         */
        //System.out.println(sequence(new int[] {}));
        //System.out.println(sequence(new int[] {-2, -1, -3, -4, -1, -2, -1, -5, -4}));
        System.out.println(sequence(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));

    }

    public static int sequence(int[] arr) {

        /*
        int sumUpTo  = 0;
        int maxSum = 0;
        for(int n : arr) {
            //sum the sequence unless the sum is less than the current element, if that occurs start summing from the current element
            sumUpTo = Math.max(n, sumUpTo + n);
            // assign maxSum as the greater of the current sum sequence and previous greatest sequence
            maxSum = Math.max(maxSum, sumUpTo);
        }
        */

        int maxTemp = 0;
        int maxTotal = 0;

        // Si el array está vacío, devolver cero.
        if (arr.length == 0){
            return 0;
        }

        // Si el array está formado sólo por números negativos, devolver cero
        if (Arrays.stream(arr).max().getAsInt() <= 0) {
            return 0;
        }

        for (int i : arr) {

            // Verificar si la suma de el acumulado + el valor actual es mayor al valor actual
            if ( (maxTemp + i) > i ) {
                maxTemp += i; // Guardamos el valor mayor
            } else {
                maxTemp = i; // Guardamos el valor actual como sumatorio mayor
            }

            // Verificar si la suma del valor acumulado + el actual es mayor que el histórico de toda la serie
            // hasta el momento actual.
            if ( maxTotal < maxTemp ) {
                maxTotal = maxTemp;
            }

        }

        return maxTotal;
    }

}
