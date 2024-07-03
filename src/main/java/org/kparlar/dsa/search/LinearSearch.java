package org.kparlar.dsa.search;

public class LinearSearch {

    public static void main(String args[]){

        int[] arr = {10, 50, 30, 70, 80, 20, 90, 40};
        int key = 30;
        int index = search(arr, key);
        if(index > 0)
            System.out.println(String.format("Index is: %s", index));
        else
            System.out.println(String.format("Key %s is not found in the array", key));

    }

    public static int search(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key)
                return i;
        }
        return -1;
    }
}
