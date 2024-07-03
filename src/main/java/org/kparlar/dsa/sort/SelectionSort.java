package org.kparlar.dsa.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String args[]){

        int []arr = {64,25,12,12,11};
        int []sortedArr = sort(arr);
        Arrays.stream(sortedArr).forEach(i->System.out.print(i+" "));

    }

    public static int[] sort(int []arr){

        for(int i=0; i<arr.length;i++){
            int lowest = arr[i];
            int lowestIndex = i;
            for(int k=i+1; k<arr.length;k++){
                if(arr[k]<lowest){
                    lowest = arr[k];
                    lowestIndex = k;
                }
            }
            if(i != lowestIndex) {
                int temp = arr[i];
                arr[i] = arr[lowestIndex];
                arr[lowestIndex] = temp;
            }
        }
        return arr;
    }
}
