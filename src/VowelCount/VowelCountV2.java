package VowelCount;

public class VowelCountV2 {

    public static void main(String[] args) {

        System.out.println(getCount("En un lugar de la Mancha ..."));

    }

    public static int getCount(String str) {
        /*
         * Return the number (count) of vowels in the given string.
         * We will consider a, e, i, o, u as vowels for this Kata (but not y).
         * The input string will only consist of lower case letters and/or spaces.
         */

        return howManyChar(str, 'a') +
                howManyChar(str, 'e') +
                howManyChar(str, 'i') +
                howManyChar(str, 'o') +
                howManyChar(str, 'u');

    }

    public static int howManyChar(String str, char ch) {
        int nChar = 0;

        String[] letters = String.valueOf(str).toLowerCase().split("");

        for (String letter : letters) {
            if (letter.contains(String.valueOf(ch))) {
                nChar++;
            }
        }

        return nChar;
    }
}
