package SquareDigit;

public class SquareDigit {

    public static void main(String[] args) {

        System.out.println(squareDigits(9119));

    }
    public static int squareDigits(int n) {

        /*
         * Square every digit of a number and concatenate them.
         * For example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1.
         * Note: The function accepts an integer and returns an integer
         */

        // Guardamos cada cifra del número en un array de String
        String []numText = String.valueOf(n).split("");

        // Sustituimos el valor de cada cifra por su cuadrado conviertiendo el String en un int
        for (int i = 0; i < numText.length; i++) {
            numText[i] = String.valueOf(Integer.parseInt(numText[i]) * Integer.parseInt(numText[i]));
        }

        // Devolvemos el valor concatenando cada elemento del array en un sólo número
        return Integer.parseInt(String.join("", numText));
    }
}

