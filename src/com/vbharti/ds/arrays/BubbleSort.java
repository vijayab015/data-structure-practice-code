package com.vbharti.ds.arrays;

public class BubbleSort {
        /*
         Bubble sort Example -> Ascending order
         */

    public static void main(String[] args) {
        int[] intArray = {10, 5, -8, 50, 20, 35, 6};

        for (int unSortedIndex = intArray.length - 1; unSortedIndex >= 0; unSortedIndex--) {
            for (int i = 0; i < unSortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swapFun(intArray, i, i + 1);
                }
            }
        }
        for (int p : intArray) {
            System.out.print(+p + " ");
        }

    }


    public static void swapFun(int[] intArray, int i, int j) {

        if(i == j)
        {
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
