package Mumbling;

import java.util.Locale;

public class Mumbling {

    public static void main(String[] args) {

        System.out.println(accum("ABCD"));

    }

    public static String accum(String s) {

        /**
         * The examples below show you how to write function:
         * Examples:
         * accum("abcd") -> "A-Bb-Ccc-Dddd"
         * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
         * accum("cwAt") -> "C-Ww-Aaa-Tttt"
         */

        // Guardamos cada cifra del número en un array de String
        String []letters = String.valueOf(s).split("");

        // Para cada letra, repetimos tantas veces como el índice de su posición, pero la primera
        // iteración debe ir en mayúscula y el resto en minúscula
        for (int i = 0; i < letters.length; i++){

            char letra = letters[i].charAt(0);
            letters[i] = String.valueOf(letra).toUpperCase() + letters[i].repeat(i).toLowerCase();

        }

        // Devolvemos el valor concatenando cada elemento del array en un sólo número
        return String.valueOf(String.join("-", letters));
    }
}
