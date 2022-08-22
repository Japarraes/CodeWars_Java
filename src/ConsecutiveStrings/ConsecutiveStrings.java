package ConsecutiveStrings;

public class ConsecutiveStrings {

    /*
    You are given an array(list) strarr of strings and an integer k.
    Your task is to return the first longest string consisting of k consecutive strings taken in the array.

    Examples:
    strarr = ["tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"], k = 2

    Concatenate the consecutive strings of strarr by 2, we get:

    treefoling   (length 10)  concatenation of strarr[0] and strarr[1]
    folingtrashy ("      12)  concatenation of strarr[1] and strarr[2]
    trashyblue   ("      10)  concatenation of strarr[2] and strarr[3]
    blueabcdef   ("      10)  concatenation of strarr[3] and strarr[4]
    abcdefuvwxyz ("      12)  concatenation of strarr[4] and strarr[5]

    Two strings are the longest: "folingtrashy" and "abcdefuvwxyz".
    The first that came is "folingtrashy" so
    longest_consec(strarr, 2) should return "folingtrashy".

    In the same way:
    longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
    n being the length of the string array, if n = 0 or k > n or k <= 0 return ""
    (return Nothing in Elm, "nothing" in Erlang).
     */

    public static void main(String[] args) {
        //String []strArr = new String[] {"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};
        String []strArr = new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        //String []strArr = new String[] {};
        System.out.println(longestConsec(strArr, 2));
    }

    public static String longestConsec(String[] strarr, int k) {

        String strFirstLongest = "";
        String concatenated;

        // Si el array está vacio o K <=0 o K es mayor que array.length, devolver "Nothing"
        if (strarr.length == 0 || k <= 0 || k > strarr.length) {
            return "";
        }

        // Concatenar los elementos según el valor k
        for (int i = 0; i <= strarr.length-k; i++) {

            concatenated = "";
            for (int j = 0; j < k; j++) {
                concatenated += strarr[i+j];
            }

            // Quedarse con el primer elemento de mayor longitud
            if (concatenated.length() > strFirstLongest.length()) {
                strFirstLongest = concatenated;
            }
        }

        return strFirstLongest;
    }
}
