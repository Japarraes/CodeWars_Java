package SnailSort;

import java.util.Arrays;

public class SnailSortV2 {
    /* Given an n x n array, return the array elements arranged from outermost elements to the middle element,
       traveling clockwise.
       array = [[1,2,3],
                [4,5,6],
                [7,8,9]]
       snail(array) #=> [1,2,3,6,9,8,7,4,5]
     */
    public static void main(String[] args) {
        //int[][] array = {{1,2},
        //                 {4,3}}; // --> [1,2,3,6,9,8,7,4,5]
        //int[][] array = {{1,2,3},
        //                 {4,5,6},
        //                 {7,8,9}}; // --> [1,2,3,6,9,8,7,4,5]
        //int[][] array = {{1,2,3},
        //                 {8,9,4},
        //                 {7,6,5}}; // --> [1,2,3,4,5,6,7,8,9]
        //int[][] array = {{1,2,3,4},
        //                 {2,3,4,5},
        //                 {1,6,5,6},
        //                 {0,9,8,7}}; // --> [1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6]
        //int[][] array = {{1, 2, 3, 4, 5},
        //                 {16,17,18,19,6},
        //                 {15,24,25,20,7},
        //                 {14,23,22,21,8}, // --> [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,
        //                 {13,12,11,10,9}};// -->  16,17,18,19,20,21,22,23,24,25]
        /*int[][] array = {{ 1,  2,  3,  4,  5,  6,  7},
                         {24, 25, 26, 27, 28, 29,  8},
                         {23, 40, 41, 42, 43, 30,  9},
                         {22, 39, 48, 49, 44, 31, 10},
                         {21, 38, 47, 46, 45, 32, 11},
                         {20, 37, 36, 35, 34, 33, 12},
                         {19, 18, 17, 16, 15, 14, 13}};*/
        int[][] array = {{733, 762, 663, 423,  88, 804, 990, 387, 598, 941, 940, 280, 783, 628,  35},
                         {850,  21, 936, 922, 896, 344, 394, 959, 987, 384, 685, 944, 103, 431, 316},
                         {598,   8, 331, 305, 839, 179,  20, 869, 751, 788, 123,  14, 620, 526,  65},
                         {180, 765, 754,  82,  57, 447, 911, 436, 641,  63, 862, 873, 804, 414, 631},
                         {522, 806, 185, 203, 683, 821, 974,  22, 459,   3, 796, 912, 220, 771, 780},
                         {614, 722, 297, 456, 137, 347, 873, 556, 737, 797,  47, 973, 429,  72, 640},
                         {551, 843, 439, 432, 313, 494, 570, 609, 366, 350, 507, 489, 969, 740, 263},
                         {481,  73, 941,  53, 465, 594, 762, 972, 827, 733,  23, 552,  78, 437, 294},
                         {872, 207, 769, 380, 278, 383,  73,  61, 844, 715, 461, 269, 735, 715, 936},
                         {699, 714, 106, 764, 496, 603, 256, 678, 705, 722, 685, 918,  24, 666, 973},
                         {280, 164, 707, 942, 530, 514, 897, 320, 854, 933, 323, 478, 982, 512, 283},
                         {520,  87,  98, 318, 927,  64, 561, 304, 971, 969, 562, 633, 729,  60, 262},
                         {475, 208, 391, 350, 685, 290, 934, 184, 989, 646, 980, 249, 453, 725, 405},
                         { 55, 875, 556, 733, 201, 644, 460, 298, 158, 312,  38, 310, 802, 276, 405},
                         {433, 791, 223, 542, 928, 506, 451, 904, 649, 219, 510, 438, 350, 733, 158}};
        System.out.println(Arrays.toString(snail(array)));
    }

    public static int[] snail(int[][] array) {

        // Determinar el tamaño del array de salida: n x n del array de entrada
        int items = (array.length * array[0].length);
        int[] snailArray = new int[items];
        //List<Integer> snailArray = new ArrayList<Integer>();
        int pos = 0;
        for (int j = 0; j < array[0].length; j++) {
            snailArray[pos] =array[0][j];
            pos++;
        }
        if (array.length > 1) {
            for (int i = 1; i < array.length; i++) {
                snailArray[pos] = array[i][array[i].length-1];
                pos++;
            }
            for (int k = (array.length-1); k > 0; k--) {
                snailArray[pos] = array[array.length-1][k-1];
                pos++;
            }
            for (int l = array.length-1; l > 1; l--) {
                snailArray[pos] = array[l-1][0];
                pos++;
            }
        }
        if (array.length == 3){
            // Obtener valor central de la matriz
            snailArray[pos] = array[1][1];
            return snailArray;
        }

        // si la matriz es mayor de 3x3, obtener la matriz central y repetir procedimiento
        int sizeArray = array.length;

        //while (sizeArray > 3) {
        while (pos < items-1) {
            int[][] interArray = new int[array.length - 2][array[0].length - 2];

            int k = 0;
            for (int i = 1; i < array.length - 1; i++) {
                int l = 0;
                for (int j = 1; j < array.length - 1; j++) {
                    interArray[k][l] = array[i][j];
                    l++;
                }
                k++;
            }
            sizeArray = interArray.length;

            int[] interSnailArray = snail(interArray);
            pos--;
            for (int item : interSnailArray) {
                pos++;
                snailArray[pos] = item;
            }
        }

        return snailArray;
    }
}
