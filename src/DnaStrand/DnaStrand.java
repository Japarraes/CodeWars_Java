package DnaStrand;

public class DnaStrand {

    public static void main(String[] args) {

        System.out.println(makeComplement("ATTGCGTAT"));

    }

    public static String makeComplement(String dna) {

        /*
         * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives
         * one side of the DNA (string, except for Haskell); you need to return the other complementary side.
         * DNA strand is never empty or there is no DNA at all (again, except for Haskell).
         * Example: (input --> output)
         * "ATTGC" --> "TAACG"
         * "GTAT" --> "CATA"
         */

        String dnaComplement = ""; // Cadena complementaria

        // Convertir el texto como parámetro en mayúsculas
        String dnaChain = dna.toUpperCase();

        for (int i = 0; i < dnaChain.length(); i++) {
            switch (dnaChain.charAt(i)) {
                case 'A' -> dnaComplement += "T";
                case 'T' -> dnaComplement += "A";
                case 'C' -> dnaComplement += "G";
                case 'G' -> dnaComplement += "C";
            }

        }
        return dnaComplement;

    }
}
