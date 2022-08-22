package HighestAndLowest;

import java.util.Arrays;

public class HighestAndLowest {

    public static void main(String[] args) {
        System.out.println(highAndLow("1 9 3 4 -5"));
    }

    public static String highAndLow(String numbers) {
        /*
         * In this little assignment you are given a string of space separated numbers,
         * and have to return the highest and lowest number.
         *
         * Examples
         * highAndLow("1 2 3 4 5")  // return "5 1"
         * highAndLow("1 2 -3 4 5") // return "5 -3"
         * highAndLow("1 9 3 4 -5") // return "9 -5"
         *
         * Notes:
         * All numbers are valid <Int32>, no need to validate them.
         * There will always be at least one number in the input string.
         * Output string must be two numbers separated by a single space, and highest number is first.
         */

        String [] numeros = String.valueOf(numbers).split(" ");
        Integer[] orderNumbers = new Integer[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            orderNumbers[i] = Integer.valueOf(numeros[i]);
        }
        Arrays.sort(orderNumbers);

        return orderNumbers[numeros.length - 1].toString() + " " + orderNumbers[0].toString();
    }
}
