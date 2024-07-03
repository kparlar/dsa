package org.kparlar.dsa.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String []args){

        int []arr = {64, 34, 25, 12, 22, 11, 90};
        int []sortedArr = sort(arr);
        Arrays.stream(sortedArr).forEach(i -> System.out.print(i+" "));
    }

    public static int[] sort(int []arr){
        boolean isSwapped;
        for(int i = 0; i< arr.length;i++){
            isSwapped = false;
            for(int k=0; k< arr.length-1;k++){
                if(arr[k]>arr[k+1]){
                    int temp = arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped)
                break;
        }
        return arr;
    }
}
