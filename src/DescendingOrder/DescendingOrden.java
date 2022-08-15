package DescendingOrder;

import java.util.Arrays;
import java.util.Comparator;


public class DescendingOrden {

    public static void main(String[] args) {

        System.out.println(sortDesc(15951));

    }

    public static int sortDesc(final int num) {

        /**
         * function that can take any non-negative integer as an argument and return it with its digits
         * in descending order. Essentially, rearrange the digits to create the highest possible number.
         * Examples:
         * Input: 42145     Output: 54421
         * Input: 145263    Output: 654321
         */
        int solucion;

        // Creamos array String para cada cifra del número indicado
        String []numText = String.valueOf(num).split("");

        // Ordenamos el Array de forma descendente
        Arrays.sort(numText, Comparator.reverseOrder());

        // Convertir el Array a un int, que es el parámetro que devuelve la función
        return Integer.valueOf(String.join("", numText));

    }
}
