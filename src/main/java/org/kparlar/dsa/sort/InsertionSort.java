package org.kparlar.dsa.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String []args){

        int []arr = {64, 10, 2, 5, 8, 85};
        int []sortedArr = sort(arr);
        Arrays.stream(sortedArr).forEach(i -> System.out.print(i+" "));

    }

    public static int[] sort(int []arr){
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
