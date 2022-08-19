package GetMiddleCharacter;

public class GetMiddleCharacter {

    public static void main(String[] args) {
        System.out.println(getMiddle("a"));
    }

    public static String getMiddle(String word) {

        /**
         * return the middle character of the word. If the word's length is odd,
         * return the middle character. If the word's length is even, return the middle 2 characters.
         *
         * Examples:
         * Kata.getMiddle("test") should return "es"
         * Kata.getMiddle("testing") should return "t"
         * Kata.getMiddle("middle") should return "dd"
         * Kata.getMiddle("A") should return "A"
         */

        // Calculate de middle of the word
        int middle = word.length() / 2;

        // The word is even:
        if (word.length() % 2 == 0) {
            return word.substring((middle - 1), (middle+1));
        } else { // The word is odd:
            return word.substring((middle), (middle+1));
        }

    }
}
