package SnailSort;

import java.util.Arrays;

public class SnailSort {
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

        int[][] array = {{1, 2, 3, 4, 5},
                         {16,17,18,19,6},
                         {15,24,25,20,7},
                         {14,23,22,21,8}, // --> [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,
                         {13,12,11,10,9}};// -->  16,17,18,19,20,21,22,23,24,25]

        System.out.println(Arrays.toString(snail(array)));
    }

    public static int[] snail(int[][] array) {

        int[] miSnail = obteinPerimeter(array);
        return miSnail;

    }

    public static int[] obteinPerimeter(int[][] array){
        // Determinar el tamaño del array de salida: n x n del array de entrada
        int items = (array.length * array[0].length);
        int[] snailArray = new int[items];
        int pos = 0;
        for (int j = 0; j < array[0].length; j++) {
            snailArray[pos] = array[0][j];
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

        while (sizeArray > 3) {
            int[][] interArray = new int[array.length-2][array[0].length-2];

            int k = 0;
            for (int i = 1; i < array.length-1; i++) {
                int l = 0;
                for (int j = 1; j < array.length-1; j++) {
                    interArray[k][l] = array[i][j];
                    l++;
                }
                k++;
            }
            sizeArray = interArray.length;

            int[] interSnailArray = obteinPerimeter(interArray);
            for (int item: interSnailArray) {
                snailArray[pos]= item;
                pos++;
            }
        }

        return snailArray;
    }
}
