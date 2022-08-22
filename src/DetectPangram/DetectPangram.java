package DetectPangram;

public class DetectPangram {

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog"));
    }

    public static boolean check(String sentence){

        /*
         * A pangram is a sentence that contains every single letter of the alphabet at least once.
         * For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram,
         * because it uses the letters A-Z at least once (case is irrelevant).
         *
         * Given a string, detect whether or not it is a pangram.
         * Return True if it is, False if not. Ignore numbers and punctuation.
         */

        String abc = "abcdefghijklmnopqrstuvwxyz";
        String actual;

        // Convertir el texto a minúscula
        String str = sentence.toLowerCase();

        // Comprobamos que cada letra del abecedario está contenida en la frase
        for (int i = 0; i < abc.length(); i++) {

            actual = String.valueOf(abc.charAt(i));

            if ( !str.contains(actual) ) {
                return false;
            }

        }

        return true;

    }
}
