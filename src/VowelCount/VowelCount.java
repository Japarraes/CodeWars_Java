package VowelCount;

import java.io.UnsupportedEncodingException;

public class VowelCount {

    public static void main(String[] args) {

        System.out.println(getCount("En un lugar de la mancha ..."));

    }

    public static int getCount(String str) {
        /**
         * Return the number (count) of vowels in the given string.
         * We will consider a, e, i, o, u as vowels for this Kata (but not y).
         * The input string will only consist of lower case letters and/or spaces.
         */
        int nvowels = 0;

        String[] letters = String.valueOf(str).toLowerCase().split("");
        for (String letter : letters) {
            if (letter.contains(String.valueOf("a"))) {
                nvowels++;
            }else if (letter.contains(String.valueOf("e"))) {
                nvowels++;
            } else if (letter.contains(String.valueOf("i"))) {
                nvowels++;
            } else if (letter.contains(String.valueOf("o"))) {
                nvowels++;
            } else if (letter.contains(String.valueOf("u"))) {
                nvowels++;
            }
        }

        return nvowels;
    }

}
