package org.kparlar.dsa.sort;

import java.util.Arrays;

public class RecursiveSelectionSort {

    public static void main(String args[]){

        int []arr = {64,25,12,12,11};
        int []sortedArr = sort(arr, 0);
        Arrays.stream(sortedArr).forEach(i -> System.out.print(i+" "));
    }
    public static int [] sort(int []arr, int position){
        if(position>=arr.length)
            return arr;
        else{
            int lowestIndex = findLowestIndex(arr, position, position);
            int temp = arr[position];
            arr[position] = arr[lowestIndex];
            arr[lowestIndex] = temp;
            return sort(arr, ++position);
        }
    }

    public static int findLowestIndex(int []arr, int lowestIndex, int position){
        if(position >= arr.length)
            return lowestIndex;
        else{
            if(arr[lowestIndex]>arr[position]){
                lowestIndex = position;
                return findLowestIndex(arr, lowestIndex, ++position);
            }else
                return findLowestIndex(arr, lowestIndex, ++position);
        }
    }
}
